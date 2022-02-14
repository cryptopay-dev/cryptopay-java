// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class ExchangeTransferResult {
    @SerializedName("data")
    private ExchangeTransfer data;

    /** Creates a new instance of ExchangeTransferResult. */
    public ExchangeTransferResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public ExchangeTransfer getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final ExchangeTransfer data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExchangeTransferResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
