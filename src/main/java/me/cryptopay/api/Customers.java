// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import me.cryptopay.exception.ApiException;
import me.cryptopay.model.CustomerListResult;
import me.cryptopay.model.CustomerParams;
import me.cryptopay.model.CustomerResult;
import me.cryptopay.model.CustomerUpdateParams;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Customers {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Customers.
     *
     * @param apiClient
     */
    public Customers(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a customer.
     *
     * @param customerParams
     * @return CreateCall
     */
    public CreateCall create(final CustomerParams customerParams) {
        return new CreateCall(customerParams);
    }

    /**
     * List customers.
     *
     * @return ListCall
     */
    public ListCall list() {
        return new ListCall();
    }

    /**
     * Retrieve a customer.
     *
     * @param customerId The customer&#39;s reference ID in your system
     * @return RetrieveCall
     */
    public RetrieveCall retrieve(final String customerId) {
        return new RetrieveCall(customerId);
    }

    /**
     * Update a customer.
     *
     * @param customerId The customer&#39;s reference ID in your system
     * @param customerUpdateParams
     * @return UpdateCall
     */
    public UpdateCall update(
            final String customerId, final CustomerUpdateParams customerUpdateParams) {
        return new UpdateCall(customerId, customerUpdateParams);
    }

    public final class CreateCall {
        private final ApiRequest request;

        private CreateCall(final CustomerParams customerParams) {
            this.request = new ApiRequest("POST", "/api/customers");
            request.setBody(customerParams);
        }

        /**
         * Execute create request.
         *
         * @return CustomerResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CustomerResult execute() throws ApiException {
            return apiClient.execute(request, CustomerResult.class);
        }
    }

    public final class ListCall {
        private final ApiRequest request;

        private ListCall() {
            this.request = new ApiRequest("GET", "/api/customers");
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
         * @return CustomerListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CustomerListResult execute() throws ApiException {
            return apiClient.execute(request, CustomerListResult.class);
        }
    }

    public final class RetrieveCall {
        private final ApiRequest request;

        private RetrieveCall(final String customerId) {
            this.request = new ApiRequest("GET", "/api/customers/{customer_id}");
            request.addPathParam("customer_id", customerId.toString());
        }

        /**
         * Execute retrieve request.
         *
         * @return CustomerResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CustomerResult execute() throws ApiException {
            return apiClient.execute(request, CustomerResult.class);
        }
    }

    public final class UpdateCall {
        private final ApiRequest request;

        private UpdateCall(
                final String customerId, final CustomerUpdateParams customerUpdateParams) {
            this.request = new ApiRequest("PATCH", "/api/customers/{customer_id}");
            request.addPathParam("customer_id", customerId.toString());
            request.setBody(customerUpdateParams);
        }

        /**
         * Execute update request.
         *
         * @return CustomerResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public CustomerResult execute() throws ApiException {
            return apiClient.execute(request, CustomerResult.class);
        }
    }
}
