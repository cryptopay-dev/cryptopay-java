// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class ChannelListResult {
    @SerializedName("data")
    private List<Channel> data;

    @SerializedName("meta")
    private Pagination meta;

    /** Creates a new instance of ChannelListResult. */
    public ChannelListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<Channel> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<Channel> data) {
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
        sb.append("ChannelListResult(");
        sb.append("data=").append(data).append(", ");
        sb.append("meta=").append(meta);
        sb.append(")");
        return sb.toString();
    }
}
