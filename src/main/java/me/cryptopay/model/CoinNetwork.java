// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class CoinNetwork {
    @SerializedName("network")
    private String network;

    @SerializedName("name")
    private String name;

    @SerializedName("precision")
    private Integer precision;

    @SerializedName("destination_tag")
    private CoinDestinationTag destinationTag;

    @SerializedName("invoices")
    private InvoicesConfig invoices;

    @SerializedName("channels")
    private ChannelsConfig channels;

    @SerializedName("coin_withdrawals")
    private CoinWithdrawalsConfig coinWithdrawals;

    /** Creates a new instance of CoinNetwork. */
    public CoinNetwork() {}

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
     * Get precision.
     *
     * @return precision
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Set precision.
     *
     * @param precision precision
     */
    public void setPrecision(final Integer precision) {
        this.precision = precision;
    }

    /**
     * Get destinationTag.
     *
     * @return destinationTag
     */
    public CoinDestinationTag getDestinationTag() {
        return destinationTag;
    }

    /**
     * Set destinationTag.
     *
     * @param destinationTag destinationTag
     */
    public void setDestinationTag(final CoinDestinationTag destinationTag) {
        this.destinationTag = destinationTag;
    }

    /**
     * Get invoices.
     *
     * @return invoices
     */
    public InvoicesConfig getInvoices() {
        return invoices;
    }

    /**
     * Set invoices.
     *
     * @param invoices invoices
     */
    public void setInvoices(final InvoicesConfig invoices) {
        this.invoices = invoices;
    }

    /**
     * Get channels.
     *
     * @return channels
     */
    public ChannelsConfig getChannels() {
        return channels;
    }

    /**
     * Set channels.
     *
     * @param channels channels
     */
    public void setChannels(final ChannelsConfig channels) {
        this.channels = channels;
    }

    /**
     * Get coinWithdrawals.
     *
     * @return coinWithdrawals
     */
    public CoinWithdrawalsConfig getCoinWithdrawals() {
        return coinWithdrawals;
    }

    /**
     * Set coinWithdrawals.
     *
     * @param coinWithdrawals coinWithdrawals
     */
    public void setCoinWithdrawals(final CoinWithdrawalsConfig coinWithdrawals) {
        this.coinWithdrawals = coinWithdrawals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoinNetwork(");
        sb.append("network=").append(network).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("precision=").append(precision).append(", ");
        sb.append("destinationTag=").append(destinationTag).append(", ");
        sb.append("invoices=").append(invoices).append(", ");
        sb.append("channels=").append(channels).append(", ");
        sb.append("coinWithdrawals=").append(coinWithdrawals);
        sb.append(")");
        return sb.toString();
    }
}
