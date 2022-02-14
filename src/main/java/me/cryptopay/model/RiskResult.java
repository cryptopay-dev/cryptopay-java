// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class RiskResult {
    @SerializedName("data")
    private Risk data;

    /** Creates a new instance of RiskResult. */
    public RiskResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public Risk getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final Risk data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RiskResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
