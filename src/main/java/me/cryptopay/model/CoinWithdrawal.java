// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class CoinWithdrawal {
    @SerializedName("id")
    private UUID id;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("customer_id")
    private String customerId;

    @SerializedName("address")
    private String address;

    @SerializedName("network")
    private String network;

    @SerializedName("txid")
    private String txid;

    @SerializedName("status")
    private CoinWithdrawalStatus status;

    @SerializedName("charged_amount")
    private BigDecimal chargedAmount;

    @SerializedName("charged_currency")
    private String chargedCurrency;

    @SerializedName("received_amount")
    private BigDecimal receivedAmount;

    @SerializedName("received_currency")
    private String receivedCurrency;

    @SerializedName("network_fee")
    private BigDecimal networkFee;

    @SerializedName("network_fee_level")
    private NetworkFeeLevel networkFeeLevel;

    @SerializedName("fee")
    private BigDecimal fee;

    @SerializedName("fee_currency")
    private String feeCurrency;

    @SerializedName("exchange")
    private Exchange exchange;

    @SerializedName("risk")
    private Risk risk;

    @SerializedName("created_at")
    private OffsetDateTime createdAt;

    /** Creates a new instance of CoinWithdrawal. */
    public CoinWithdrawal() {}

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
     * Get status.
     *
     * @return status
     */
    public CoinWithdrawalStatus getStatus() {
        return status;
    }

    /**
     * Set status.
     *
     * @param status status
     */
    public void setStatus(final CoinWithdrawalStatus status) {
        this.status = status;
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
     * Get networkFee.
     *
     * @return networkFee
     */
    public BigDecimal getNetworkFee() {
        return networkFee;
    }

    /**
     * Set networkFee.
     *
     * @param networkFee networkFee
     */
    public void setNetworkFee(final BigDecimal networkFee) {
        this.networkFee = networkFee;
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
        sb.append("CoinWithdrawal(");
        sb.append("id=").append(id).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("customerId=").append(customerId).append(", ");
        sb.append("address=").append(address).append(", ");
        sb.append("network=").append(network).append(", ");
        sb.append("txid=").append(txid).append(", ");
        sb.append("status=").append(status).append(", ");
        sb.append("chargedAmount=").append(chargedAmount).append(", ");
        sb.append("chargedCurrency=").append(chargedCurrency).append(", ");
        sb.append("receivedAmount=").append(receivedAmount).append(", ");
        sb.append("receivedCurrency=").append(receivedCurrency).append(", ");
        sb.append("networkFee=").append(networkFee).append(", ");
        sb.append("networkFeeLevel=").append(networkFeeLevel).append(", ");
        sb.append("fee=").append(fee).append(", ");
        sb.append("feeCurrency=").append(feeCurrency).append(", ");
        sb.append("exchange=").append(exchange).append(", ");
        sb.append("risk=").append(risk).append(", ");
        sb.append("createdAt=").append(createdAt);
        sb.append(")");
        return sb.toString();
    }
}
