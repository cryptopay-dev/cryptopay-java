// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class ChannelParams {
    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("pay_currency")
    private String payCurrency;

    @SerializedName("receiver_currency")
    private String receiverCurrency;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("customer_id")
    private String customerId;

    /** Creates a new instance of ChannelParams. */
    public ChannelParams() {}

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
     * Get description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description.
     *
     * @param description description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Get payCurrency.
     *
     * @return payCurrency
     */
    public String getPayCurrency() {
        return payCurrency;
    }

    /**
     * Set payCurrency.
     *
     * @param payCurrency payCurrency
     */
    public void setPayCurrency(final String payCurrency) {
        this.payCurrency = payCurrency;
    }

    /**
     * Get receiverCurrency.
     *
     * @return receiverCurrency
     */
    public String getReceiverCurrency() {
        return receiverCurrency;
    }

    /**
     * Set receiverCurrency.
     *
     * @param receiverCurrency receiverCurrency
     */
    public void setReceiverCurrency(final String receiverCurrency) {
        this.receiverCurrency = receiverCurrency;
    }

    /**
     * Get customId.
     *
     * @return customId
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * Set customId.
     *
     * @param customId customId
     */
    public void setCustomId(final String customId) {
        this.customId = customId;
    }

    /**
     * Get customerId.
     *
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Set customerId.
     *
     * @param customerId customerId
     */
    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChannelParams(");
        sb.append("name=").append(name).append(", ");
        sb.append("description=").append(description).append(", ");
        sb.append("payCurrency=").append(payCurrency).append(", ");
        sb.append("receiverCurrency=").append(receiverCurrency).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("customerId=").append(customerId);
        sb.append(")");
        return sb.toString();
    }
}
