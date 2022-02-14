package me.cryptopay.net;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class ApiRequest {
    private Object body;
    private final String method;
    private final String path;
    private final Map<String, String> pathParams;
    private final Map<String, String> queryParams;

    /**
     * Creates a new instance of API request.
     *
     * @param method request method (GET, POST, PATCH, DELETE)
     * @param path request path
     */
    public ApiRequest(final String method, final String path) {
        this.method = method;
        this.path = path;
        this.pathParams = new HashMap<String, String>();
        this.queryParams = new HashMap<String, String>();
    }

    /**
     * Returns request method.
     *
     * @return request method
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets request body.
     *
     * @param value request body
     */
    public void setBody(final Object value) {
        this.body = value;
    }

    /**
     * Returns request body.
     *
     * @return request body
     */
    public Object getBody() {
        return body;
    }

    /**
     * Adds query parameter.
     *
     * @param key parameter name
     * @param value parameter value
     */
    public void addQueryParam(final String key, final String value) {
        this.queryParams.put(escapeString(key), escapeString(value));
    }

    /**
     * Adds path parameter.
     *
     * @param key parameter name
     * @param value parameter value
     */
    public void addPathParam(final String key, final String value) {
        this.pathParams.put(key, escapeString(value));
    }

    /**
     * Builds full request url with path and query parameters.
     *
     * @param baseUrl API base URL e.g. https://business.cryptopay.me
     * @return full request url
     */
    public String buildUrl(final String baseUrl) {
        final StringBuilder url = new StringBuilder();

        url.append(baseUrl);

        String fullPath = path;
        for (Entry<String, String> param : pathParams.entrySet()) {
            fullPath = fullPath.replaceAll("\\{" + param.getKey() + "\\}", param.getValue());
        }
        url.append(fullPath);

        if (!queryParams.isEmpty()) {
            String prefix = "?";
            for (Entry<String, String> param : queryParams.entrySet()) {
                url.append(prefix);
                url.append(param.getKey());
                url.append("=");
                url.append(param.getValue());
                prefix = "&";
            }
        }

        return url.toString();
    }

    private String escapeString(final String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }
}
