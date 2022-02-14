// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import java.util.UUID;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.AccountListResult;
import me.cryptopay.model.TransactionListResult;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Accounts {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Accounts.
     *
     * @param apiClient
     */
    public Accounts(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List accounts.
     *
     * @return ListCall
     */
    public ListCall list() {
        return new ListCall();
    }

    /**
     * List account transactions.
     *
     * @param accountId Account ID
     * @return ListTransactionsCall
     */
    public ListTransactionsCall listTransactions(final UUID accountId) {
        return new ListTransactionsCall(accountId);
    }

    public final class ListCall {
        private final ApiRequest request;

        private ListCall() {
            this.request = new ApiRequest("GET", "/api/accounts");
        }

        /**
         * Execute list request.
         *
         * @return AccountListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public AccountListResult execute() throws ApiException {
            return apiClient.execute(request, AccountListResult.class);
        }
    }

    public final class ListTransactionsCall {
        private final ApiRequest request;

        private ListTransactionsCall(final UUID accountId) {
            this.request = new ApiRequest("GET", "/api/accounts/{account_id}/transactions");
            request.addPathParam("account_id", accountId.toString());
        }

        /**
         * Set startingAfter.
         *
         * @param startingAfter Pagination parameter. ID to start after
         * @return listTransactionsCall
         */
        public ListTransactionsCall startingAfter(final String startingAfter) {
            request.addQueryParam("starting_after", startingAfter.toString());
            return this;
        }

        /**
         * Execute listTransactions request.
         *
         * @return TransactionListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public TransactionListResult execute() throws ApiException {
            return apiClient.execute(request, TransactionListResult.class);
        }
    }
}
