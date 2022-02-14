// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class InvoiceRecalculation {
    @SerializedName("id")
    private UUID id;

    @SerializedName("invoice_id")
    private UUID invoiceId;

    @SerializedName("pay_amount")
    private BigDecimal payAmount;

    @SerializedName("pay_currency")
    private String payCurrency;

    @SerializedName("price_amount")
    private BigDecimal priceAmount;

    @SerializedName("price_currency")
    private String priceCurrency;

    @SerializedName("fee")
    private String fee;

    @SerializedName("fee_currency")
    private String feeCurrency;

    @SerializedName("previous_pay_amount")
    private BigDecimal previousPayAmount;

    @SerializedName("previous_price_amount")
    private BigDecimal previousPriceAmount;

    @SerializedName("previous_exchange_rate")
    private BigDecimal previousExchangeRate;

    @SerializedName("exchange")
    private Exchange exchange;

    @SerializedName("created_at")
    private OffsetDateTime createdAt;

    /** Creates a new instance of InvoiceRecalculation. */
    public InvoiceRecalculation() {}

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
     * Get invoiceId.
     *
     * @return invoiceId
     */
    public UUID getInvoiceId() {
        return invoiceId;
    }

    /**
     * Set invoiceId.
     *
     * @param invoiceId invoiceId
     */
    public void setInvoiceId(final UUID invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Get payAmount.
     *
     * @return payAmount
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * Set payAmount.
     *
     * @param payAmount payAmount
     */
    public void setPayAmount(final BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * Get payCurrency.
     *
     * @return payCurrency
     */
    public String getPayCurrency() {
        return payCurrency;
    }

    /**
     * Set payCurrency.
     *
     * @param payCurrency payCurrency
     */
    public void setPayCurrency(final String payCurrency) {
        this.payCurrency = payCurrency;
    }

    /**
     * Get priceAmount.
     *
     * @return priceAmount
     */
    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    /**
     * Set priceAmount.
     *
     * @param priceAmount priceAmount
     */
    public void setPriceAmount(final BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    /**
     * Get priceCurrency.
     *
     * @return priceCurrency
     */
    public String getPriceCurrency() {
        return priceCurrency;
    }

    /**
     * Set priceCurrency.
     *
     * @param priceCurrency priceCurrency
     */
    public void setPriceCurrency(final String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    /**
     * Get fee.
     *
     * @return fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * Set fee.
     *
     * @param fee fee
     */
    public void setFee(final String fee) {
        this.fee = fee;
    }

    /**
     * Get feeCurrency.
     *
     * @return feeCurrency
     */
    public String getFeeCurrency() {
        return feeCurrency;
    }

    /**
     * Set feeCurrency.
     *
     * @param feeCurrency feeCurrency
     */
    public void setFeeCurrency(final String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    /**
     * Get previousPayAmount.
     *
     * @return previousPayAmount
     */
    public BigDecimal getPreviousPayAmount() {
        return previousPayAmount;
    }

    /**
     * Set previousPayAmount.
     *
     * @param previousPayAmount previousPayAmount
     */
    public void setPreviousPayAmount(final BigDecimal previousPayAmount) {
        this.previousPayAmount = previousPayAmount;
    }

    /**
     * Get previousPriceAmount.
     *
     * @return previousPriceAmount
     */
    public BigDecimal getPreviousPriceAmount() {
        return previousPriceAmount;
    }

    /**
     * Set previousPriceAmount.
     *
     * @param previousPriceAmount previousPriceAmount
     */
    public void setPreviousPriceAmount(final BigDecimal previousPriceAmount) {
        this.previousPriceAmount = previousPriceAmount;
    }

    /**
     * Get previousExchangeRate.
     *
     * @return previousExchangeRate
     */
    public BigDecimal getPreviousExchangeRate() {
        return previousExchangeRate;
    }

    /**
     * Set previousExchangeRate.
     *
     * @param previousExchangeRate previousExchangeRate
     */
    public void setPreviousExchangeRate(final BigDecimal previousExchangeRate) {
        this.previousExchangeRate = previousExchangeRate;
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

    /**
     * Get createdAt.
     *
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Set createdAt.
     *
     * @param createdAt createdAt
     */
    public void setCreatedAt(final OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceRecalculation(");
        sb.append("id=").append(id).append(", ");
        sb.append("invoiceId=").append(invoiceId).append(", ");
        sb.append("payAmount=").append(payAmount).append(", ");
        sb.append("payCurrency=").append(payCurrency).append(", ");
        sb.append("priceAmount=").append(priceAmount).append(", ");
        sb.append("priceCurrency=").append(priceCurrency).append(", ");
        sb.append("fee=").append(fee).append(", ");
        sb.append("feeCurrency=").append(feeCurrency).append(", ");
        sb.append("previousPayAmount=").append(previousPayAmount).append(", ");
        sb.append("previousPriceAmount=").append(previousPriceAmount).append(", ");
        sb.append("previousExchangeRate=").append(previousExchangeRate).append(", ");
        sb.append("exchange=").append(exchange).append(", ");
        sb.append("createdAt=").append(createdAt);
        sb.append(")");
        return sb.toString();
    }
}
