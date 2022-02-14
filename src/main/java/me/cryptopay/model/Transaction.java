// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class Transaction {
    @SerializedName("id")
    private UUID id;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("customer_id")
    private String customerId;

    @SerializedName("amount")
    private BigDecimal amount;

    @SerializedName("currency")
    private String currency;

    @SerializedName("balance")
    private BigDecimal balance;

    @SerializedName("fee")
    private BigDecimal fee;

    @SerializedName("fee_currency")
    private String feeCurrency;

    @SerializedName("reference_id")
    private String referenceId;

    @SerializedName("reference_type")
    private TransactionReferenceType referenceType;

    @SerializedName("description")
    private String description;

    @SerializedName("status")
    private String status;

    @SerializedName("status_context")
    private String statusContext;

    @SerializedName("risk")
    private Risk risk;

    @SerializedName("created_at")
    private OffsetDateTime createdAt;

    /** Creates a new instance of Transaction. */
    public Transaction() {}

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
     * Get currency.
     *
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Set currency.
     *
     * @param currency currency
     */
    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    /**
     * Get balance.
     *
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Set balance.
     *
     * @param balance balance
     */
    public void setBalance(final BigDecimal balance) {
        this.balance = balance;
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
     * Get referenceId.
     *
     * @return referenceId
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Set referenceId.
     *
     * @param referenceId referenceId
     */
    public void setReferenceId(final String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Get referenceType.
     *
     * @return referenceType
     */
    public TransactionReferenceType getReferenceType() {
        return referenceType;
    }

    /**
     * Set referenceType.
     *
     * @param referenceType referenceType
     */
    public void setReferenceType(final TransactionReferenceType referenceType) {
        this.referenceType = referenceType;
    }

    /**
     * Get description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description.
     *
     * @param description description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Get status.
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set status.
     *
     * @param status status
     */
    public void setStatus(final String status) {
        this.status = status;
    }

    /**
     * Get statusContext.
     *
     * @return statusContext
     */
    public String getStatusContext() {
        return statusContext;
    }

    /**
     * Set statusContext.
     *
     * @param statusContext statusContext
     */
    public void setStatusContext(final String statusContext) {
        this.statusContext = statusContext;
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
        sb.append("Transaction(");
        sb.append("id=").append(id).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("customerId=").append(customerId).append(", ");
        sb.append("amount=").append(amount).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("balance=").append(balance).append(", ");
        sb.append("fee=").append(fee).append(", ");
        sb.append("feeCurrency=").append(feeCurrency).append(", ");
        sb.append("referenceId=").append(referenceId).append(", ");
        sb.append("referenceType=").append(referenceType).append(", ");
        sb.append("description=").append(description).append(", ");
        sb.append("status=").append(status).append(", ");
        sb.append("statusContext=").append(statusContext).append(", ");
        sb.append("risk=").append(risk).append(", ");
        sb.append("createdAt=").append(createdAt);
        sb.append(")");
        return sb.toString();
    }
}
