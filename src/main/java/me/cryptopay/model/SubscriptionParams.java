// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;

public final class SubscriptionParams {
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

    @SerializedName("starts_at")
    private OffsetDateTime startsAt;

    @SerializedName("payer_email")
    private String payerEmail;

    @SerializedName("payer_name")
    private String payerName;

    @SerializedName("custom_id")
    private String customId;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("product_description")
    private String productDescription;

    @SerializedName("success_redirect_url")
    private URI successRedirectUrl;

    @SerializedName("unsuccess_redirect_url")
    private URI unsuccessRedirectUrl;

    /** Creates a new instance of SubscriptionParams. */
    public SubscriptionParams() {}

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
     * Get startsAt.
     *
     * @return startsAt
     */
    public OffsetDateTime getStartsAt() {
        return startsAt;
    }

    /**
     * Set startsAt.
     *
     * @param startsAt startsAt
     */
    public void setStartsAt(final OffsetDateTime startsAt) {
        this.startsAt = startsAt;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscriptionParams(");
        sb.append("name=").append(name).append(", ");
        sb.append("amount=").append(amount).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("period=").append(period).append(", ");
        sb.append("periodQuantity=").append(periodQuantity).append(", ");
        sb.append("startsAt=").append(startsAt).append(", ");
        sb.append("payerEmail=").append(payerEmail).append(", ");
        sb.append("payerName=").append(payerName).append(", ");
        sb.append("customId=").append(customId).append(", ");
        sb.append("productName=").append(productName).append(", ");
        sb.append("productDescription=").append(productDescription).append(", ");
        sb.append("successRedirectUrl=").append(successRedirectUrl).append(", ");
        sb.append("unsuccessRedirectUrl=").append(unsuccessRedirectUrl);
        sb.append(")");
        return sb.toString();
    }
}
