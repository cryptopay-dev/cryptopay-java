// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class CustomerAddress {
    @SerializedName("address")
    private String address;

    @SerializedName("currency")
    private String currency;

    @SerializedName("network")
    private String network;

    /** Creates a new instance of CustomerAddress. */
    public CustomerAddress() {}

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
        sb.append("CustomerAddress(");
        sb.append("address=").append(address).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("network=").append(network);
        sb.append(")");
        return sb.toString();
    }
}
