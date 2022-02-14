// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class RiskParams {
    @SerializedName("address")
    private String address;

    @SerializedName("currency")
    private String currency;

    @SerializedName("type")
    private RiskType type;

    /** Creates a new instance of RiskParams. */
    public RiskParams() {}

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
     * Get type.
     *
     * @return type
     */
    public RiskType getType() {
        return type;
    }

    /**
     * Set type.
     *
     * @param type type
     */
    public void setType(final RiskType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RiskParams(");
        sb.append("address=").append(address).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("type=").append(type);
        sb.append(")");
        return sb.toString();
    }
}
