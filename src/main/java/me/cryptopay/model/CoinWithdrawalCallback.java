// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class CoinWithdrawalCallback implements Callback {
    @SerializedName("type")
    private String type;

    @SerializedName("event")
    private CoinWithdrawalCallbackEvent event;

    @SerializedName("data")
    private CoinWithdrawal data;

    /** Creates a new instance of CoinWithdrawalCallback. */
    public CoinWithdrawalCallback() {}

    /**
     * Get type.
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Set type.
     *
     * @param type type
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Get event.
     *
     * @return event
     */
    public CoinWithdrawalCallbackEvent getEvent() {
        return event;
    }

    /**
     * Set event.
     *
     * @param event event
     */
    public void setEvent(final CoinWithdrawalCallbackEvent event) {
        this.event = event;
    }

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
        sb.append("CoinWithdrawalCallback(");
        sb.append("type=").append(type).append(", ");
        sb.append("event=").append(event).append(", ");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
