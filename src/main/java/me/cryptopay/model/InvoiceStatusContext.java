// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Invoice status context. */
@JsonAdapter(InvoiceStatusContext.Adapter.class)
public enum InvoiceStatusContext {

    /** "overpaid". */
    OVERPAID("overpaid"),

    /** "underpaid". */
    UNDERPAID("underpaid"),

    /** "paid_late". */
    PAID_LATE("paid_late"),

    /** "illicit_resource". */
    ILLICIT_RESOURCE("illicit_resource");

    private String value;

    InvoiceStatusContext(final String value) {
        this.value = value;
    }

    /**
     * Returns InvoiceStatusContext value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new InvoiceStatusContext from value.
     *
     * @param value
     * @return InvoiceStatusContext
     */
    public static InvoiceStatusContext fromValue(final String value) {
        for (InvoiceStatusContext b : InvoiceStatusContext.values()) {
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

    public static final class Adapter extends TypeAdapter<InvoiceStatusContext> {
        @Override
        public void write(final JsonWriter jsonWriter, final InvoiceStatusContext enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public InvoiceStatusContext read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return InvoiceStatusContext.fromValue(value);
        }
    }
}
