// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import me.cryptopay.exception.ApiException;
import me.cryptopay.model.RateResult;
import me.cryptopay.model.RatesResult;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Rates {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Rates.
     *
     * @param apiClient
     */
    public Rates(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve all rates.
     *
     * @return AllCall
     */
    public AllCall all() {
        return new AllCall();
    }

    /**
     * Retrieve a pair rate.
     *
     * @param baseCurrency Base currency of pair
     * @param quoteCurrency Quote currency of pair
     * @return RetrieveCall
     */
    public RetrieveCall retrieve(final String baseCurrency, final String quoteCurrency) {
        return new RetrieveCall(baseCurrency, quoteCurrency);
    }

    public final class AllCall {
        private final ApiRequest request;

        private AllCall() {
            this.request = new ApiRequest("GET", "/api/rates");
        }

        /**
         * Execute all request.
         *
         * @return RatesResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public RatesResult execute() throws ApiException {
            return apiClient.execute(request, RatesResult.class);
        }
    }

    public final class RetrieveCall {
        private final ApiRequest request;

        private RetrieveCall(final String baseCurrency, final String quoteCurrency) {
            this.request = new ApiRequest("GET", "/api/rates/{base_currency}/{quote_currency}");
            request.addPathParam("base_currency", baseCurrency.toString());
            request.addPathParam("quote_currency", quoteCurrency.toString());
        }

        /**
         * Execute retrieve request.
         *
         * @return RateResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public RateResult execute() throws ApiException {
            return apiClient.execute(request, RateResult.class);
        }
    }
}
