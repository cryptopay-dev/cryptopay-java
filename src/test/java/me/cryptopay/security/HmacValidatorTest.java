package me.cryptopay.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class HmacValidatorTest {

    @Test
    void validateSignatureValidTest() throws Exception {
        HmacValidator validator = new HmacValidator("dsgFEG8Ef663J7ff31-KFW9jf66w0K");

        boolean result =
                validator.validate(
                        "48f6618904af38a6457c9ad037fc2bde58b85bacafb07dda3d9f2be03e659b4d",
                        "{\"event\":\"transaction_created\",\"status\":\"success\"}");
        assertThat(result, is(true));
    }

    @Test
    void validateSignatureInvalidTest() throws Exception {
        HmacValidator validator = new HmacValidator("YH6gf8Kh_yJJD863jdHgf8K");

        boolean result =
                validator.validate(
                        "ae87cf6b1cbe8775cef11e824495ea282fa822f4df99a37a4736f43c4687ba1e",
                        "{\"event\":\"transaction_created\",\"status\":\"failure\"}");
        assertThat(result, is(false));
    }
}
