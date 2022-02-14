package me.cryptopay.exception;

public class ApiException extends RuntimeException {
    private int code = 0;
    private String responseBody = null;

    /** Constructor for ApiException. */
    public ApiException() {}

    /**
     * Constructor for ApiException.
     *
     * @param throwable a {@link java.lang.Throwable} object
     */
    public ApiException(final Throwable throwable) {
        super(throwable);
    }

    /**
     * Constructor for ApiException.
     *
     * @param method Request method (GET, POST, PATCH, DELETE)
     * @param url Request url
     * @param code HTTP status code
     * @param responseBody the response body
     */
    public ApiException(
            final String method, final String url, final int code, final String responseBody) {
        super(String.format("[%s] %s: %s - %s", method, url, code, responseBody));

        this.code = code;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }
}
