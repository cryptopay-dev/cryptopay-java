package me.cryptopay.net;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.matchesPattern;
import static org.hamcrest.Matchers.not;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class AuthenticationTest {

    @Test
    void applyToParamsTest() throws Exception {
        String appKey = "key123";

        Authentication authentication = new Authentication(appKey, "appSecret");

        Map<String, String> headers = new HashMap<>();

        authentication.apply(
                "POST", URI.create("https://example.com/items"), "{\"id\":\"21\"}", headers);

        assertThat(headers, hasEntry(is("Date"), is(not(emptyString()))));
        assertThat(
                headers,
                hasEntry(is("Authorization"), matchesPattern(String.format("HMAC %s:.+", appKey))));
    }
}
