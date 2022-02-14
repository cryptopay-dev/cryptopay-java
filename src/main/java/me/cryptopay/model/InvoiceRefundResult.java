// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class InvoiceRefundResult {
    @SerializedName("data")
    private InvoiceRefund data;

    /** Creates a new instance of InvoiceRefundResult. */
    public InvoiceRefundResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public InvoiceRefund getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final InvoiceRefund data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceRefundResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
