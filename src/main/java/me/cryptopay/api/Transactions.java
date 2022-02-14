// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import java.time.OffsetDateTime;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.RiskLevel;
import me.cryptopay.model.TransactionListResult;
import me.cryptopay.model.TransactionReferenceType;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Transactions {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Transactions.
     *
     * @param apiClient
     */
    public Transactions(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List transactions.
     *
     * @return ListCall
     */
    public ListCall list() {
        return new ListCall();
    }

    public final class ListCall {
        private final ApiRequest request;

        private ListCall() {
            this.request = new ApiRequest("GET", "/api/transactions");
        }

        /**
         * Set createdAtFrom.
         *
         * @param createdAtFrom Date and time in iso8601 format
         * @return listCall
         */
        public ListCall createdAtFrom(final OffsetDateTime createdAtFrom) {
            request.addQueryParam("created_at_from", createdAtFrom.toString());
            return this;
        }

        /**
         * Set createdAtTo.
         *
         * @param createdAtTo Date and time in iso8601 format
         * @return listCall
         */
        public ListCall createdAtTo(final OffsetDateTime createdAtTo) {
            request.addQueryParam("created_at_to", createdAtTo.toString());
            return this;
        }

        /**
         * Set referenceType.
         *
         * @param referenceType Transaction reference type
         * @return listCall
         */
        public ListCall referenceType(final TransactionReferenceType referenceType) {
            request.addQueryParam("reference_type", referenceType.toString());
            return this;
        }

        /**
         * Set currency.
         *
         * @param currency Transaction currency
         * @return listCall
         */
        public ListCall currency(final String currency) {
            request.addQueryParam("currency", currency.toString());
            return this;
        }

        /**
         * Set status.
         *
         * @param status Transaction status
         * @return listCall
         */
        public ListCall status(final String status) {
            request.addQueryParam("status", status.toString());
            return this;
        }

        /**
         * Set riskLevel.
         *
         * @param riskLevel Transaction risk level
         * @return listCall
         */
        public ListCall riskLevel(final RiskLevel riskLevel) {
            request.addQueryParam("risk_level", riskLevel.toString());
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
         * @return TransactionListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public TransactionListResult execute() throws ApiException {
            return apiClient.execute(request, TransactionListResult.class);
        }
    }
}
