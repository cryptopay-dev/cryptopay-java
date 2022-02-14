// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class ChannelUpdateParams {
    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("status")
    private ChannelStatus status;

    @SerializedName("customer_id")
    private String customerId;

    /** Creates a new instance of ChannelUpdateParams. */
    public ChannelUpdateParams() {}

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
     * Get status.
     *
     * @return status
     */
    public ChannelStatus getStatus() {
        return status;
    }

    /**
     * Set status.
     *
     * @param status status
     */
    public void setStatus(final ChannelStatus status) {
        this.status = status;
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
        sb.append("ChannelUpdateParams(");
        sb.append("name=").append(name).append(", ");
        sb.append("description=").append(description).append(", ");
        sb.append("status=").append(status).append(", ");
        sb.append("customerId=").append(customerId);
        sb.append(")");
        return sb.toString();
    }
}
