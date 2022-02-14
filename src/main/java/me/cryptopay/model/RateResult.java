// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class RateResult {
    @SerializedName("data")
    private Rate data;

    /** Creates a new instance of RateResult. */
    public RateResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public Rate getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final Rate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RateResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
