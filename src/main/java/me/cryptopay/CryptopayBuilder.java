package me.cryptopay;

public final class CryptopayBuilder {
    private String apiUrl = Cryptopay.API_URL_PRODUCTION;
    private String apiKey;
    private String apiSecret;
    private String callbackSecret;
    private boolean debug = false;

    /** Creates a new instance of Cryptopay builder. */
    public CryptopayBuilder() {}

    /**
     * Creates a new instance of Cryptopay client.
     *
     * @return instance of Cryptopay client
     */
    public Cryptopay build() {
        return new Cryptopay(this);
    }

    /**
     * Returns API URL.
     *
     * @return API URL
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * Sets API url.
     *
     * @param val api url
     * @return modified builder
     */
    public CryptopayBuilder apiUrl(final String val) {
        this.apiUrl = val;
        return this;
    }

    /**
     * Returns API Key.
     *
     * @return API key
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets API key.
     *
     * @param val api key
     * @return modified builder
     */
    public CryptopayBuilder apiKey(final String val) {
        this.apiKey = val;
        return this;
    }

    /**
     * Returns API secret.
     *
     * @return API secret
     */
    public String getApiSecret() {
        return apiSecret;
    }

    /**
     * Sets API secret.
     *
     * @param val api secret
     * @return modified builder
     */
    public CryptopayBuilder apiSecret(final String val) {
        this.apiSecret = val;
        return this;
    }

    /**
     * Returns callback secret.
     *
     * @return callback secret
     */
    public String getCallbackSecret() {
        return callbackSecret;
    }

    /**
     * Sets callback secret.
     *
     * @param val callback secret
     * @return modified builder
     */
    public CryptopayBuilder callbackSecret(final String val) {
        this.callbackSecret = val;
        return this;
    }

    /**
     * Check that whether debugging is enabled.
     *
     * @return true if debugging is enabled, false otherwise.
     */
    public boolean isDebug() {
        return debug;
    }

    /**
     * Enable/disable debugging.
     *
     * @param val To enable (true) or disable (false) debugging
     * @return modified builder
     */
    public CryptopayBuilder debug(final boolean val) {
        this.debug = val;
        return this;
    }
}
