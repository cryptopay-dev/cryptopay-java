// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class InvoiceResult {
    @SerializedName("data")
    private Invoice data;

    /** Creates a new instance of InvoiceResult. */
    public InvoiceResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public Invoice getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final Invoice data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
