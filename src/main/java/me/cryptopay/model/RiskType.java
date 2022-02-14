// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Risk analysis type. */
@JsonAdapter(RiskType.Adapter.class)
public enum RiskType {

    /** "source_of_funds". */
    SOURCE_OF_FUNDS("source_of_funds"),

    /** "destination_of_funds". */
    DESTINATION_OF_FUNDS("destination_of_funds");

    private String value;

    RiskType(final String value) {
        this.value = value;
    }

    /**
     * Returns RiskType value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new RiskType from value.
     *
     * @param value
     * @return RiskType
     */
    public static RiskType fromValue(final String value) {
        for (RiskType b : RiskType.values()) {
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

    public static final class Adapter extends TypeAdapter<RiskType> {
        @Override
        public void write(final JsonWriter jsonWriter, final RiskType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public RiskType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return RiskType.fromValue(value);
        }
    }
}
