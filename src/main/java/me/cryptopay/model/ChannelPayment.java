// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class ChannelPayment {
    @SerializedName("id")
    private UUID id;

    @SerializedName("channel_id")
    private UUID channelId;

    @SerializedName("paid_amount")
    private BigDecimal paidAmount;

    @SerializedName("paid_currency")
    private String paidCurrency;

    @SerializedName("received_amount")
    private BigDecimal receivedAmount;

    @SerializedName("received_currency")
    private String receivedCurrency;

    @SerializedName("fee")
    private BigDecimal fee;

    @SerializedName("fee_currency")
    private String feeCurrency;

    @SerializedName("txid")
    private String txid;

    @SerializedName("exchange")
    private Exchange exchange;

    @SerializedName("risk")
    private Risk risk;

    @SerializedName("status")
    private ChannelPaymentStatus status;

    @SerializedName("status_context")
    private ChannelPaymentStatusContext statusContext;

    @SerializedName("refund_address")
    private String refundAddress;

    @SerializedName("coin_withdrawal_id")
    private UUID coinWithdrawalId;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("customer_id")
    private String customerId;

    @SerializedName("address")
    private String address;

    @SerializedName("created_at")
    private OffsetDateTime createdAt;

    /** Creates a new instance of ChannelPayment. */
    public ChannelPayment() {}

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
     * Get channelId.
     *
     * @return channelId
     */
    public UUID getChannelId() {
        return channelId;
    }

    /**
     * Set channelId.
     *
     * @param channelId channelId
     */
    public void setChannelId(final UUID channelId) {
        this.channelId = channelId;
    }

    /**
     * Get paidAmount.
     *
     * @return paidAmount
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * Set paidAmount.
     *
     * @param paidAmount paidAmount
     */
    public void setPaidAmount(final BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Get paidCurrency.
     *
     * @return paidCurrency
     */
    public String getPaidCurrency() {
        return paidCurrency;
    }

    /**
     * Set paidCurrency.
     *
     * @param paidCurrency paidCurrency
     */
    public void setPaidCurrency(final String paidCurrency) {
        this.paidCurrency = paidCurrency;
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
     * Get status.
     *
     * @return status
     */
    public ChannelPaymentStatus getStatus() {
        return status;
    }

    /**
     * Set status.
     *
     * @param status status
     */
    public void setStatus(final ChannelPaymentStatus status) {
        this.status = status;
    }

    /**
     * Get statusContext.
     *
     * @return statusContext
     */
    public ChannelPaymentStatusContext getStatusContext() {
        return statusContext;
    }

    /**
     * Set statusContext.
     *
     * @param statusContext statusContext
     */
    public void setStatusContext(final ChannelPaymentStatusContext statusContext) {
        this.statusContext = statusContext;
    }

    /**
     * Get refundAddress.
     *
     * @return refundAddress
     */
    public String getRefundAddress() {
        return refundAddress;
    }

    /**
     * Set refundAddress.
     *
     * @param refundAddress refundAddress
     */
    public void setRefundAddress(final String refundAddress) {
        this.refundAddress = refundAddress;
    }

    /**
     * Get coinWithdrawalId.
     *
     * @return coinWithdrawalId
     */
    public UUID getCoinWithdrawalId() {
        return coinWithdrawalId;
    }

    /**
     * Set coinWithdrawalId.
     *
     * @param coinWithdrawalId coinWithdrawalId
     */
    public void setCoinWithdrawalId(final UUID coinWithdrawalId) {
        this.coinWithdrawalId = coinWithdrawalId;
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
        sb.append("ChannelPayment(");
        sb.append("id=").append(id).append(", ");
        sb.append("channelId=").append(channelId).append(", ");
        sb.append("paidAmount=").append(paidAmount).append(", ");
        sb.append("paidCurrency=").append(paidCurrency).append(", ");
        sb.append("receivedAmount=").append(receivedAmount).append(", ");
        sb.append("receivedCurrency=").append(receivedCurrency).append(", ");
        sb.append("fee=").append(fee).append(", ");
        sb.append("feeCurrency=").append(feeCurrency).append(", ");
        sb.append("txid=").append(txid).append(", ");
        sb.append("exchange=").append(exchange).append(", ");
        sb.append("risk=").append(risk).append(", ");
        sb.append("status=").append(status).append(", ");
        sb.append("statusContext=").append(statusContext).append(", ");
        sb.append("refundAddress=").append(refundAddress).append(", ");
        sb.append("coinWithdrawalId=").append(coinWithdrawalId).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("customerId=").append(customerId).append(", ");
        sb.append("address=").append(address).append(", ");
        sb.append("createdAt=").append(createdAt);
        sb.append(")");
        return sb.toString();
    }
}
