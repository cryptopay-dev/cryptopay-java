// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public final class NetworkFee {
    @SerializedName("level")
    private NetworkFeeLevel level;

    @SerializedName("fee")
    private BigDecimal fee;

    @SerializedName("currency")
    private String currency;

    @SerializedName("network")
    private String network;

    /** Creates a new instance of NetworkFee. */
    public NetworkFee() {}

    /**
     * Get level.
     *
     * @return level
     */
    public NetworkFeeLevel getLevel() {
        return level;
    }

    /**
     * Set level.
     *
     * @param level level
     */
    public void setLevel(final NetworkFeeLevel level) {
        this.level = level;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkFee(");
        sb.append("level=").append(level).append(", ");
        sb.append("fee=").append(fee).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("network=").append(network);
        sb.append(")");
        return sb.toString();
    }
}
