// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class ChannelPaymentResult {
    @SerializedName("data")
    private ChannelPayment data;

    /** Creates a new instance of ChannelPaymentResult. */
    public ChannelPaymentResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public ChannelPayment getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final ChannelPayment data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChannelPaymentResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
