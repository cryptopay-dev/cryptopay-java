package me.cryptopay.callback;


import me.cryptopay.JSON;
import me.cryptopay.model.Callback;
import me.cryptopay.security.HmacValidator;

/** Parses a JSON-string into {@link Callback} object. */
public class CallbackParser {

    private static HmacValidator validator;
    private static JSON json;

    /**
     * Creates a new instance of callback parser.
     *
     * @param hmacValidator HMAC validator
     * @param json JSON decoder
     */
    public CallbackParser(final HmacValidator hmacValidator, final JSON json) {
        this.validator = hmacValidator;
        this.json = json;
    }

    /**
     * Validates JSON-string against signature.
     *
     * @param signature the signature to validate
     * @param data json-string to sign
     * @return a flag if signature is valid or not
     * @throws Exception if an issue happens during signature algorithms execution
     */
    public boolean validate(final String signature, final String data) throws Exception {
        return validator.validate(signature, data);
    }

    /**
     * Parses JSON-string to create a callback object.
     *
     * @param data json-string to parse
     * @return callback object
     * @throws Exception if json-string can't be parsed successfully
     */
    public Callback parse(final String data) throws Exception {
        return json.deserialize(data, Callback.class);
    }
}
