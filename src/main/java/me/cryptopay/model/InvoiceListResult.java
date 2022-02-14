// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class InvoiceListResult {
    @SerializedName("data")
    private List<Invoice> data;

    @SerializedName("meta")
    private Pagination meta;

    /** Creates a new instance of InvoiceListResult. */
    public InvoiceListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<Invoice> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<Invoice> data) {
        this.data = data;
    }

    /**
     * Get meta.
     *
     * @return meta
     */
    public Pagination getMeta() {
        return meta;
    }

    /**
     * Set meta.
     *
     * @param meta meta
     */
    public void setMeta(final Pagination meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceListResult(");
        sb.append("data=").append(data).append(", ");
        sb.append("meta=").append(meta);
        sb.append(")");
        return sb.toString();
    }
}
