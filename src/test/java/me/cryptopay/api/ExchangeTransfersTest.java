// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import java.math.BigDecimal;
import java.util.UUID;
import me.cryptopay.Cryptopay;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@WireMockTest
public class ExchangeTransfersTest {
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
    public void commitTest() throws ApiException {
        ExchangeTransferParams exchangeTransferParams = new ExchangeTransferParams();
        exchangeTransferParams.setChargedAmount(BigDecimal.valueOf(10));
        exchangeTransferParams.setChargedCurrency("EUR");
        exchangeTransferParams.setReceivedCurrency("BTC");
        exchangeTransferParams.setForceCommit(false);

        ExchangeTransfer exchangeTransfer =
                cryptopay.exchangeTransfers().create(exchangeTransferParams).execute().getData();

        ExchangeTransferResult result =
                cryptopay.exchangeTransfers().commit(exchangeTransfer.getId()).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void createTest() throws ApiException {
        ExchangeTransferParams exchangeTransferParams = new ExchangeTransferParams();
        exchangeTransferParams.setChargedAmount(BigDecimal.valueOf(10));
        exchangeTransferParams.setChargedCurrency("EUR");
        exchangeTransferParams.setReceivedCurrency("BTC");
        exchangeTransferParams.setForceCommit(false);

        ExchangeTransferResult result =
                cryptopay.exchangeTransfers().create(exchangeTransferParams).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveTest() throws ApiException {
        UUID exchangeTransferId = UUID.fromString("2c090f99-7cc1-40da-9bca-7caa57b4ebfb");

        ExchangeTransferResult result =
                cryptopay.exchangeTransfers().retrieve(exchangeTransferId).execute();

        assertThat(result.getData(), notNullValue());
    }
}
