// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Map;

public final class InvoiceParams {
    @SerializedName("price_amount")
    private BigDecimal priceAmount;

    @SerializedName("price_currency")
    private String priceCurrency;

    @SerializedName("pay_currency")
    private String payCurrency;

    @SerializedName("network")
    private String network;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("customer_id")
    private String customerId;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("metadata")
    private Map<String, String> metadata;

    @SerializedName("success_redirect_url")
    private URI successRedirectUrl;

    @SerializedName("unsuccess_redirect_url")
    private URI unsuccessRedirectUrl;

    @SerializedName("payer_email")
    private String payerEmail;

    /** Creates a new instance of InvoiceParams. */
    public InvoiceParams() {}

    /**
     * Get priceAmount.
     *
     * @return priceAmount
     */
    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    /**
     * Set priceAmount.
     *
     * @param priceAmount priceAmount
     */
    public void setPriceAmount(final BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    /**
     * Get priceCurrency.
     *
     * @return priceCurrency
     */
    public String getPriceCurrency() {
        return priceCurrency;
    }

    /**
     * Set priceCurrency.
     *
     * @param priceCurrency priceCurrency
     */
    public void setPriceCurrency(final String priceCurrency) {
        this.priceCurrency = priceCurrency;
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
     * Get metadata.
     *
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set metadata.
     *
     * @param metadata metadata
     */
    public void setMetadata(final Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Get successRedirectUrl.
     *
     * @return successRedirectUrl
     */
    public URI getSuccessRedirectUrl() {
        return successRedirectUrl;
    }

    /**
     * Set successRedirectUrl.
     *
     * @param successRedirectUrl successRedirectUrl
     */
    public void setSuccessRedirectUrl(final URI successRedirectUrl) {
        this.successRedirectUrl = successRedirectUrl;
    }

    /**
     * Get unsuccessRedirectUrl.
     *
     * @return unsuccessRedirectUrl
     */
    public URI getUnsuccessRedirectUrl() {
        return unsuccessRedirectUrl;
    }

    /**
     * Set unsuccessRedirectUrl.
     *
     * @param unsuccessRedirectUrl unsuccessRedirectUrl
     */
    public void setUnsuccessRedirectUrl(final URI unsuccessRedirectUrl) {
        this.unsuccessRedirectUrl = unsuccessRedirectUrl;
    }

    /**
     * Get payerEmail.
     *
     * @return payerEmail
     */
    public String getPayerEmail() {
        return payerEmail;
    }

    /**
     * Set payerEmail.
     *
     * @param payerEmail payerEmail
     */
    public void setPayerEmail(final String payerEmail) {
        this.payerEmail = payerEmail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceParams(");
        sb.append("priceAmount=").append(priceAmount).append(", ");
        sb.append("priceCurrency=").append(priceCurrency).append(", ");
        sb.append("payCurrency=").append(payCurrency).append(", ");
        sb.append("network=").append(network).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("customerId=").append(customerId).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("description=").append(description).append(", ");
        sb.append("metadata=").append(metadata).append(", ");
        sb.append("successRedirectUrl=").append(successRedirectUrl).append(", ");
        sb.append("unsuccessRedirectUrl=").append(unsuccessRedirectUrl).append(", ");
        sb.append("payerEmail=").append(payerEmail);
        sb.append(")");
        return sb.toString();
    }
}
