package me.cryptopay.security;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/** Validates HMAC signature. */
public final class HmacValidator {

    private static String secret;

    /**
     * Creates a new instance of HMAC validator.
     *
     * @param secretValue HMAC secret
     */
    public HmacValidator(final String secretValue) {
        this.secret = secretValue;
    }

    /**
     * Validates a signature of a text.
     *
     * @param signature the signature to validate
     * @param str text to sign
     * @return a flag if signature is valid or not
     * @throws Exception if an issue happens during signature algorithms execution
     */
    public boolean validate(final String signature, final String str) throws Exception {
        return secureCompare(HmacEncoder.encodeStr(str, secret), signature);
    }

    private boolean secureCompare(final String a, final String b) {
        byte[] digesta = a.getBytes(StandardCharsets.UTF_8);
        byte[] digestb = b.getBytes(StandardCharsets.UTF_8);

        return MessageDigest.isEqual(digesta, digestb);
    }
}
