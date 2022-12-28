// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import java.util.List;
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
        CustomerAddress customerAddress = new CustomerAddress();
        customerAddress.setAddress("2NGPwyaRTrKpjf9njHQDfXAReb2iwbYkZrg");
        customerAddress.setCurrency("BTC");
        customerAddress.setNetwork("bitcoin");

        CustomerParams customerParams = new CustomerParams();
        customerParams.setId("CUSTOMER-123");
        customerParams.setCurrency("BTC");
        customerParams.setAddresses(List.of(customerAddress));

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

        CustomerAddress customerAddress = new CustomerAddress();
        customerAddress.setAddress("2N9wPGx67zdSeAbXi15qHgoZ9Hb9Uxhd2uQ");
        customerAddress.setCurrency("BTC");
        customerAddress.setNetwork("bitcoin");

        CustomerUpdateParams customerUpdateParams = new CustomerUpdateParams();
        customerUpdateParams.setAddresses(List.of(customerAddress));

        CustomerResult result =
                cryptopay.customers().update(customerId, customerUpdateParams).execute();

        assertThat(result.getData(), notNullValue());
    }
}
