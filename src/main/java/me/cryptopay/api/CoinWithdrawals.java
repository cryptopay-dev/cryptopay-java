// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import java.util.UUID;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.CoinWithdrawalListResult;
import me.cryptopay.model.CoinWithdrawalParams;
import me.cryptopay.model.CoinWithdrawalResult;
import me.cryptopay.model.NetworkFeeListResult;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class CoinWithdrawals {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of CoinWithdrawals.
     *
     * @param apiClient
     */
    public CoinWithdrawals(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Commit a withdrawal.
     *
     * @param coinWithdrawalId Coin withdrawal ID
     * @return CommitCall
     */
    public CommitCall commit(final UUID coinWithdrawalId) {
        return new CommitCall(coinWithdrawalId);
    }

    /**
     * Create a withdrawal.
     *
     * @param coinWithdrawalParams
     * @return CreateCall
     * @see <a href="https://developers.cryptopay.me/guides/payouts/create-a-coin-withdrawal">Create
     *     a withdrawal Documentation</a>
     */
    public CreateCall create(final CoinWithdrawalParams coinWithdrawalParams) {
        return new CreateCall(coinWithdrawalParams);
    }

    /**
     * List withdrawals.
     *
     * @return ListCall
     */
    public ListCall list() {
        return new ListCall();
    }

    /**
     * List network fees.
     *
     * @return ListNetworkFeesCall
     */
    public ListNetworkFeesCall listNetworkFees() {
        return new ListNetworkFeesCall();
    }

    /**
     * Retrieve a withdrawal.
     *
     * @param coinWithdrawalId Coin withdrawal ID
     * @return RetrieveCall
     */
    public RetrieveCall retrieve(final UUID coinWithdrawalId) {
        return new RetrieveCall(coinWithdrawalId);
    }

    /**
     * Retrieve a withdrawal by custom id.
     *
     * @param customId
     * @return RetrieveByCustomIdCall
     */
    public RetrieveByCustomIdCall retrieveByCustomId(final String customId) {
        return new RetrieveByCustomIdCall(customId);
    }

    public final class CommitCall {
        private final ApiRequest request;

        private CommitCall(final UUID coinWithdrawalId) {
            this.request =
                    new ApiRequest("POST", "/api/coin_withdrawals/{coin_withdrawal_id}/commit");
            request.addPathParam("coin_withdrawal_id", coinWithdrawalId.toString());
        }

        /**
         * Execute commit request.
         *
         * @return CoinWithdrawalResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CoinWithdrawalResult execute() throws ApiException {
            return apiClient.execute(request, CoinWithdrawalResult.class);
        }
    }

    public final class CreateCall {
        private final ApiRequest request;

        private CreateCall(final CoinWithdrawalParams coinWithdrawalParams) {
            this.request = new ApiRequest("POST", "/api/coin_withdrawals");
            request.setBody(coinWithdrawalParams);
        }

        /**
         * Execute create request.
         *
         * @return CoinWithdrawalResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CoinWithdrawalResult execute() throws ApiException {
            return apiClient.execute(request, CoinWithdrawalResult.class);
        }
    }

    public final class ListCall {
        private final ApiRequest request;

        private ListCall() {
            this.request = new ApiRequest("GET", "/api/coin_withdrawals");
        }

        /**
         * Set customerId.
         *
         * @param customerId The internal ID of your customer that the transaction relates to
         * @return listCall
         */
        public ListCall customerId(final String customerId) {
            request.addQueryParam("customer_id", customerId.toString());
            return this;
        }

        /**
         * Set startingAfter.
         *
         * @param startingAfter Pagination parameter. ID to start after
         * @return listCall
         */
        public ListCall startingAfter(final String startingAfter) {
            request.addQueryParam("starting_after", startingAfter.toString());
            return this;
        }

        /**
         * Execute list request.
         *
         * @return CoinWithdrawalListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CoinWithdrawalListResult execute() throws ApiException {
            return apiClient.execute(request, CoinWithdrawalListResult.class);
        }
    }

    public final class ListNetworkFeesCall {
        private final ApiRequest request;

        private ListNetworkFeesCall() {
            this.request = new ApiRequest("GET", "/api/coin_withdrawals/network_fees");
        }

        /**
         * Execute listNetworkFees request.
         *
         * @return NetworkFeeListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public NetworkFeeListResult execute() throws ApiException {
            return apiClient.execute(request, NetworkFeeListResult.class);
        }
    }

    public final class RetrieveCall {
        private final ApiRequest request;

        private RetrieveCall(final UUID coinWithdrawalId) {
            this.request = new ApiRequest("GET", "/api/coin_withdrawals/{coin_withdrawal_id}");
            request.addPathParam("coin_withdrawal_id", coinWithdrawalId.toString());
        }

        /**
         * Execute retrieve request.
         *
         * @return CoinWithdrawalResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CoinWithdrawalResult execute() throws ApiException {
            return apiClient.execute(request, CoinWithdrawalResult.class);
        }
    }

    public final class RetrieveByCustomIdCall {
        private final ApiRequest request;

        private RetrieveByCustomIdCall(final String customId) {
            this.request = new ApiRequest("GET", "/api/coin_withdrawals/custom_id/{custom_id}");
            request.addPathParam("custom_id", customId.toString());
        }

        /**
         * Execute retrieveByCustomId request.
         *
         * @return CoinWithdrawalResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CoinWithdrawalResult execute() throws ApiException {
            return apiClient.execute(request, CoinWithdrawalResult.class);
        }
    }
}
