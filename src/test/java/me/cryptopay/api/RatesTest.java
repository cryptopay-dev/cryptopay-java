// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import java.util.Map;
import me.cryptopay.Cryptopay;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@WireMockTest
public class RatesTest {
    private Cryptopay cryptopay;

    @BeforeEach
    void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        this.cryptopay =
                Cryptopay.builder()
                        .apiUrl(wireMockRuntimeInfo.getHttpBaseUrl())
                        .apiKey("key")
                        .apiSecret("secret")
                        .build();
    }

    @Test
    public void allTest() throws ApiException {
        RatesResult result = cryptopay.rates().all().execute();

        Map<String, Rate> rates = result.getData();
        assertThat(rates, notNullValue());
        assertThat(rates.get("BTC/EUR"), notNullValue());
    }

    @Test
    public void retrieveTest() throws ApiException {
        String baseCurrency = "BTC";
        String quoteCurrency = "EUR";

        RateResult result = cryptopay.rates().retrieve(baseCurrency, quoteCurrency).execute();

        assertThat(result.getData(), notNullValue());
    }
}
