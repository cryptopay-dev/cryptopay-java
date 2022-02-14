package me.cryptopay.net;


import java.net.URI;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import me.cryptopay.exception.ApiException;
import me.cryptopay.security.HmacEncoder;
import me.cryptopay.util.HttpHeaders;
import me.cryptopay.util.StringUtils;

/** Adds HMAC signature and related headers to a request. */
public class Authentication {
    private static final String SCHEME = "HMAC";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.RFC_1123_DATE_TIME;

    private final String apiKey;
    private final String apiSecret;

    /**
     * Creates a new instance.
     *
     * @param apiKey API key
     * @param apiSecret API secret
     */
    public Authentication(final String apiKey, final String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    /**
     * Adds HMAC-related headers to the list of headers.
     *
     * @param method method of the request
     * @param uri URI of the request
     * @param body body of the request
     * @param headers headers
     * @throws ApiException
     */
    public void apply(
            final String method,
            final URI uri,
            final String body,
            final Map<String, String> headers)
            throws ApiException {
        HmacEncoder.Data data = new HmacEncoder.Data();
        data.setSecret(apiSecret);
        data.setMethod(method);
        data.setBody(body);

        String date =
                ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC).format(DATE_FORMATTER);
        data.setDate(date);

        String path = uri.getPath();
        String query = uri.getQuery();
        if (!StringUtils.isEmpty(query)) {
            path = String.format("%s?%s", path, query);
        }

        data.setPath(path);
        data.setContentType(headers.get(HttpHeaders.CONTENT_TYPE));

        String signature;

        try {
            signature = HmacEncoder.encodeRequest(data);
        } catch (Exception e) {
            throw new ApiException(e);
        }

        headers.put(HttpHeaders.DATE, date);
        headers.put(
                HttpHeaders.AUTHORIZATION, String.format("%s %s:%s", SCHEME, apiKey, signature));
    }
}
