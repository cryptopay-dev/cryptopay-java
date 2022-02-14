// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NetworkFeeLevel. */
@JsonAdapter(NetworkFeeLevel.Adapter.class)
public enum NetworkFeeLevel {

    /** "fast". */
    FAST("fast"),

    /** "average". */
    AVERAGE("average"),

    /** "slow". */
    SLOW("slow");

    private String value;

    NetworkFeeLevel(final String value) {
        this.value = value;
    }

    /**
     * Returns NetworkFeeLevel value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new NetworkFeeLevel from value.
     *
     * @param value
     * @return NetworkFeeLevel
     */
    public static NetworkFeeLevel fromValue(final String value) {
        for (NetworkFeeLevel b : NetworkFeeLevel.values()) {
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

    public static final class Adapter extends TypeAdapter<NetworkFeeLevel> {
        @Override
        public void write(final JsonWriter jsonWriter, final NetworkFeeLevel enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NetworkFeeLevel read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NetworkFeeLevel.fromValue(value);
        }
    }
}
