// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ChannelPaymentStatusContext. */
@JsonAdapter(ChannelPaymentStatusContext.Adapter.class)
public enum ChannelPaymentStatusContext {

    /** "illicit_resource". */
    ILLICIT_RESOURCE("illicit_resource"),

    /** "channel_disabled". */
    CHANNEL_DISABLED("channel_disabled");

    private String value;

    ChannelPaymentStatusContext(final String value) {
        this.value = value;
    }

    /**
     * Returns ChannelPaymentStatusContext value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new ChannelPaymentStatusContext from value.
     *
     * @param value
     * @return ChannelPaymentStatusContext
     */
    public static ChannelPaymentStatusContext fromValue(final String value) {
        for (ChannelPaymentStatusContext b : ChannelPaymentStatusContext.values()) {
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

    public static final class Adapter extends TypeAdapter<ChannelPaymentStatusContext> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ChannelPaymentStatusContext enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ChannelPaymentStatusContext read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ChannelPaymentStatusContext.fromValue(value);
        }
    }
}
