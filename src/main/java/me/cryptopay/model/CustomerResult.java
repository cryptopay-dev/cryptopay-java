// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class CustomerResult {
    @SerializedName("data")
    private Customer data;

    /** Creates a new instance of CustomerResult. */
    public CustomerResult() {}

    /**
     * Get data.
     *
     * @return data
     */
    public Customer getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final Customer data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerResult(");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
