// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.Map;

public final class CustomerParams {
    @SerializedName("id")
    private String id;

    @SerializedName("currency")
    private String currency;

    @SerializedName("refund_addresses")
    private Map<String, String> refundAddresses;

    /** Creates a new instance of CustomerParams. */
    public CustomerParams() {}

    /**
     * Get id.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Set id.
     *
     * @param id id
     */
    public void setId(final String id) {
        this.id = id;
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
     * Get refundAddresses.
     *
     * @return refundAddresses
     */
    public Map<String, String> getRefundAddresses() {
        return refundAddresses;
    }

    /**
     * Set refundAddresses.
     *
     * @param refundAddresses refundAddresses
     */
    public void setRefundAddresses(final Map<String, String> refundAddresses) {
        this.refundAddresses = refundAddresses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerParams(");
        sb.append("id=").append(id).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("refundAddresses=").append(refundAddresses);
        sb.append(")");
        return sb.toString();
    }
}
