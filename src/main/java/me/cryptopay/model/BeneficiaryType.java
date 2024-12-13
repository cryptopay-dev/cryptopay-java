// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BeneficiaryType. */
@JsonAdapter(BeneficiaryType.Adapter.class)
public enum BeneficiaryType {

    /** "natural_person". */
    NATURAL_PERSON("natural_person"),

    /** "legal_person". */
    LEGAL_PERSON("legal_person");

    private String value;

    BeneficiaryType(final String value) {
        this.value = value;
    }

    /**
     * Returns BeneficiaryType value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new BeneficiaryType from value.
     *
     * @param value
     * @return BeneficiaryType
     */
    public static BeneficiaryType fromValue(final String value) {
        for (BeneficiaryType b : BeneficiaryType.values()) {
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

    public static final class Adapter extends TypeAdapter<BeneficiaryType> {
        @Override
        public void write(final JsonWriter jsonWriter, final BeneficiaryType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BeneficiaryType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BeneficiaryType.fromValue(value);
        }
    }
}
