// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class CoinWithdrawalResult {
    @SerializedName("data")
    private CoinWithdrawal data;

    /** Creates a new instance of CoinWithdrawalResult. */
    public CoinWithdrawalResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public CoinWithdrawal getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final CoinWithdrawal data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoinWithdrawalResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
