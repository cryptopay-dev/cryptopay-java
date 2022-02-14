// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class InvoiceCallback implements Callback {
    @SerializedName("type")
    private String type;

    @SerializedName("event")
    private InvoiceCallbackEvent event;

    @SerializedName("data")
    private Invoice data;

    /** Creates a new instance of InvoiceCallback. */
    public InvoiceCallback() {}

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
    public InvoiceCallbackEvent getEvent() {
        return event;
    }

    /**
     * Set event.
     *
     * @param event event
     */
    public void setEvent(final InvoiceCallbackEvent event) {
        this.event = event;
    }

    /**
     * Get data.
     *
     * @return data
     */
    public Invoice getData() {
        return data;
    }

    /**
     * Set data.
     *
     * @param data data
     */
    public void setData(final Invoice data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceCallback(");
        sb.append("type=").append(type).append(", ");
        sb.append("event=").append(event).append(", ");
        sb.append("data=").append(data);
        sb.append(")");
        return sb.toString();
    }
}
