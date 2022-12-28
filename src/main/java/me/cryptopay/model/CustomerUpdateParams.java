// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class CustomerUpdateParams {
    @SerializedName("currency")
    private String currency;

    @SerializedName("addresses")
    private List<CustomerAddress> addresses;

    /** Creates a new instance of CustomerUpdateParams. */
    public CustomerUpdateParams() {}

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
     * Get addresses.
     *
     * @return addresses
     */
    public List<CustomerAddress> getAddresses() {
        return addresses;
    }

    /**
     * Set addresses.
     *
     * @param addresses addresses
     */
    public void setAddresses(final List<CustomerAddress> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerUpdateParams(");
        sb.append("currency=").append(currency).append(", ");
        sb.append("addresses=").append(addresses);
        sb.append(")");
        return sb.toString();
    }
}
