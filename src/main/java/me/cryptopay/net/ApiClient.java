package me.cryptopay.net;


import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import me.cryptopay.JSON;
import me.cryptopay.exception.ApiException;
import me.cryptopay.util.HttpHeaders;
import me.cryptopay.util.StringUtils;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;

public class ApiClient {
    private static final String CONTENT_TYPE = "application/json";

    private final Authentication authentication;
    private final JSON json;
    private final OkHttpClient httpClient;
    private final String baseUrl;
    private final String userAgent;

    /**
     * Creates a new instance of ApiClent.
     *
     * @param baseUrl Base URL for API calls, e.g. https://business.cryptopay.me
     * @param authentication HMAC authenticator
     * @param json JSON encoder/decoder
     * @param debug Whether to log requests/responses
     * @param userAgent Value of User-Agent header
     */
    public ApiClient(
            final String baseUrl,
            final Authentication authentication,
            final JSON json,
            final boolean debug,
            final String userAgent) {
        this.baseUrl = baseUrl;
        this.authentication = authentication;
        this.json = json;
        this.userAgent = userAgent;

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        if (debug) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(Level.BODY);
            builder.addInterceptor(httpLoggingInterceptor);
        }

        this.httpClient = builder.build();
    }

    /**
     * {@link #execute(ApiRequest, Type)}.
     *
     * @param <T> Type
     * @param apiRequest API Request
     * @return T Java object deserialized from response body that would be null when returnType is
     *     null.
     * @throws ApiException If fail to execute the call
     */
    public <T> T execute(final ApiRequest apiRequest) throws ApiException {
        return execute(apiRequest, null);
    }

    /**
     * Execute API request and deserialize the HTTP response body into the given return type.
     *
     * @param <T> The return type corresponding to (same with) returnType
     * @param apiRequest API Request
     * @param returnType The return type used to deserialize HTTP response body
     * @return T Java object deserialized from response body that would be null when returnType is
     *     null.
     * @throws ApiException If fail to execute the call
     */
    public <T> T execute(final ApiRequest apiRequest, final Class<T> returnType)
            throws ApiException {
        String url = apiRequest.buildUrl(baseUrl);
        String content = buildRequestContent(apiRequest);

        Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpHeaders.CONTENT_TYPE, CONTENT_TYPE);
        headers.put(HttpHeaders.USER_AGENT, userAgent);

        authentication.apply(apiRequest.getMethod(), URI.create(url), content, headers);

        RequestBody reqBody = null;
        if (content != null) {
            reqBody = RequestBody.create(content.getBytes());
        }

        Request.Builder reqBuilder =
                new Request.Builder().url(url).method(apiRequest.getMethod(), reqBody);

        for (Entry<String, String> param : headers.entrySet()) {
            reqBuilder.header(param.getKey(), param.getValue());
        }

        Call call = httpClient.newCall(reqBuilder.build());

        return execute(call, returnType);
    }

    private <T> T execute(final Call call, final Class<T> returnType) throws ApiException {
        try (Response response = call.execute()) {
            return handleResponse(response, returnType);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    private String buildRequestContent(final ApiRequest apiRequest) {
        if (!HttpMethod.permitsRequestBody(apiRequest.getMethod())) {
            return null;
        }

        String content;
        if (apiRequest.getBody() == null) {
            return StringUtils.EMPTY;
        } else {
            return json.serialize(apiRequest.getBody());
        }
    }

    private <T> T handleResponse(final Response response, final Class<T> returnType)
            throws ApiException, IOException {
        String respBody = response.body() == null ? null : response.body().string();

        if (!response.isSuccessful()) {
            throw new ApiException(
                    response.request().method(),
                    response.request().url().toString(),
                    response.code(),
                    respBody);
        }

        if (returnType == null || StringUtils.isEmpty(respBody)) {
            return null;
        }

        return json.deserialize(respBody, returnType);
    }
}
