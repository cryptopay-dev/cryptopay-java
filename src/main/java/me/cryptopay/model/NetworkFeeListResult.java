// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class NetworkFeeListResult {
    @SerializedName("data")
    private List<NetworkFee> data;

    /** Creates a new instance of NetworkFeeListResult. */
    public NetworkFeeListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<NetworkFee> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<NetworkFee> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkFeeListResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
