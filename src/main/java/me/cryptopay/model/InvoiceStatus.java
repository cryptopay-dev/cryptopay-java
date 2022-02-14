// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Invoice status. */
@JsonAdapter(InvoiceStatus.Adapter.class)
public enum InvoiceStatus {

    /** "new". */
    NEW("new"),

    /** "completed". */
    COMPLETED("completed"),

    /** "unresolved". */
    UNRESOLVED("unresolved"),

    /** "refunded". */
    REFUNDED("refunded"),

    /** "cancelled". */
    CANCELLED("cancelled");

    private String value;

    InvoiceStatus(final String value) {
        this.value = value;
    }

    /**
     * Returns InvoiceStatus value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new InvoiceStatus from value.
     *
     * @param value
     * @return InvoiceStatus
     */
    public static InvoiceStatus fromValue(final String value) {
        for (InvoiceStatus b : InvoiceStatus.values()) {
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

    public static final class Adapter extends TypeAdapter<InvoiceStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final InvoiceStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public InvoiceStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return InvoiceStatus.fromValue(value);
        }
    }
}
