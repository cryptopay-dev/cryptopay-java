// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public final class Exchange {
    @SerializedName("pair")
    private String pair;

    @SerializedName("rate")
    private BigDecimal rate;

    @SerializedName("fee")
    private BigDecimal fee;

    @SerializedName("fee_currency")
    private String feeCurrency;

    /** Creates a new instance of Exchange. */
    public Exchange() {}

    /**
     * Get pair.
     *
     * @return pair
     */
    public String getPair() {
        return pair;
    }

    /**
     * Set pair.
     *
     * @param pair pair
     */
    public void setPair(final String pair) {
        this.pair = pair;
    }

    /**
     * Get rate.
     *
     * @return rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Set rate.
     *
     * @param rate rate
     */
    public void setRate(final BigDecimal rate) {
        this.rate = rate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Exchange(");
        sb.append("pair=").append(pair).append(", ");
        sb.append("rate=").append(rate).append(", ");
        sb.append("fee=").append(fee).append(", ");
        sb.append("feeCurrency=").append(feeCurrency);
        sb.append(")");
        return sb.toString();
    }
}
