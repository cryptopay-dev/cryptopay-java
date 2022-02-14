// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets InvoiceCallbackEvent. */
@JsonAdapter(InvoiceCallbackEvent.Adapter.class)
public enum InvoiceCallbackEvent {

    /** "created". */
    CREATED("created"),

    /** "refunded". */
    REFUNDED("refunded"),

    /** "recalculated". */
    RECALCULATED("recalculated"),

    /** "status_changed". */
    STATUS_CHANGED("status_changed"),

    /** "transaction_created". */
    TRANSACTION_CREATED("transaction_created"),

    /** "transaction_confirmed". */
    TRANSACTION_CONFIRMED("transaction_confirmed");

    private String value;

    InvoiceCallbackEvent(final String value) {
        this.value = value;
    }

    /**
     * Returns InvoiceCallbackEvent value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new InvoiceCallbackEvent from value.
     *
     * @param value
     * @return InvoiceCallbackEvent
     */
    public static InvoiceCallbackEvent fromValue(final String value) {
        for (InvoiceCallbackEvent b : InvoiceCallbackEvent.values()) {
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

    public static final class Adapter extends TypeAdapter<InvoiceCallbackEvent> {
        @Override
        public void write(final JsonWriter jsonWriter, final InvoiceCallbackEvent enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public InvoiceCallbackEvent read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return InvoiceCallbackEvent.fromValue(value);
        }
    }
}
