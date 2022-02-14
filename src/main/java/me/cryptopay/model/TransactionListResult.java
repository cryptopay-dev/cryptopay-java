// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class TransactionListResult {
    @SerializedName("data")
    private List<Transaction> data;

    @SerializedName("meta")
    private Pagination meta;

    /** Creates a new instance of TransactionListResult. */
    public TransactionListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<Transaction> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<Transaction> data) {
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
        sb.append("TransactionListResult(");
        sb.append("data=").append(data).append(", ");
        sb.append("meta=").append(meta);
        sb.append(")");
        return sb.toString();
    }
}
