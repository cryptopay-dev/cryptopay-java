// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class InvoiceRefundParams {
    @SerializedName("address")
    private String address;

    /** Creates a new instance of InvoiceRefundParams. */
    public InvoiceRefundParams() {}

    /**
     * Get address.
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.
     *
     * @param address address
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceRefundParams(");
        sb.append("address=").append(address);
        sb.append(")");
        return sb.toString();
    }
}
