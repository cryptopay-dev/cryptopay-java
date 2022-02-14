// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public final class Rate {
    @SerializedName("buy_rate")
    private BigDecimal buyRate;

    @SerializedName("sell_rate")
    private BigDecimal sellRate;

    /** Creates a new instance of Rate. */
    public Rate() {}

    /**
     * Get buyRate.
     *
     * @return buyRate
     */
    public BigDecimal getBuyRate() {
        return buyRate;
    }

    /**
     * Set buyRate.
     *
     * @param buyRate buyRate
     */
    public void setBuyRate(final BigDecimal buyRate) {
        this.buyRate = buyRate;
    }

    /**
     * Get sellRate.
     *
     * @return sellRate
     */
    public BigDecimal getSellRate() {
        return sellRate;
    }

    /**
     * Set sellRate.
     *
     * @param sellRate sellRate
     */
    public void setSellRate(final BigDecimal sellRate) {
        this.sellRate = sellRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rate(");
        sb.append("buyRate=").append(buyRate).append(", ");
        sb.append("sellRate=").append(sellRate);
        sb.append(")");
        return sb.toString();
    }
}
