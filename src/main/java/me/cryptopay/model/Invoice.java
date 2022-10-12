// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class Invoice {
    @SerializedName("id")
    private UUID id;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("customer_id")
    private String customerId;

    @SerializedName("status")
    private InvoiceStatus status;

    @SerializedName("status_context")
    private InvoiceStatusContext statusContext;

    @SerializedName("address")
    private String address;

    @SerializedName("network")
    private String network;

    @SerializedName("uri")
    private String uri;

    @SerializedName("price_amount")
    private BigDecimal priceAmount;

    @SerializedName("price_currency")
    private String priceCurrency;

    @SerializedName("fee")
    private BigDecimal fee;

    @SerializedName("fee_currency")
    private String feeCurrency;

    @SerializedName("pay_amount")
    private BigDecimal payAmount;

    @SerializedName("pay_currency")
    private String payCurrency;

    @SerializedName("paid_amount")
    private BigDecimal paidAmount;

    @SerializedName("exchange")
    private Exchange exchange;

    @SerializedName("transactions")
    private List<InvoiceTransaction> transactions;

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

    @SerializedName("hosted_page_url")
    private URI hostedPageUrl;

    @SerializedName("created_at")
    private OffsetDateTime createdAt;

    @SerializedName("expires_at")
    private OffsetDateTime expiresAt;

    /** Creates a new instance of Invoice. */
    public Invoice() {}

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
     * Get status.
     *
     * @return status
     */
    public InvoiceStatus getStatus() {
        return status;
    }

    /**
     * Set status.
     *
     * @param status status
     */
    public void setStatus(final InvoiceStatus status) {
        this.status = status;
    }

    /**
     * Get statusContext.
     *
     * @return statusContext
     */
    public InvoiceStatusContext getStatusContext() {
        return statusContext;
    }

    /**
     * Set statusContext.
     *
     * @param statusContext statusContext
     */
    public void setStatusContext(final InvoiceStatusContext statusContext) {
        this.statusContext = statusContext;
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
     * Get fee.
     *
     * @return fee
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Set fee.
     *
     * @param fee fee
     */
    public void setFee(final BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * Get feeCurrency.
     *
     * @return feeCurrency
     */
    public String getFeeCurrency() {
        return feeCurrency;
    }

    /**
     * Set feeCurrency.
     *
     * @param feeCurrency feeCurrency
     */
    public void setFeeCurrency(final String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    /**
     * Get payAmount.
     *
     * @return payAmount
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * Set payAmount.
     *
     * @param payAmount payAmount
     */
    public void setPayAmount(final BigDecimal payAmount) {
        this.payAmount = payAmount;
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
     * Get paidAmount.
     *
     * @return paidAmount
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * Set paidAmount.
     *
     * @param paidAmount paidAmount
     */
    public void setPaidAmount(final BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Get exchange.
     *
     * @return exchange
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Set exchange.
     *
     * @param exchange exchange
     */
    public void setExchange(final Exchange exchange) {
        this.exchange = exchange;
    }

    /**
     * Get transactions.
     *
     * @return transactions
     */
    public List<InvoiceTransaction> getTransactions() {
        return transactions;
    }

    /**
     * Set transactions.
     *
     * @param transactions transactions
     */
    public void setTransactions(final List<InvoiceTransaction> transactions) {
        this.transactions = transactions;
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

    /**
     * Get createdAt.
     *
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Set createdAt.
     *
     * @param createdAt createdAt
     */
    public void setCreatedAt(final OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get expiresAt.
     *
     * @return expiresAt
     */
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Set expiresAt.
     *
     * @param expiresAt expiresAt
     */
    public void setExpiresAt(final OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice(");
        sb.append("id=").append(id).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("customerId=").append(customerId).append(", ");
        sb.append("status=").append(status).append(", ");
        sb.append("statusContext=").append(statusContext).append(", ");
        sb.append("address=").append(address).append(", ");
        sb.append("network=").append(network).append(", ");
        sb.append("uri=").append(uri).append(", ");
        sb.append("priceAmount=").append(priceAmount).append(", ");
        sb.append("priceCurrency=").append(priceCurrency).append(", ");
        sb.append("fee=").append(fee).append(", ");
        sb.append("feeCurrency=").append(feeCurrency).append(", ");
        sb.append("payAmount=").append(payAmount).append(", ");
        sb.append("payCurrency=").append(payCurrency).append(", ");
        sb.append("paidAmount=").append(paidAmount).append(", ");
        sb.append("exchange=").append(exchange).append(", ");
        sb.append("transactions=").append(transactions).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("description=").append(description).append(", ");
        sb.append("metadata=").append(metadata).append(", ");
        sb.append("successRedirectUrl=").append(successRedirectUrl).append(", ");
        sb.append("unsuccessRedirectUrl=").append(unsuccessRedirectUrl).append(", ");
        sb.append("hostedPageUrl=").append(hostedPageUrl).append(", ");
        sb.append("createdAt=").append(createdAt).append(", ");
        sb.append("expiresAt=").append(expiresAt);
        sb.append(")");
        return sb.toString();
    }
}
