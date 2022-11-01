// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class Coin {
    @SerializedName("currency")
    private String currency;

    @SerializedName("name")
    private String name;

    @SerializedName("logo_url")
    private String logoUrl;

    @SerializedName("networks")
    private List<CoinNetwork> networks;

    /** Creates a new instance of Coin. */
    public Coin() {}

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
     * Get name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     *
     * @param name name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Get logoUrl.
     *
     * @return logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Set logoUrl.
     *
     * @param logoUrl logoUrl
     */
    public void setLogoUrl(final String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * Get networks.
     *
     * @return networks
     */
    public List<CoinNetwork> getNetworks() {
        return networks;
    }

    /**
     * Set networks.
     *
     * @param networks networks
     */
    public void setNetworks(final List<CoinNetwork> networks) {
        this.networks = networks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coin(");
        sb.append("currency=").append(currency).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("logoUrl=").append(logoUrl).append(", ");
        sb.append("networks=").append(networks);
        sb.append(")");
        return sb.toString();
    }
}
