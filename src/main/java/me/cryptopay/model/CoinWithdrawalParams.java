// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public final class CoinWithdrawalParams {
    @SerializedName("address")
    private String address;

    @SerializedName("charged_currency")
    private String chargedCurrency;

    @SerializedName("received_currency")
    private String receivedCurrency;

    @SerializedName("network")
    private String network;

    @SerializedName("charged_amount")
    private BigDecimal chargedAmount;

    @SerializedName("charged_amount_to_send")
    private BigDecimal chargedAmountToSend;

    @SerializedName("received_amount")
    private BigDecimal receivedAmount;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("customer_id")
    private String customerId;

    @SerializedName("network_fee_level")
    private NetworkFeeLevel networkFeeLevel;

    @SerializedName("force_commit")
    private Boolean forceCommit;

    @SerializedName("travel_rule_compliant")
    private Boolean travelRuleCompliant;

    @SerializedName("beneficiary")
    private Beneficiary beneficiary;

    /** Creates a new instance of CoinWithdrawalParams. */
    public CoinWithdrawalParams() {}

    /**
     * Get address.
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.
     *
     * @param address address
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Get chargedCurrency.
     *
     * @return chargedCurrency
     */
    public String getChargedCurrency() {
        return chargedCurrency;
    }

    /**
     * Set chargedCurrency.
     *
     * @param chargedCurrency chargedCurrency
     */
    public void setChargedCurrency(final String chargedCurrency) {
        this.chargedCurrency = chargedCurrency;
    }

    /**
     * Get receivedCurrency.
     *
     * @return receivedCurrency
     */
    public String getReceivedCurrency() {
        return receivedCurrency;
    }

    /**
     * Set receivedCurrency.
     *
     * @param receivedCurrency receivedCurrency
     */
    public void setReceivedCurrency(final String receivedCurrency) {
        this.receivedCurrency = receivedCurrency;
    }

    /**
     * Get network.
     *
     * @return network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Set network.
     *
     * @param network network
     */
    public void setNetwork(final String network) {
        this.network = network;
    }

    /**
     * Get chargedAmount.
     *
     * @return chargedAmount
     */
    public BigDecimal getChargedAmount() {
        return chargedAmount;
    }

    /**
     * Set chargedAmount.
     *
     * @param chargedAmount chargedAmount
     */
    public void setChargedAmount(final BigDecimal chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    /**
     * Get chargedAmountToSend.
     *
     * @return chargedAmountToSend
     */
    public BigDecimal getChargedAmountToSend() {
        return chargedAmountToSend;
    }

    /**
     * Set chargedAmountToSend.
     *
     * @param chargedAmountToSend chargedAmountToSend
     */
    public void setChargedAmountToSend(final BigDecimal chargedAmountToSend) {
        this.chargedAmountToSend = chargedAmountToSend;
    }

    /**
     * Get receivedAmount.
     *
     * @return receivedAmount
     */
    public BigDecimal getReceivedAmount() {
        return receivedAmount;
    }

    /**
     * Set receivedAmount.
     *
     * @param receivedAmount receivedAmount
     */
    public void setReceivedAmount(final BigDecimal receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    /**
     * Get customId.
     *
     * @return customId
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * Set customId.
     *
     * @param customId customId
     */
    public void setCustomId(final String customId) {
        this.customId = customId;
    }

    /**
     * Get customerId.
     *
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Set customerId.
     *
     * @param customerId customerId
     */
    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    /**
     * Get networkFeeLevel.
     *
     * @return networkFeeLevel
     */
    public NetworkFeeLevel getNetworkFeeLevel() {
        return networkFeeLevel;
    }

    /**
     * Set networkFeeLevel.
     *
     * @param networkFeeLevel networkFeeLevel
     */
    public void setNetworkFeeLevel(final NetworkFeeLevel networkFeeLevel) {
        this.networkFeeLevel = networkFeeLevel;
    }

    /**
     * Get forceCommit.
     *
     * @return forceCommit
     */
    public Boolean getForceCommit() {
        return forceCommit;
    }

    /**
     * Set forceCommit.
     *
     * @param forceCommit forceCommit
     */
    public void setForceCommit(final Boolean forceCommit) {
        this.forceCommit = forceCommit;
    }

    /**
     * Get travelRuleCompliant.
     *
     * @return travelRuleCompliant
     */
    public Boolean getTravelRuleCompliant() {
        return travelRuleCompliant;
    }

    /**
     * Set travelRuleCompliant.
     *
     * @param travelRuleCompliant travelRuleCompliant
     */
    public void setTravelRuleCompliant(final Boolean travelRuleCompliant) {
        this.travelRuleCompliant = travelRuleCompliant;
    }

    /**
     * Get beneficiary.
     *
     * @return beneficiary
     */
    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    /**
     * Set beneficiary.
     *
     * @param beneficiary beneficiary
     */
    public void setBeneficiary(final Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoinWithdrawalParams(");
        sb.append("address=").append(address).append(", ");
        sb.append("chargedCurrency=").append(chargedCurrency).append(", ");
        sb.append("receivedCurrency=").append(receivedCurrency).append(", ");
        sb.append("network=").append(network).append(", ");
        sb.append("chargedAmount=").append(chargedAmount).append(", ");
        sb.append("chargedAmountToSend=").append(chargedAmountToSend).append(", ");
        sb.append("receivedAmount=").append(receivedAmount).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("customerId=").append(customerId).append(", ");
        sb.append("networkFeeLevel=").append(networkFeeLevel).append(", ");
        sb.append("forceCommit=").append(forceCommit).append(", ");
        sb.append("travelRuleCompliant=").append(travelRuleCompliant).append(", ");
        sb.append("beneficiary=").append(beneficiary);
        sb.append(")");
        return sb.toString();
    }
}
