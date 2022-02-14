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
public class CustomersTest {
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
    public void createTest() throws ApiException {
        CustomerParams customerParams = new CustomerParams();
        customerParams.setId("CUSTOMER-123");
        customerParams.setCurrency("BTC");
        customerParams.setRefundAddresses(
                Map.of(
                        "BTC", "2NGPwyaRTrKpjf9njHQDfXAReb2iwbYkZrg",
                        "ETH", "0x54baa6f4ff2374b2f8f3a32c0c3dad0acbdb42b2"));

        CustomerResult result = cryptopay.customers().create(customerParams).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listTest() throws ApiException {
        CustomerListResult result = cryptopay.customers().list().execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveTest() throws ApiException {
        String customerId = "CUSTOMER-123";

        CustomerResult result = cryptopay.customers().retrieve(customerId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void updateTest() throws ApiException {
        String customerId = "CUSTOMER-123";

        CustomerUpdateParams customerUpdateParams = new CustomerUpdateParams();
        customerUpdateParams.setRefundAddresses(
                Map.of("BTC", "2N9wPGx67zdSeAbXi15qHgoZ9Hb9Uxhd2uQ"));

        CustomerResult result =
                cryptopay.customers().update(customerId, customerUpdateParams).execute();

        assertThat(result.getData(), notNullValue());
    }
}
