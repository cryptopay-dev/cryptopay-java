// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;


import me.cryptopay.exception.ApiException;
import me.cryptopay.model.RiskParams;
import me.cryptopay.model.RiskResult;
import me.cryptopay.net.ApiClient;
import me.cryptopay.net.ApiRequest;

public class Risks {
    private final ApiClient apiClient;

    /**
     * Creates a new instance of Risks.
     *
     * @param apiClient
     */
    public Risks(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Score a coin address.
     *
     * @param riskParams
     * @return ScoreCall
     */
    public ScoreCall score(final RiskParams riskParams) {
        return new ScoreCall(riskParams);
    }

    public final class ScoreCall {
        private final ApiRequest request;

        private ScoreCall(final RiskParams riskParams) {
            this.request = new ApiRequest("POST", "/api/risks/score");
            request.setBody(riskParams);
        }

        /**
         * Execute score request.
         *
         * @return RiskResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
         *     response body
         */
        public RiskResult execute() throws ApiException {
            return apiClient.execute(request, RiskResult.class);
        }
    }
}
