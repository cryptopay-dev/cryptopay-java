// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class InvoiceRefundListResult {
    @SerializedName("data")
    private List<InvoiceRefund> data;

    /** Creates a new instance of InvoiceRefundListResult. */
    public InvoiceRefundListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<InvoiceRefund> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<InvoiceRefund> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceRefundListResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
