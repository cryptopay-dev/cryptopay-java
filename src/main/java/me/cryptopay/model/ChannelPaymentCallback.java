// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class ChannelPaymentCallback implements Callback {
    @SerializedName("type")
    private String type;

    @SerializedName("event")
    private ChannelPaymentCallbackEvent event;

    @SerializedName("data")
    private ChannelPayment data;

    /** Creates a new instance of ChannelPaymentCallback. */
    public ChannelPaymentCallback() {}

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
    public ChannelPaymentCallbackEvent getEvent() {
        return event;
    }

    /**
     * Set event.
     *
     * @param event event
     */
    public void setEvent(final ChannelPaymentCallbackEvent event) {
        this.event = event;
    }

    /**
     * Get data.
     *
     * @return data
     */
    public ChannelPayment getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final ChannelPayment data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChannelPaymentCallback(");
        sb.append("type=").append(type).append(", ");
        sb.append("event=").append(event).append(", ");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
