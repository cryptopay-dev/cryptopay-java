// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets CoinWithdrawalCallbackEvent. */
@JsonAdapter(CoinWithdrawalCallbackEvent.Adapter.class)
public enum CoinWithdrawalCallbackEvent {

    /** "created". */
    CREATED("created"),

    /** "status_changed". */
    STATUS_CHANGED("status_changed");

    private String value;

    CoinWithdrawalCallbackEvent(final String value) {
        this.value = value;
    }

    /**
     * Returns CoinWithdrawalCallbackEvent value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new CoinWithdrawalCallbackEvent from value.
     *
     * @param value
     * @return CoinWithdrawalCallbackEvent
     */
    public static CoinWithdrawalCallbackEvent fromValue(final String value) {
        for (CoinWithdrawalCallbackEvent b : CoinWithdrawalCallbackEvent.values()) {
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

    public static final class Adapter extends TypeAdapter<CoinWithdrawalCallbackEvent> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final CoinWithdrawalCallbackEvent enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CoinWithdrawalCallbackEvent read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CoinWithdrawalCallbackEvent.fromValue(value);
        }
    }
}
