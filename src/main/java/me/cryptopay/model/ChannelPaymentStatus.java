// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ChannelPaymentStatus. */
@JsonAdapter(ChannelPaymentStatus.Adapter.class)
public enum ChannelPaymentStatus {

    /** "pending". */
    PENDING("pending"),

    /** "on_hold". */
    ON_HOLD("on_hold"),

    /** "completed". */
    COMPLETED("completed"),

    /** "refunded". */
    REFUNDED("refunded"),

    /** "cancelled". */
    CANCELLED("cancelled");

    private String value;

    ChannelPaymentStatus(final String value) {
        this.value = value;
    }

    /**
     * Returns ChannelPaymentStatus value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new ChannelPaymentStatus from value.
     *
     * @param value
     * @return ChannelPaymentStatus
     */
    public static ChannelPaymentStatus fromValue(final String value) {
        for (ChannelPaymentStatus b : ChannelPaymentStatus.values()) {
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

    public static final class Adapter extends TypeAdapter<ChannelPaymentStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final ChannelPaymentStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ChannelPaymentStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ChannelPaymentStatus.fromValue(value);
        }
    }
}
