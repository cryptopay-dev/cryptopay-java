// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class CoinWithdrawalListResult {
    @SerializedName("data")
    private List<CoinWithdrawal> data;

    @SerializedName("meta")
    private Pagination meta;

    /** Creates a new instance of CoinWithdrawalListResult. */
    public CoinWithdrawalListResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public List<CoinWithdrawal> getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final List<CoinWithdrawal> data) {
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
        sb.append("CoinWithdrawalListResult(");
        sb.append("data=").append(data).append(", ");
        sb.append("meta=").append(meta);
        sb.append(")");
        return sb.toString();
    }
}
