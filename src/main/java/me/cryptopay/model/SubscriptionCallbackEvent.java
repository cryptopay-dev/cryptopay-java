// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SubscriptionCallbackEvent. */
@JsonAdapter(SubscriptionCallbackEvent.Adapter.class)
public enum SubscriptionCallbackEvent {

    /** "paid". */
    PAID("paid"),

    /** "cancelled". */
    CANCELLED("cancelled");

    private String value;

    SubscriptionCallbackEvent(final String value) {
        this.value = value;
    }

    /**
     * Returns SubscriptionCallbackEvent value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new SubscriptionCallbackEvent from value.
     *
     * @param value
     * @return SubscriptionCallbackEvent
     */
    public static SubscriptionCallbackEvent fromValue(final String value) {
        for (SubscriptionCallbackEvent b : SubscriptionCallbackEvent.values()) {
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

    public static final class Adapter extends TypeAdapter<SubscriptionCallbackEvent> {
        @Override
        public void write(final JsonWriter jsonWriter, final SubscriptionCallbackEvent enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SubscriptionCallbackEvent read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SubscriptionCallbackEvent.fromValue(value);
        }
    }
}
