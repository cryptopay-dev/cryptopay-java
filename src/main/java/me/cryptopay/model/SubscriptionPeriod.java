// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SubscriptionPeriod. */
@JsonAdapter(SubscriptionPeriod.Adapter.class)
public enum SubscriptionPeriod {

    /** "day". */
    DAY("day"),

    /** "week". */
    WEEK("week"),

    /** "month". */
    MONTH("month"),

    /** "year". */
    YEAR("year");

    private String value;

    SubscriptionPeriod(final String value) {
        this.value = value;
    }

    /**
     * Returns SubscriptionPeriod value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new SubscriptionPeriod from value.
     *
     * @param value
     * @return SubscriptionPeriod
     */
    public static SubscriptionPeriod fromValue(final String value) {
        for (SubscriptionPeriod b : SubscriptionPeriod.values()) {
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

    public static final class Adapter extends TypeAdapter<SubscriptionPeriod> {
        @Override
        public void write(final JsonWriter jsonWriter, final SubscriptionPeriod enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SubscriptionPeriod read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SubscriptionPeriod.fromValue(value);
        }
    }
}
