// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class InvoiceRecalculationParams {
    @SerializedName("force_commit")
    private Boolean forceCommit;

    /** Creates a new instance of InvoiceRecalculationParams. */
    public InvoiceRecalculationParams() {}

    /**
     * Get forceCommit.
     *
     * @return forceCommit
     */
    public Boolean getForceCommit() {
        return forceCommit;
    }

    /**
     * Set forceCommit.
     *
     * @param forceCommit forceCommit
     */
    public void setForceCommit(final Boolean forceCommit) {
        this.forceCommit = forceCommit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceRecalculationParams(");
        sb.append("forceCommit=").append(forceCommit);
        sb.append(")");
        return sb.toString();
    }
}
