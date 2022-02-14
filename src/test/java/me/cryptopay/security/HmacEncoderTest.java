package me.cryptopay.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class HmacEncoderTest {

    @Test
    public void encodeRequestTest() throws Exception {
        HmacEncoder.Data data = new HmacEncoder.Data();

        data.setMethod("POST");
        data.setContentType("application/json");
        data.setPath("/api/items");
        data.setBody("{\"count\":\"1\"}");
        data.setDate("Thu, 6 Jan 2022 12:09:25 GMT");
        data.setSecret("kJFE6jF6f97FFsfeYhfw_73KJDlf73kF7J");

        String result = HmacEncoder.encodeRequest(data);

        assertThat(result, is("tji3k+LpWAnLuv6t109mwdQ16zs="));
    }

    @Test
    public void encodeStrTest() throws Exception {
        String result =
                HmacEncoder.encodeStr(
                        "{\"amount\":\"4\",\"price\":\"2.0\",\"item\":\"jeans\"}",
                        "gkgkGG6834KJC7JJks7Df3-8JJFeiv72H53DFggg3");

        assertThat(result, is("93ab032f2eeefbbd3205b25ce7062b0fef8b96c1c83f6dfd8bd85acd4983f4f7"));
    }
}
