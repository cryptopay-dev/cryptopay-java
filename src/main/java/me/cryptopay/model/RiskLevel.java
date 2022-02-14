// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Transaction risk level depending on the &#x60;score&#x60; value. */
@JsonAdapter(RiskLevel.Adapter.class)
public enum RiskLevel {

    /** "low". */
    LOW("low"),

    /** "medium". */
    MEDIUM("medium"),

    /** "high". */
    HIGH("high");

    private String value;

    RiskLevel(final String value) {
        this.value = value;
    }

    /**
     * Returns RiskLevel value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new RiskLevel from value.
     *
     * @param value
     * @return RiskLevel
     */
    public static RiskLevel fromValue(final String value) {
        for (RiskLevel b : RiskLevel.values()) {
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

    public static final class Adapter extends TypeAdapter<RiskLevel> {
        @Override
        public void write(final JsonWriter jsonWriter, final RiskLevel enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public RiskLevel read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return RiskLevel.fromValue(value);
        }
    }
}
