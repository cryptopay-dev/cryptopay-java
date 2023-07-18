// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import java.util.UUID;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.InvoiceListResult;
import me.cryptopay.model.InvoiceParams;
import me.cryptopay.model.InvoiceRecalculationParams;
import me.cryptopay.model.InvoiceRecalculationResult;
import me.cryptopay.model.InvoiceRefundListResult;
import me.cryptopay.model.InvoiceRefundParams;
import me.cryptopay.model.InvoiceRefundResult;
import me.cryptopay.model.InvoiceResult;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Invoices {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Invoices.
     *
     * @param apiClient
     */
    public Invoices(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Commit invoice recalculation.
     *
     * @param invoiceId Invoice ID
     * @param recalculationId Recalculation ID
     * @return CommitRecalculationCall
     */
    public CommitRecalculationCall commitRecalculation(
            final UUID invoiceId, final UUID recalculationId) {
        return new CommitRecalculationCall(invoiceId, recalculationId);
    }

    /**
     * Create an invoice.
     *
     * @param invoiceParams
     * @return CreateCall
     */
    public CreateCall create(final InvoiceParams invoiceParams) {
        return new CreateCall(invoiceParams);
    }

    /**
     * Create invoice recalculation.
     *
     * @param invoiceId Invoice ID
     * @param invoiceRecalculationParams
     * @return CreateRecalculationCall
     */
    public CreateRecalculationCall createRecalculation(
            final UUID invoiceId, final InvoiceRecalculationParams invoiceRecalculationParams) {
        return new CreateRecalculationCall(invoiceId, invoiceRecalculationParams);
    }

    /**
     * Create invoice refund.
     *
     * @param invoiceId Invoice ID
     * @param invoiceRefundParams
     * @return CreateRefundCall
     */
    public CreateRefundCall createRefund(
            final UUID invoiceId, final InvoiceRefundParams invoiceRefundParams) {
        return new CreateRefundCall(invoiceId, invoiceRefundParams);
    }

    /**
     * List invoices.
     *
     * @return ListCall
     */
    public ListCall list() {
        return new ListCall();
    }

    /**
     * List invoice refunds.
     *
     * @param invoiceId Invoice ID
     * @return ListRefundsCall
     */
    public ListRefundsCall listRefunds(final UUID invoiceId) {
        return new ListRefundsCall(invoiceId);
    }

    /**
     * Retrieve an invoice.
     *
     * @param invoiceId Invoice ID
     * @return RetrieveCall
     */
    public RetrieveCall retrieve(final UUID invoiceId) {
        return new RetrieveCall(invoiceId);
    }

    /**
     * Retrieve an invoice by custom_id.
     *
     * @param customId
     * @return RetrieveByCustomIdCall
     */
    public RetrieveByCustomIdCall retrieveByCustomId(final String customId) {
        return new RetrieveByCustomIdCall(customId);
    }

    public final class CommitRecalculationCall {
        private final ApiRequest request;

        private CommitRecalculationCall(final UUID invoiceId, final UUID recalculationId) {
            this.request =
                    new ApiRequest(
                            "POST",
                            "/api/invoices/{invoice_id}/recalculations/{recalculation_id}/commit");
            request.addPathParam("invoice_id", invoiceId.toString());
            request.addPathParam("recalculation_id", recalculationId.toString());
        }

        /**
         * Execute commitRecalculation request.
         *
         * @return InvoiceRecalculationResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public InvoiceRecalculationResult execute() throws ApiException {
            return apiClient.execute(request, InvoiceRecalculationResult.class);
        }
    }

    public final class CreateCall {
        private final ApiRequest request;

        private CreateCall(final InvoiceParams invoiceParams) {
            this.request = new ApiRequest("POST", "/api/invoices");
            request.setBody(invoiceParams);
        }

        /**
         * Execute create request.
         *
         * @return InvoiceResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public InvoiceResult execute() throws ApiException {
            return apiClient.execute(request, InvoiceResult.class);
        }
    }

    public final class CreateRecalculationCall {
        private final ApiRequest request;

        private CreateRecalculationCall(
                final UUID invoiceId, final InvoiceRecalculationParams invoiceRecalculationParams) {
            this.request = new ApiRequest("POST", "/api/invoices/{invoice_id}/recalculations");
            request.addPathParam("invoice_id", invoiceId.toString());
            request.setBody(invoiceRecalculationParams);
        }

        /**
         * Execute createRecalculation request.
         *
         * @return InvoiceRecalculationResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public InvoiceRecalculationResult execute() throws ApiException {
            return apiClient.execute(request, InvoiceRecalculationResult.class);
        }
    }

    public final class CreateRefundCall {
        private final ApiRequest request;

        private CreateRefundCall(
                final UUID invoiceId, final InvoiceRefundParams invoiceRefundParams) {
            this.request = new ApiRequest("POST", "/api/invoices/{invoice_id}/refunds");
            request.addPathParam("invoice_id", invoiceId.toString());
            request.setBody(invoiceRefundParams);
        }

        /**
         * Execute createRefund request.
         *
         * @return InvoiceRefundResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public InvoiceRefundResult execute() throws ApiException {
            return apiClient.execute(request, InvoiceRefundResult.class);
        }
    }

    public final class ListCall {
        private final ApiRequest request;

        private ListCall() {
            this.request = new ApiRequest("GET", "/api/invoices");
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
         * Set subscriptionId.
         *
         * @param subscriptionId
         * @return listCall
         */
        public ListCall subscriptionId(final String subscriptionId) {
            request.addQueryParam("subscription_id", subscriptionId.toString());
            return this;
        }

        /**
         * Execute list request.
         *
         * @return InvoiceListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public InvoiceListResult execute() throws ApiException {
            return apiClient.execute(request, InvoiceListResult.class);
        }
    }

    public final class ListRefundsCall {
        private final ApiRequest request;

        private ListRefundsCall(final UUID invoiceId) {
            this.request = new ApiRequest("GET", "/api/invoices/{invoice_id}/refunds");
            request.addPathParam("invoice_id", invoiceId.toString());
        }

        /**
         * Execute listRefunds request.
         *
         * @return InvoiceRefundListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public InvoiceRefundListResult execute() throws ApiException {
            return apiClient.execute(request, InvoiceRefundListResult.class);
        }
    }

    public final class RetrieveCall {
        private final ApiRequest request;

        private RetrieveCall(final UUID invoiceId) {
            this.request = new ApiRequest("GET", "/api/invoices/{invoice_id}");
            request.addPathParam("invoice_id", invoiceId.toString());
        }

        /**
         * Execute retrieve request.
         *
         * @return InvoiceResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public InvoiceResult execute() throws ApiException {
            return apiClient.execute(request, InvoiceResult.class);
        }
    }

    public final class RetrieveByCustomIdCall {
        private final ApiRequest request;

        private RetrieveByCustomIdCall(final String customId) {
            this.request = new ApiRequest("GET", "/api/invoices/custom_id/{custom_id}");
            request.addPathParam("custom_id", customId.toString());
        }

        /**
         * Execute retrieveByCustomId request.
         *
         * @return InvoiceResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public InvoiceResult execute() throws ApiException {
            return apiClient.execute(request, InvoiceResult.class);
        }
    }
}
