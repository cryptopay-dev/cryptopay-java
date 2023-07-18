// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class Subscription {
    @SerializedName("id")
    private UUID id;

    @SerializedName("status")
    private SubscriptionStatus status;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("name")
    private String name;

    @SerializedName("amount")
    private BigDecimal amount;

    @SerializedName("currency")
    private String currency;

    @SerializedName("period")
    private SubscriptionPeriod period;

    @SerializedName("period_quantity")
    private Integer periodQuantity;

    @SerializedName("current_period_starts_at")
    private OffsetDateTime currentPeriodStartsAt;

    @SerializedName("current_period_ends_at")
    private OffsetDateTime currentPeriodEndsAt;

    @SerializedName("current_period_paid")
    private Boolean currentPeriodPaid;

    @SerializedName("payer_email")
    private String payerEmail;

    @SerializedName("payer_name")
    private String payerName;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("product_description")
    private String productDescription;

    @SerializedName("success_redirect_url")
    private URI successRedirectUrl;

    @SerializedName("unsuccess_redirect_url")
    private URI unsuccessRedirectUrl;

    @SerializedName("created_at")
    private OffsetDateTime createdAt;

    @SerializedName("cancelled_at")
    private OffsetDateTime cancelledAt;

    /** Creates a new instance of Subscription. */
    public Subscription() {}

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
    public SubscriptionStatus getStatus() {
        return status;
    }

    /**
     * Set status.
     *
     * @param status status
     */
    public void setStatus(final SubscriptionStatus status) {
        this.status = status;
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
     * Get amount.
     *
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Set amount.
     *
     * @param amount amount
     */
    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
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
     * Get period.
     *
     * @return period
     */
    public SubscriptionPeriod getPeriod() {
        return period;
    }

    /**
     * Set period.
     *
     * @param period period
     */
    public void setPeriod(final SubscriptionPeriod period) {
        this.period = period;
    }

    /**
     * Get periodQuantity.
     *
     * @return periodQuantity
     */
    public Integer getPeriodQuantity() {
        return periodQuantity;
    }

    /**
     * Set periodQuantity.
     *
     * @param periodQuantity periodQuantity
     */
    public void setPeriodQuantity(final Integer periodQuantity) {
        this.periodQuantity = periodQuantity;
    }

    /**
     * Get currentPeriodStartsAt.
     *
     * @return currentPeriodStartsAt
     */
    public OffsetDateTime getCurrentPeriodStartsAt() {
        return currentPeriodStartsAt;
    }

    /**
     * Set currentPeriodStartsAt.
     *
     * @param currentPeriodStartsAt currentPeriodStartsAt
     */
    public void setCurrentPeriodStartsAt(final OffsetDateTime currentPeriodStartsAt) {
        this.currentPeriodStartsAt = currentPeriodStartsAt;
    }

    /**
     * Get currentPeriodEndsAt.
     *
     * @return currentPeriodEndsAt
     */
    public OffsetDateTime getCurrentPeriodEndsAt() {
        return currentPeriodEndsAt;
    }

    /**
     * Set currentPeriodEndsAt.
     *
     * @param currentPeriodEndsAt currentPeriodEndsAt
     */
    public void setCurrentPeriodEndsAt(final OffsetDateTime currentPeriodEndsAt) {
        this.currentPeriodEndsAt = currentPeriodEndsAt;
    }

    /**
     * Get currentPeriodPaid.
     *
     * @return currentPeriodPaid
     */
    public Boolean getCurrentPeriodPaid() {
        return currentPeriodPaid;
    }

    /**
     * Set currentPeriodPaid.
     *
     * @param currentPeriodPaid currentPeriodPaid
     */
    public void setCurrentPeriodPaid(final Boolean currentPeriodPaid) {
        this.currentPeriodPaid = currentPeriodPaid;
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

    /**
     * Get payerName.
     *
     * @return payerName
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * Set payerName.
     *
     * @param payerName payerName
     */
    public void setPayerName(final String payerName) {
        this.payerName = payerName;
    }

    /**
     * Get productName.
     *
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Set productName.
     *
     * @param productName productName
     */
    public void setProductName(final String productName) {
        this.productName = productName;
    }

    /**
     * Get productDescription.
     *
     * @return productDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Set productDescription.
     *
     * @param productDescription productDescription
     */
    public void setProductDescription(final String productDescription) {
        this.productDescription = productDescription;
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
     * Get cancelledAt.
     *
     * @return cancelledAt
     */
    public OffsetDateTime getCancelledAt() {
        return cancelledAt;
    }

    /**
     * Set cancelledAt.
     *
     * @param cancelledAt cancelledAt
     */
    public void setCancelledAt(final OffsetDateTime cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subscription(");
        sb.append("id=").append(id).append(", ");
        sb.append("status=").append(status).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("amount=").append(amount).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("period=").append(period).append(", ");
        sb.append("periodQuantity=").append(periodQuantity).append(", ");
        sb.append("currentPeriodStartsAt=").append(currentPeriodStartsAt).append(", ");
        sb.append("currentPeriodEndsAt=").append(currentPeriodEndsAt).append(", ");
        sb.append("currentPeriodPaid=").append(currentPeriodPaid).append(", ");
        sb.append("payerEmail=").append(payerEmail).append(", ");
        sb.append("payerName=").append(payerName).append(", ");
        sb.append("productName=").append(productName).append(", ");
        sb.append("productDescription=").append(productDescription).append(", ");
        sb.append("successRedirectUrl=").append(successRedirectUrl).append(", ");
        sb.append("unsuccessRedirectUrl=").append(unsuccessRedirectUrl).append(", ");
        sb.append("createdAt=").append(createdAt).append(", ");
        sb.append("cancelledAt=").append(cancelledAt);
        sb.append(")");
        return sb.toString();
    }
}
