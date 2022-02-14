// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import java.util.UUID;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.ExchangeTransferParams;
import me.cryptopay.model.ExchangeTransferResult;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class ExchangeTransfers {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of ExchangeTransfers.
     *
     * @param apiClient
     */
    public ExchangeTransfers(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Commit an exchange transfer.
     *
     * @param exchangeTransferId Exchange transfer ID
     * @return CommitCall
     */
    public CommitCall commit(final UUID exchangeTransferId) {
        return new CommitCall(exchangeTransferId);
    }

    /**
     * Create an exchange transfer.
     *
     * @param exchangeTransferParams
     * @return CreateCall
     */
    public CreateCall create(final ExchangeTransferParams exchangeTransferParams) {
        return new CreateCall(exchangeTransferParams);
    }

    /**
     * Retrieve an exchange transfer.
     *
     * @param exchangeTransferId Exchange transfer ID
     * @return RetrieveCall
     */
    public RetrieveCall retrieve(final UUID exchangeTransferId) {
        return new RetrieveCall(exchangeTransferId);
    }

    public final class CommitCall {
        private final ApiRequest request;

        private CommitCall(final UUID exchangeTransferId) {
            this.request =
                    new ApiRequest("POST", "/api/exchange_transfers/{exchange_transfer_id}/commit");
            request.addPathParam("exchange_transfer_id", exchangeTransferId.toString());
        }

        /**
         * Execute commit request.
         *
         * @return ExchangeTransferResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ExchangeTransferResult execute() throws ApiException {
            return apiClient.execute(request, ExchangeTransferResult.class);
        }
    }

    public final class CreateCall {
        private final ApiRequest request;

        private CreateCall(final ExchangeTransferParams exchangeTransferParams) {
            this.request = new ApiRequest("POST", "/api/exchange_transfers");
            request.setBody(exchangeTransferParams);
        }

        /**
         * Execute create request.
         *
         * @return ExchangeTransferResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ExchangeTransferResult execute() throws ApiException {
            return apiClient.execute(request, ExchangeTransferResult.class);
        }
    }

    public final class RetrieveCall {
        private final ApiRequest request;

        private RetrieveCall(final UUID exchangeTransferId) {
            this.request = new ApiRequest("GET", "/api/exchange_transfers/{exchange_transfer_id}");
            request.addPathParam("exchange_transfer_id", exchangeTransferId.toString());
        }

        /**
         * Execute retrieve request.
         *
         * @return ExchangeTransferResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public ExchangeTransferResult execute() throws ApiException {
            return apiClient.execute(request, ExchangeTransferResult.class);
        }
    }
}
