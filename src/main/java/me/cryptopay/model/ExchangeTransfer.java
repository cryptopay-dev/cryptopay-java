// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.UUID;

public final class ExchangeTransfer {
    @SerializedName("id")
    private UUID id;

    @SerializedName("charged_amount")
    private BigDecimal chargedAmount;

    @SerializedName("charged_currency")
    private String chargedCurrency;

    @SerializedName("received_amount")
    private BigDecimal receivedAmount;

    @SerializedName("received_currency")
    private String receivedCurrency;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("exchange")
    private Exchange exchange;

    /** Creates a new instance of ExchangeTransfer. */
    public ExchangeTransfer() {}

    /**
     * Get id.
     *
     * @return id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Set id.
     *
     * @param id id
     */
    public void setId(final UUID id) {
        this.id = id;
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
     * Get exchange.
     *
     * @return exchange
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Set exchange.
     *
     * @param exchange exchange
     */
    public void setExchange(final Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExchangeTransfer(");
        sb.append("id=").append(id).append(", ");
        sb.append("chargedAmount=").append(chargedAmount).append(", ");
        sb.append("chargedCurrency=").append(chargedCurrency).append(", ");
        sb.append("receivedAmount=").append(receivedAmount).append(", ");
        sb.append("receivedCurrency=").append(receivedCurrency).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("exchange=").append(exchange);
        sb.append(")");
        return sb.toString();
    }
}
