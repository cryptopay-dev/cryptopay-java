// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class ChannelResult {
    @SerializedName("data")
    private Channel data;

    /** Creates a new instance of ChannelResult. */
    public ChannelResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public Channel getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final Channel data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChannelResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
