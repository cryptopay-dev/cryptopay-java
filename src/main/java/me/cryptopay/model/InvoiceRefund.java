// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class InvoiceRefund {
    @SerializedName("id")
    private UUID id;

    @SerializedName("invoice_id")
    private UUID invoiceId;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("amount")
    private BigDecimal amount;

    @SerializedName("amount_currency")
    private String amountCurrency;

    @SerializedName("fee")
    private BigDecimal fee;

    @SerializedName("fee_currency")
    private String feeCurrency;

    @SerializedName("address")
    private String address;

    @SerializedName("txid")
    private String txid;

    @SerializedName("risk")
    private Risk risk;

    @SerializedName("created_at")
    private OffsetDateTime createdAt;

    /** Creates a new instance of InvoiceRefund. */
    public InvoiceRefund() {}

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
     * Get amount.
     *
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Set amount.
     *
     * @param amount amount
     */
    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Get amountCurrency.
     *
     * @return amountCurrency
     */
    public String getAmountCurrency() {
        return amountCurrency;
    }

    /**
     * Set amountCurrency.
     *
     * @param amountCurrency amountCurrency
     */
    public void setAmountCurrency(final String amountCurrency) {
        this.amountCurrency = amountCurrency;
    }

    /**
     * Get fee.
     *
     * @return fee
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Set fee.
     *
     * @param fee fee
     */
    public void setFee(final BigDecimal fee) {
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
     * Get txid.
     *
     * @return txid
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Set txid.
     *
     * @param txid txid
     */
    public void setTxid(final String txid) {
        this.txid = txid;
    }

    /**
     * Get risk.
     *
     * @return risk
     */
    public Risk getRisk() {
        return risk;
    }

    /**
     * Set risk.
     *
     * @param risk risk
     */
    public void setRisk(final Risk risk) {
        this.risk = risk;
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
        sb.append("InvoiceRefund(");
        sb.append("id=").append(id).append(", ");
        sb.append("invoiceId=").append(invoiceId).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("amount=").append(amount).append(", ");
        sb.append("amountCurrency=").append(amountCurrency).append(", ");
        sb.append("fee=").append(fee).append(", ");
        sb.append("feeCurrency=").append(feeCurrency).append(", ");
        sb.append("address=").append(address).append(", ");
        sb.append("txid=").append(txid).append(", ");
        sb.append("risk=").append(risk).append(", ");
        sb.append("createdAt=").append(createdAt);
        sb.append(")");
        return sb.toString();
    }
}
