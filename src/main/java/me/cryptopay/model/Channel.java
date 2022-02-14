// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.util.UUID;

public final class Channel {
    @SerializedName("id")
    private UUID id;

    @SerializedName("status")
    private ChannelStatus status;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("pay_currency")
    private String payCurrency;

    @SerializedName("receiver_currency")
    private String receiverCurrency;

    @SerializedName("address")
    private String address;

    @SerializedName("project_id")
    private String projectId;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("customer_id")
    private String customerId;

    @SerializedName("uri")
    private String uri;

    @SerializedName("hosted_page_url")
    private URI hostedPageUrl;

    /** Creates a new instance of Channel. */
    public Channel() {}

    /**
     * Get id.
     *
     * @return id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Set id.
     *
     * @param id id
     */
    public void setId(final UUID id) {
        this.id = id;
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
     * Get projectId.
     *
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Set projectId.
     *
     * @param projectId projectId
     */
    public void setProjectId(final String projectId) {
        this.projectId = projectId;
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

    /**
     * Get uri.
     *
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Set uri.
     *
     * @param uri uri
     */
    public void setUri(final String uri) {
        this.uri = uri;
    }

    /**
     * Get hostedPageUrl.
     *
     * @return hostedPageUrl
     */
    public URI getHostedPageUrl() {
        return hostedPageUrl;
    }

    /**
     * Set hostedPageUrl.
     *
     * @param hostedPageUrl hostedPageUrl
     */
    public void setHostedPageUrl(final URI hostedPageUrl) {
        this.hostedPageUrl = hostedPageUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Channel(");
        sb.append("id=").append(id).append(", ");
        sb.append("status=").append(status).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("description=").append(description).append(", ");
        sb.append("payCurrency=").append(payCurrency).append(", ");
        sb.append("receiverCurrency=").append(receiverCurrency).append(", ");
        sb.append("address=").append(address).append(", ");
        sb.append("projectId=").append(projectId).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("customerId=").append(customerId).append(", ");
        sb.append("uri=").append(uri).append(", ");
        sb.append("hostedPageUrl=").append(hostedPageUrl);
        sb.append(")");
        return sb.toString();
    }
}
