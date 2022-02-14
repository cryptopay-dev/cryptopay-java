// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public final class ExchangeTransferParams {
    @SerializedName("charged_currency")
    private String chargedCurrency;

    @SerializedName("charged_amount")
    private BigDecimal chargedAmount;

    @SerializedName("received_currency")
    private String receivedCurrency;

    @SerializedName("received_amount")
    private BigDecimal receivedAmount;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("force_commit")
    private Boolean forceCommit;

    /** Creates a new instance of ExchangeTransferParams. */
    public ExchangeTransferParams() {}

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExchangeTransferParams(");
        sb.append("chargedCurrency=").append(chargedCurrency).append(", ");
        sb.append("chargedAmount=").append(chargedAmount).append(", ");
        sb.append("receivedCurrency=").append(receivedCurrency).append(", ");
        sb.append("receivedAmount=").append(receivedAmount).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("forceCommit=").append(forceCommit);
        sb.append(")");
        return sb.toString();
    }
}
