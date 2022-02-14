// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class CustomerListResult {
    @SerializedName("data")
    private List<Customer> data;

    @SerializedName("meta")
    private Pagination meta;

    /** Creates a new instance of CustomerListResult. */
    public CustomerListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<Customer> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<Customer> data) {
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
        sb.append("CustomerListResult(");
        sb.append("data=").append(data).append(", ");
        sb.append("meta=").append(meta);
        sb.append(")");
        return sb.toString();
    }
}
