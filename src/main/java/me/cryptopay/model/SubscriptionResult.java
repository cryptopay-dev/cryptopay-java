// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class SubscriptionResult {
    @SerializedName("data")
    private Subscription data;

    /** Creates a new instance of SubscriptionResult. */
    public SubscriptionResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public Subscription getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final Subscription data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscriptionResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
