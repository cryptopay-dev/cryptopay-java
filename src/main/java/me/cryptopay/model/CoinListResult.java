// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class CoinListResult {
    @SerializedName("data")
    private List<Coin> data;

    /** Creates a new instance of CoinListResult. */
    public CoinListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<Coin> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<Coin> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoinListResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
