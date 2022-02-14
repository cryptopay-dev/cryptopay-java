// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ChannelPaymentCallbackEvent. */
@JsonAdapter(ChannelPaymentCallbackEvent.Adapter.class)
public enum ChannelPaymentCallbackEvent {

    /** "created". */
    CREATED("created"),

    /** "on_hold". */
    ON_HOLD("on_hold"),

    /** "completed". */
    COMPLETED("completed"),

    /** "refunded". */
    REFUNDED("refunded"),

    /** "cancelled". */
    CANCELLED("cancelled");

    private String value;

    ChannelPaymentCallbackEvent(final String value) {
        this.value = value;
    }

    /**
     * Returns ChannelPaymentCallbackEvent value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new ChannelPaymentCallbackEvent from value.
     *
     * @param value
     * @return ChannelPaymentCallbackEvent
     */
    public static ChannelPaymentCallbackEvent fromValue(final String value) {
        for (ChannelPaymentCallbackEvent b : ChannelPaymentCallbackEvent.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static final class Adapter extends TypeAdapter<ChannelPaymentCallbackEvent> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ChannelPaymentCallbackEvent enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ChannelPaymentCallbackEvent read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ChannelPaymentCallbackEvent.fromValue(value);
        }
    }
}
