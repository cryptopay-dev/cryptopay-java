// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.Map;

public final class RatesResult {
    @SerializedName("data")
    private Map<String, Rate> data;

    /** Creates a new instance of RatesResult. */
    public RatesResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public Map<String, Rate> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final Map<String, Rate> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RatesResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
