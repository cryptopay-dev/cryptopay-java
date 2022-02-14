package me.cryptopay;


import me.cryptopay.api.Accounts;
import me.cryptopay.api.Channels;
import me.cryptopay.api.CoinWithdrawals;
import me.cryptopay.api.Customers;
import me.cryptopay.api.ExchangeTransfers;
import me.cryptopay.api.Invoices;
import me.cryptopay.api.Rates;
import me.cryptopay.api.Risks;
import me.cryptopay.api.Transactions;
import me.cryptopay.callback.CallbackParser;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.Authentication;
import me.cryptopay.security.HmacValidator;

public final class Cryptopay {
    /** Callback signature HTTP-header's name. */
    public static final String CALLBACK_SIGNATURE_HEADER = "X-Cryptopay-Signature";

    /** API URL for production environment. */
    public static final String API_URL_PRODUCTION = "https://business.cryptopay.me";

    /** API URL for sandbox environment. */
    public static final String API_URL_SANDBOX = "https://business-sandbox.cryptopay.me";

    private static final String USER_AGENT = "Cryptopay Java %s";
    private static final String VERSION = "0.0.2";

    private final ApiClient apiClient;
    private final JSON json;

    private final Accounts accounts;
    private final Channels channels;
    private final CoinWithdrawals coinWithdrawals;
    private final Customers customers;
    private final ExchangeTransfers exchangeTransfers;
    private final Invoices invoices;
    private final Rates rates;
    private final Risks risks;
    private final Transactions transactions;
    private final CallbackParser callbacks;

    /**
     * Creates a new instance of Cryptopay client.
     *
     * @param builder Cryptopay builder
     */
    public Cryptopay(final CryptopayBuilder builder) {
        Authentication auth = new Authentication(builder.getApiKey(), builder.getApiSecret());

        this.json = new JSON();
        this.apiClient =
                new ApiClient(
                        builder.getApiUrl(),
                        auth,
                        json,
                        builder.isDebug(),
                        String.format(USER_AGENT, VERSION));

        this.accounts = new Accounts(apiClient);
        this.channels = new Channels(apiClient);
        this.coinWithdrawals = new CoinWithdrawals(apiClient);
        this.customers = new Customers(apiClient);
        this.exchangeTransfers = new ExchangeTransfers(apiClient);
        this.invoices = new Invoices(apiClient);
        this.rates = new Rates(apiClient);
        this.risks = new Risks(apiClient);
        this.transactions = new Transactions(apiClient);

        this.callbacks = new CallbackParser(new HmacValidator(builder.getCallbackSecret()), json);
    }

    /**
     * Creates a new instance of Cryptopay builder.
     *
     * @return builder
     */
    public static CryptopayBuilder builder() {
        return new CryptopayBuilder();
    }

    /**
     * Returns accounts API.
     *
     * @return accounts API
     */
    public Accounts accounts() {
        return this.accounts;
    }

    /**
     * Returns channels API.
     *
     * @return channels API
     */
    public Channels channels() {
        return this.channels;
    }

    /**
     * Returns coinWithdrawals API.
     *
     * @return coinWithdrawals API
     */
    public CoinWithdrawals coinWithdrawals() {
        return this.coinWithdrawals;
    }

    /**
     * Returns customers API.
     *
     * @return customers API
     */
    public Customers customers() {
        return this.customers;
    }

    /**
     * Returns exchangeTransfers API.
     *
     * @return exchangeTransfers API
     */
    public ExchangeTransfers exchangeTransfers() {
        return this.exchangeTransfers;
    }

    /**
     * Returns invoices API.
     *
     * @return invoices API
     */
    public Invoices invoices() {
        return this.invoices;
    }

    /**
     * Returns rates API.
     *
     * @return rates API
     */
    public Rates rates() {
        return this.rates;
    }

    /**
     * Returns risks API.
     *
     * @return risks API
     */
    public Risks risks() {
        return this.risks;
    }

    /**
     * Returns transactions API.
     *
     * @return transactions API
     */
    public Transactions transactions() {
        return this.transactions;
    }

    /**
     * Returns callback parser.
     *
     * @return callback parser
     */
    public CallbackParser callbacks() {
        return this.callbacks;
    }
}
