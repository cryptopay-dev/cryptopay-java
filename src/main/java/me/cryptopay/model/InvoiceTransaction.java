// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class InvoiceTransaction {
    @SerializedName("txid")
    private String txid;

    @SerializedName("risk")
    private Risk risk;

    /** Creates a new instance of InvoiceTransaction. */
    public InvoiceTransaction() {}

    /**
     * Get txid.
     *
     * @return txid
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Set txid.
     *
     * @param txid txid
     */
    public void setTxid(final String txid) {
        this.txid = txid;
    }

    /**
     * Get risk.
     *
     * @return risk
     */
    public Risk getRisk() {
        return risk;
    }

    /**
     * Set risk.
     *
     * @param risk risk
     */
    public void setRisk(final Risk risk) {
        this.risk = risk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceTransaction(");
        sb.append("txid=").append(txid).append(", ");
        sb.append("risk=").append(risk);
        sb.append(")");
        return sb.toString();
    }
}
