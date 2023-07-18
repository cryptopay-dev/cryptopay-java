// Auto-generated file
// DO NOT EDIT

package me.cryptopay.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import me.cryptopay.Cryptopay;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@WireMockTest
public class SubscriptionsTest {
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
    public void cancelTest() throws ApiException {
        UUID subscriptionId = UUID.fromString("64249ede-8969-4d5c-a042-806f9c3e7db3");

        SubscriptionResult result = cryptopay.subscriptions().cancel(subscriptionId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void createTest() throws ApiException {
        SubscriptionParams subscriptionParams = new SubscriptionParams();
        subscriptionParams.setName("Subscription name");
        subscriptionParams.setAmount(BigDecimal.valueOf(100.0));
        subscriptionParams.setCurrency("EUR");
        subscriptionParams.setPeriod(SubscriptionPeriod.MONTH);
        subscriptionParams.setPeriodQuantity(3);
        subscriptionParams.setPayerEmail("user@example.com");
        subscriptionParams.setStartsAt(OffsetDateTime.now().plusWeeks(1));

        SubscriptionResult result = cryptopay.subscriptions().create(subscriptionParams).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listTest() throws ApiException {
        SubscriptionListResult result = cryptopay.subscriptions().list().execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveTest() throws ApiException {
        UUID subscriptionId = UUID.fromString("64249ede-8969-4d5c-a042-806f9c3e7db3");

        SubscriptionResult result = cryptopay.subscriptions().retrieve(subscriptionId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveByCustomIdTest() throws ApiException {
        String customId = "PAYMENT-123";

        SubscriptionResult result =
                cryptopay.subscriptions().retrieveByCustomId("PAYMENT-123").execute();

        assertThat(result.getData(), notNullValue());
    }
}
