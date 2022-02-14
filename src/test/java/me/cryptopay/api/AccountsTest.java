// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import java.util.UUID;
import me.cryptopay.Cryptopay;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@WireMockTest
public class AccountsTest {
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
    public void listTest() throws ApiException {
        AccountListResult result = cryptopay.accounts().list().execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listTransactionsTest() throws ApiException {
        UUID accountId = UUID.fromString("31804390-d44e-49e9-8698-ca781e0eb806");

        TransactionListResult result = cryptopay.accounts().listTransactions(accountId).execute();

        assertThat(result.getData(), notNullValue());
    }
}
