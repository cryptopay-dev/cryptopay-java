// Auto-generated file
// DO NOT EDIT

package me.cryptopay;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import me.cryptopay.model.*;

public class JSON {
    private final Gson gson;

    /** Creates a new instance of JSON encoder/decoder. */
    public JSON() {
        OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter =
                new OffsetDateTimeTypeAdapter(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        this.gson =
                createGson()
                        .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
                        .create();
    }

    private static GsonBuilder createGson() {
        GsonFireBuilder builder = new GsonFireBuilder();

        builder.registerTypeSelector(
                Callback.class,
                new TypeSelector<Callback>() {
                    @Override
                    public Class<? extends Callback> getClassForElement(
                            final JsonElement readElement) {
                        JsonElement el = readElement.getAsJsonObject().get("type");
                        if (el == null) {
                            throw new IllegalArgumentException(
                                    "missing discriminator field: <type>");
                        }
                        String discriminator = el.getAsString();

                        switch (discriminator) {
                            case "ChannelPayment":
                                return ChannelPaymentCallback.class;
                            case "ChannelPaymentCallback":
                                return ChannelPaymentCallback.class;
                            case "CoinWithdrawal":
                                return CoinWithdrawalCallback.class;
                            case "CoinWithdrawalCallback":
                                return CoinWithdrawalCallback.class;
                            case "Invoice":
                                return InvoiceCallback.class;
                            case "InvoiceCallback":
                                return InvoiceCallback.class;
                            default:
                                throw new IllegalArgumentException(
                                        "cannot determine model class of name: <"
                                                + discriminator
                                                + ">");
                        }
                    }
                });

        return builder.createGsonBuilder();
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(final Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T> Type
     * @param body The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    public <T> T deserialize(final String body, final Class<T> returnType) {
        return gson.fromJson(body, returnType);
    }

    private static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {
        private static final String ZERO_OFFSET = "+0000";
        private DateTimeFormatter formatter;

        OffsetDateTimeTypeAdapter(final DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        @Override
        public void write(final JsonWriter out, final OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(final JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith(ZERO_OFFSET)) {
                        date = date.substring(0, date.length() - ZERO_OFFSET.length()) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }
}
