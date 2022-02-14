// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.UUID;

public final class Account {
    @SerializedName("id")
    private UUID id;

    @SerializedName("currency")
    private String currency;

    @SerializedName("balance")
    private BigDecimal balance;

    @SerializedName("project_id")
    private String projectId;

    /** Creates a new instance of Account. */
    public Account() {}

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
     * Get balance.
     *
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Set balance.
     *
     * @param balance balance
     */
    public void setBalance(final BigDecimal balance) {
        this.balance = balance;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account(");
        sb.append("id=").append(id).append(", ");
        sb.append("currency=").append(currency).append(", ");
        sb.append("balance=").append(balance).append(", ");
        sb.append("projectId=").append(projectId);
        sb.append(")");
        return sb.toString();
    }
}
