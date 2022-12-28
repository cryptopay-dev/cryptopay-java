// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class Customer {
    @SerializedName("id")
    private String id;

    @SerializedName("currency")
    private String currency;

    @SerializedName("addresses")
    private List<CustomerAddress> addresses;

    /** Creates a new instance of Customer. */
    public Customer() {}

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
        sb.append("Customer(");
        sb.append("id=").append(id).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("addresses=").append(addresses);
        sb.append(")");
        return sb.toString();
    }
}
