// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import me.cryptopay.exception.ApiException;
import me.cryptopay.model.CoinListResult;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Coins {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Coins.
     *
     * @param apiClient
     */
    public Coins(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List supported coins.
     *
     * @return ListCall
     */
    public ListCall list() {
        return new ListCall();
    }

    public final class ListCall {
        private final ApiRequest request;

        private ListCall() {
            this.request = new ApiRequest("GET", "/api/coins");
        }

        /**
         * Execute list request.
         *
         * @return CoinListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CoinListResult execute() throws ApiException {
            return apiClient.execute(request, CoinListResult.class);
        }
    }
}
