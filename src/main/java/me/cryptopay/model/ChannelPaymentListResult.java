// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class ChannelPaymentListResult {
    @SerializedName("data")
    private List<ChannelPayment> data;

    @SerializedName("meta")
    private Pagination meta;

    /** Creates a new instance of ChannelPaymentListResult. */
    public ChannelPaymentListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<ChannelPayment> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<ChannelPayment> data) {
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
        sb.append("ChannelPaymentListResult(");
        sb.append("data=").append(data).append(", ");
        sb.append("meta=").append(meta);
        sb.append(")");
        return sb.toString();
    }
}
