package me.cryptopay.security;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import me.cryptopay.util.StringUtils;

/** Encodes data using HMAC algorithms. */
public final class HmacEncoder {

    private static final String SHA1 = "HmacSHA1";
    private static final String SHA256 = "HmacSHA256";

    private static final int HEX_RADIX = 16;
    private static final char MAX_HEX = 0xF;
    private static final int HALF_BYTE_BITS = 4;

    private HmacEncoder() {}

    /**
     * Encodes request parameters using HMAC algorithm.
     *
     * @param data data to encode
     * @return signature of the data
     * @throws Exception if the data can't be encoded successfully
     */
    public static String encodeRequest(final HmacEncoder.Data data) throws Exception {
        String bodyMD5 = StringUtils.isEmpty(data.body) ? "" : md5hex(data.body);

        String stringToSign =
                String.join("\n", data.method, bodyMD5, data.contentType, data.date, data.path);

        return Base64.getEncoder().encodeToString(hmac(stringToSign, data.secret, SHA1));
    }

    /**
     * Encodes a string using HMAC algorithm and provided secret.
     *
     * @param str string to encode
     * @param secret secret to encode with
     * @return encoded string
     * @throws Exception if the string can't be encoded successfully
     */
    public static String encodeStr(final String str, final String secret) throws Exception {
        return hex(hmac(str, secret, SHA256));
    }

    /** Contains the data, required for encoding. */
    public static class Data {

        private String secret;

        private String method;

        private String body;

        private String date;

        private String path;

        private String contentType;

        /**
         * Returns API secret.
         *
         * @return API secret
         */
        public String getSecret() {
            return secret;
        }

        /**
         * Sets API secret.
         *
         * @param secret API secret
         */
        public void setSecret(final String secret) {
            this.secret = secret;
        }

        /**
         * Returns HTTP-request method.
         *
         * @return request method
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets HTTP-request method.
         *
         * @param method request method
         */
        public void setMethod(final String method) {
            this.method = method;
        }

        /**
         * Returns HTTP-request body.
         *
         * @return request body
         */
        public String getBody() {
            return body;
        }

        /**
         * Sets HTTP-request body.
         *
         * @param body request body
         */
        public void setBody(final String body) {
            this.body = body;
        }

        /**
         * Returns a date of HTTP-request.
         *
         * @return date in string format
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the date of HTTP-request.
         *
         * @param date date in string format
         */
        public void setDate(final String date) {
            this.date = date;
        }

        /**
         * Returns HTTP-request path.
         *
         * @return path
         */
        public String getPath() {
            return path;
        }

        /**
         * Sets HTTP-request path.
         *
         * @param path path
         */
        public void setPath(final String path) {
            this.path = path;
        }

        /**
         * Returns HTTP-request content type.
         *
         * @return content type
         */
        public String getContentType() {
            return contentType;
        }

        /**
         * Sets HTTP-request content type.
         *
         * @param contentType content type
         */
        public void setContentType(final String contentType) {
            this.contentType = contentType;
        }
    }

    private static byte[] hmac(final String str, final String secret, final String algorithm)
            throws Exception {
        SecretKeySpec secretKey =
                new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), algorithm);

        Mac mac = Mac.getInstance(algorithm);
        mac.init(secretKey);

        return mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    private static String md5hex(final String str) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(str.getBytes(StandardCharsets.UTF_8));

        return hex(bytes);
    }

    private static String hex(final byte[] bytes) {
        StringBuilder sb = new StringBuilder();

        for (byte b : bytes) {
            sb.append(byteToHex(b));
        }

        return sb.toString();
    }

    private static char[] byteToHex(final byte num) {
        char[] hexDigits = new char[2];

        hexDigits[0] = Character.forDigit((num >> HALF_BYTE_BITS) & MAX_HEX, HEX_RADIX);
        hexDigits[1] = Character.forDigit((num & MAX_HEX), HEX_RADIX);

        return hexDigits;
    }
}
