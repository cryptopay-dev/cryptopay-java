// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Map;
import java.util.UUID;
import me.cryptopay.Cryptopay;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@WireMockTest
public class InvoicesTest {
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
    public void commitRecalculationTest() throws ApiException {
        UUID invoiceId = UUID.fromString("2738682a-11ff-4013-8380-6a70df995ea9");

        InvoiceRecalculationParams invoiceRecalculationParams = new InvoiceRecalculationParams();
        invoiceRecalculationParams.setForceCommit(false);

        InvoiceRecalculation recalculation =
                cryptopay
                        .invoices()
                        .createRecalculation(invoiceId, invoiceRecalculationParams)
                        .execute()
                        .getData();

        InvoiceRecalculationResult result =
                cryptopay
                        .invoices()
                        .commitRecalculation(invoiceId, recalculation.getId())
                        .execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void createTest() throws ApiException {
        InvoiceParams invoiceParams = new InvoiceParams();
        invoiceParams.setCustomId("PAYMENT-123");
        invoiceParams.setPayCurrency("BTC");
        invoiceParams.setPriceAmount(BigDecimal.valueOf(100.0));
        invoiceParams.setPriceCurrency("EUR");
        invoiceParams.setMetadata(Map.of("custom-key", "custom-value"));
        invoiceParams.setSuccessRedirectUrl(URI.create("https://success.example.com"));
        invoiceParams.setUnsuccessRedirectUrl(URI.create("https://unsuccess.example.com"));

        InvoiceResult result = cryptopay.invoices().create(invoiceParams).execute();

        Invoice invoice = result.getData();
        assertThat(invoice.getId(), notNullValue());
        assertThat(invoice.getMetadata().get("custom-key"), is("custom-value"));
    }

    @Test
    public void createRecalculationTest() throws ApiException {
        UUID invoiceId = UUID.fromString("2738682a-11ff-4013-8380-6a70df995ea9");

        InvoiceRecalculationParams invoiceRecalculationParams = new InvoiceRecalculationParams();
        invoiceRecalculationParams.setForceCommit(false);

        InvoiceRecalculationResult result =
                cryptopay
                        .invoices()
                        .createRecalculation(invoiceId, invoiceRecalculationParams)
                        .execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void createRefundTest() throws ApiException {
        UUID invoiceId = UUID.fromString("7e274430-e20f-4321-8748-20824287ae44");

        InvoiceRefundParams invoiceRefundParams = new InvoiceRefundParams();
        invoiceRefundParams.setAddress("0xf3532c1fd002665ec54d46a50787e0c69c76cd44");

        InvoiceRefundResult result =
                cryptopay.invoices().createRefund(invoiceId, invoiceRefundParams).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listTest() throws ApiException {
        InvoiceListResult result = cryptopay.invoices().list().execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listRefundsTest() throws ApiException {
        UUID invoiceId = UUID.fromString("7e274430-e20f-4321-8748-20824287ae44");

        InvoiceRefundListResult result = cryptopay.invoices().listRefunds(invoiceId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveTest() throws ApiException {
        UUID invoiceId = UUID.fromString("c8233d57-78c8-4c36-b35e-940ae9067c78");

        InvoiceResult result = cryptopay.invoices().retrieve(invoiceId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveByCustomIdTest() throws ApiException {
        String customId = "PAYMENT-123";

        InvoiceResult result = cryptopay.invoices().retrieveByCustomId("PAYMENT-123").execute();

        assertThat(result.getData(), notNullValue());
    }
}
