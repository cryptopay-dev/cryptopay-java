// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class InvoiceRecalculationResult {
    @SerializedName("data")
    private InvoiceRecalculation data;

    /** Creates a new instance of InvoiceRecalculationResult. */
    public InvoiceRecalculationResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public InvoiceRecalculation getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final InvoiceRecalculation data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceRecalculationResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
