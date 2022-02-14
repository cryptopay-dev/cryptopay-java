// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets CoinWithdrawalStatus. */
@JsonAdapter(CoinWithdrawalStatus.Adapter.class)
public enum CoinWithdrawalStatus {

    /** "new". */
    NEW("new"),

    /** "pending". */
    PENDING("pending"),

    /** "on_hold". */
    ON_HOLD("on_hold"),

    /** "processing". */
    PROCESSING("processing"),

    /** "sent". */
    SENT("sent"),

    /** "completed". */
    COMPLETED("completed"),

    /** "failed". */
    FAILED("failed"),

    /** "cancelled". */
    CANCELLED("cancelled");

    private String value;

    CoinWithdrawalStatus(final String value) {
        this.value = value;
    }

    /**
     * Returns CoinWithdrawalStatus value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new CoinWithdrawalStatus from value.
     *
     * @param value
     * @return CoinWithdrawalStatus
     */
    public static CoinWithdrawalStatus fromValue(final String value) {
        for (CoinWithdrawalStatus b : CoinWithdrawalStatus.values()) {
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

    public static final class Adapter extends TypeAdapter<CoinWithdrawalStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final CoinWithdrawalStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CoinWithdrawalStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CoinWithdrawalStatus.fromValue(value);
        }
    }
}
