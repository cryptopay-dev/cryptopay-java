// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ChannelStatus. */
@JsonAdapter(ChannelStatus.Adapter.class)
public enum ChannelStatus {

    /** "enabled". */
    ENABLED("enabled"),

    /** "disabled". */
    DISABLED("disabled");

    private String value;

    ChannelStatus(final String value) {
        this.value = value;
    }

    /**
     * Returns ChannelStatus value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new ChannelStatus from value.
     *
     * @param value
     * @return ChannelStatus
     */
    public static ChannelStatus fromValue(final String value) {
        for (ChannelStatus b : ChannelStatus.values()) {
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

    public static final class Adapter extends TypeAdapter<ChannelStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final ChannelStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ChannelStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ChannelStatus.fromValue(value);
        }
    }
}
