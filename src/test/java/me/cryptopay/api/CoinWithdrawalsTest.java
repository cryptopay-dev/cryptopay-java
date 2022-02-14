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
public class CoinWithdrawalsTest {
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
        CoinWithdrawalParams coinWithdrawalParams = new CoinWithdrawalParams();
        coinWithdrawalParams.setAddress("2Mz3bcjSVHG8uQJpNjmCxp24VdTjwaqmFcJ");
        coinWithdrawalParams.setChargedAmount(BigDecimal.valueOf(100.0));
        coinWithdrawalParams.setChargedCurrency("EUR");
        coinWithdrawalParams.setReceivedCurrency("BTC");
        coinWithdrawalParams.setForceCommit(false);

        CoinWithdrawal coinWithdrawal =
                cryptopay.coinWithdrawals().create(coinWithdrawalParams).execute().getData();

        CoinWithdrawalResult result =
                cryptopay.coinWithdrawals().commit(coinWithdrawal.getId()).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void createTest() throws ApiException {
        CoinWithdrawalParams coinWithdrawalParams = new CoinWithdrawalParams();
        coinWithdrawalParams.setAddress("2Mz3bcjSVHG8uQJpNjmCxp24VdTjwaqmFcJ");
        coinWithdrawalParams.setChargedAmount(BigDecimal.valueOf(100.0));
        coinWithdrawalParams.setChargedCurrency("EUR");
        coinWithdrawalParams.setReceivedCurrency("BTC");
        coinWithdrawalParams.setForceCommit(false);

        CoinWithdrawalResult result =
                cryptopay.coinWithdrawals().create(coinWithdrawalParams).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listTest() throws ApiException {
        CoinWithdrawalListResult result = cryptopay.coinWithdrawals().list().execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listNetworkFeesTest() throws ApiException {
        NetworkFeeListResult result = cryptopay.coinWithdrawals().listNetworkFees().execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveTest() throws ApiException {
        UUID coinWithdrawalId = UUID.fromString("3cf9d1c4-6191-4826-8cae-2c717810c7e9");

        CoinWithdrawalResult result =
                cryptopay.coinWithdrawals().retrieve(coinWithdrawalId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveByCustomIdTest() throws ApiException {
        String customId = "PAYMENT-123";

        CoinWithdrawalResult result =
                cryptopay.coinWithdrawals().retrieveByCustomId(customId).execute();

        assertThat(result.getData(), notNullValue());
    }
}
