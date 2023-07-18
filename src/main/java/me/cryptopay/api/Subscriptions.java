// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import java.util.UUID;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.SubscriptionListResult;
import me.cryptopay.model.SubscriptionParams;
import me.cryptopay.model.SubscriptionResult;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Subscriptions {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Subscriptions.
     *
     * @param apiClient
     */
    public Subscriptions(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancel a subscription.
     *
     * @param subscriptionId Subscription ID
     * @return CancelCall
     */
    public CancelCall cancel(final UUID subscriptionId) {
        return new CancelCall(subscriptionId);
    }

    /**
     * Create a subscription.
     *
     * @param subscriptionParams
     * @return CreateCall
     */
    public CreateCall create(final SubscriptionParams subscriptionParams) {
        return new CreateCall(subscriptionParams);
    }

    /**
     * List subscriptions.
     *
     * @return ListCall
     */
    public ListCall list() {
        return new ListCall();
    }

    /**
     * Retrieve a subscription.
     *
     * @param subscriptionId Subscription ID
     * @return RetrieveCall
     */
    public RetrieveCall retrieve(final UUID subscriptionId) {
        return new RetrieveCall(subscriptionId);
    }

    /**
     * Retrieve a subscription by custom_id.
     *
     * @param customId
     * @return RetrieveByCustomIdCall
     */
    public RetrieveByCustomIdCall retrieveByCustomId(final String customId) {
        return new RetrieveByCustomIdCall(customId);
    }

    public final class CancelCall {
        private final ApiRequest request;

        private CancelCall(final UUID subscriptionId) {
            this.request = new ApiRequest("POST", "/api/subscriptions/{subscription_id}/cancel");
            request.addPathParam("subscription_id", subscriptionId.toString());
        }

        /**
         * Execute cancel request.
         *
         * @return SubscriptionResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public SubscriptionResult execute() throws ApiException {
            return apiClient.execute(request, SubscriptionResult.class);
        }
    }

    public final class CreateCall {
        private final ApiRequest request;

        private CreateCall(final SubscriptionParams subscriptionParams) {
            this.request = new ApiRequest("POST", "/api/subscriptions");
            request.setBody(subscriptionParams);
        }

        /**
         * Execute create request.
         *
         * @return SubscriptionResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public SubscriptionResult execute() throws ApiException {
            return apiClient.execute(request, SubscriptionResult.class);
        }
    }

    public final class ListCall {
        private final ApiRequest request;

        private ListCall() {
            this.request = new ApiRequest("GET", "/api/subscriptions");
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
         * @return SubscriptionListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public SubscriptionListResult execute() throws ApiException {
            return apiClient.execute(request, SubscriptionListResult.class);
        }
    }

    public final class RetrieveCall {
        private final ApiRequest request;

        private RetrieveCall(final UUID subscriptionId) {
            this.request = new ApiRequest("GET", "/api/subscriptions/{subscription_id}");
            request.addPathParam("subscription_id", subscriptionId.toString());
        }

        /**
         * Execute retrieve request.
         *
         * @return SubscriptionResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public SubscriptionResult execute() throws ApiException {
            return apiClient.execute(request, SubscriptionResult.class);
        }
    }

    public final class RetrieveByCustomIdCall {
        private final ApiRequest request;

        private RetrieveByCustomIdCall(final String customId) {
            this.request = new ApiRequest("GET", "/api/subscriptions/custom_id/{custom_id}");
            request.addPathParam("custom_id", customId.toString());
        }

        /**
         * Execute retrieveByCustomId request.
         *
         * @return SubscriptionResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public SubscriptionResult execute() throws ApiException {
            return apiClient.execute(request, SubscriptionResult.class);
        }
    }
}
