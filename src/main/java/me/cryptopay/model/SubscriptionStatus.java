// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Subscription status. */
@JsonAdapter(SubscriptionStatus.Adapter.class)
public enum SubscriptionStatus {

    /** "active". */
    ACTIVE("active"),

    /** "cancelled". */
    CANCELLED("cancelled");

    private String value;

    SubscriptionStatus(final String value) {
        this.value = value;
    }

    /**
     * Returns SubscriptionStatus value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new SubscriptionStatus from value.
     *
     * @param value
     * @return SubscriptionStatus
     */
    public static SubscriptionStatus fromValue(final String value) {
        for (SubscriptionStatus b : SubscriptionStatus.values()) {
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

    public static final class Adapter extends TypeAdapter<SubscriptionStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final SubscriptionStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SubscriptionStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SubscriptionStatus.fromValue(value);
        }
    }
}
