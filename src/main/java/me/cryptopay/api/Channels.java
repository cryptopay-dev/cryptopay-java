// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import java.util.UUID;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.ChannelListResult;
import me.cryptopay.model.ChannelParams;
import me.cryptopay.model.ChannelPaymentListResult;
import me.cryptopay.model.ChannelPaymentResult;
import me.cryptopay.model.ChannelResult;
import me.cryptopay.model.ChannelUpdateParams;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Channels {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Channels.
     *
     * @param apiClient
     */
    public Channels(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a channel.
     *
     * @param channelParams
     * @return CreateCall
     */
    public CreateCall create(final ChannelParams channelParams) {
        return new CreateCall(channelParams);
    }

    /**
     * List channels.
     *
     * @return ListCall
     */
    public ListCall list() {
        return new ListCall();
    }

    /**
     * List channel payments.
     *
     * @param channelId Channel ID
     * @return ListPaymentsCall
     */
    public ListPaymentsCall listPayments(final UUID channelId) {
        return new ListPaymentsCall(channelId);
    }

    /**
     * Retrieve a channel.
     *
     * @param channelId Channel ID
     * @return RetrieveCall
     */
    public RetrieveCall retrieve(final UUID channelId) {
        return new RetrieveCall(channelId);
    }

    /**
     * Retrieve a channel by custom id.
     *
     * @param customId
     * @return RetrieveByCustomIdCall
     */
    public RetrieveByCustomIdCall retrieveByCustomId(final String customId) {
        return new RetrieveByCustomIdCall(customId);
    }

    /**
     * Retrieve a channel payment.
     *
     * @param channelId Channel ID
     * @param channelPaymentId Channel payment ID
     * @return RetrievePaymentCall
     */
    public RetrievePaymentCall retrievePayment(final UUID channelId, final UUID channelPaymentId) {
        return new RetrievePaymentCall(channelId, channelPaymentId);
    }

    /**
     * Update a channel.
     *
     * @param channelId Channel ID
     * @param channelUpdateParams
     * @return UpdateCall
     */
    public UpdateCall update(final UUID channelId, final ChannelUpdateParams channelUpdateParams) {
        return new UpdateCall(channelId, channelUpdateParams);
    }

    public final class CreateCall {
        private final ApiRequest request;

        private CreateCall(final ChannelParams channelParams) {
            this.request = new ApiRequest("POST", "/api/channels");
            request.setBody(channelParams);
        }

        /**
         * Execute create request.
         *
         * @return ChannelResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ChannelResult execute() throws ApiException {
            return apiClient.execute(request, ChannelResult.class);
        }
    }

    public final class ListCall {
        private final ApiRequest request;

        private ListCall() {
            this.request = new ApiRequest("GET", "/api/channels");
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
         * @return ChannelListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ChannelListResult execute() throws ApiException {
            return apiClient.execute(request, ChannelListResult.class);
        }
    }

    public final class ListPaymentsCall {
        private final ApiRequest request;

        private ListPaymentsCall(final UUID channelId) {
            this.request = new ApiRequest("GET", "/api/channels/{channel_id}/payments");
            request.addPathParam("channel_id", channelId.toString());
        }

        /**
         * Set startingAfter.
         *
         * @param startingAfter Pagination parameter. ID to start after
         * @return listPaymentsCall
         */
        public ListPaymentsCall startingAfter(final String startingAfter) {
            request.addQueryParam("starting_after", startingAfter.toString());
            return this;
        }

        /**
         * Execute listPayments request.
         *
         * @return ChannelPaymentListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ChannelPaymentListResult execute() throws ApiException {
            return apiClient.execute(request, ChannelPaymentListResult.class);
        }
    }

    public final class RetrieveCall {
        private final ApiRequest request;

        private RetrieveCall(final UUID channelId) {
            this.request = new ApiRequest("GET", "/api/channels/{channel_id}");
            request.addPathParam("channel_id", channelId.toString());
        }

        /**
         * Execute retrieve request.
         *
         * @return ChannelResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ChannelResult execute() throws ApiException {
            return apiClient.execute(request, ChannelResult.class);
        }
    }

    public final class RetrieveByCustomIdCall {
        private final ApiRequest request;

        private RetrieveByCustomIdCall(final String customId) {
            this.request = new ApiRequest("GET", "/api/channels/custom_id/{custom_id}");
            request.addPathParam("custom_id", customId.toString());
        }

        /**
         * Execute retrieveByCustomId request.
         *
         * @return ChannelResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ChannelResult execute() throws ApiException {
            return apiClient.execute(request, ChannelResult.class);
        }
    }

    public final class RetrievePaymentCall {
        private final ApiRequest request;

        private RetrievePaymentCall(final UUID channelId, final UUID channelPaymentId) {
            this.request =
                    new ApiRequest(
                            "GET", "/api/channels/{channel_id}/payments/{channel_payment_id}");
            request.addPathParam("channel_id", channelId.toString());
            request.addPathParam("channel_payment_id", channelPaymentId.toString());
        }

        /**
         * Execute retrievePayment request.
         *
         * @return ChannelPaymentResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ChannelPaymentResult execute() throws ApiException {
            return apiClient.execute(request, ChannelPaymentResult.class);
        }
    }

    public final class UpdateCall {
        private final ApiRequest request;

        private UpdateCall(final UUID channelId, final ChannelUpdateParams channelUpdateParams) {
            this.request = new ApiRequest("PATCH", "/api/channels/{channel_id}");
            request.addPathParam("channel_id", channelId.toString());
            request.setBody(channelUpdateParams);
        }

        /**
         * Execute update request.
         *
         * @return ChannelResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ChannelResult execute() throws ApiException {
            return apiClient.execute(request, ChannelResult.class);
        }
    }
}
