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
public class ChannelsTest {
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
        ChannelParams channelParams = new ChannelParams();
        channelParams.setName("Channel name");
        channelParams.setPayCurrency("ETH");
        channelParams.setReceiverCurrency("BTC");

        ChannelResult result = cryptopay.channels().create(channelParams).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listTest() throws ApiException {
        ChannelListResult result = cryptopay.channels().list().execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void listPaymentsTest() throws ApiException {
        UUID channelId = UUID.fromString("15d0bb11-1e9f-4295-bec5-abd9d5a906a1");

        ChannelPaymentListResult result = cryptopay.channels().listPayments(channelId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveTest() throws ApiException {
        UUID channelId = UUID.fromString("15d0bb11-1e9f-4295-bec5-abd9d5a906a1");

        ChannelResult result = cryptopay.channels().retrieve(channelId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrieveByCustomIdTest() throws ApiException {
        String customId = "CHANNEL-123";

        ChannelResult result = cryptopay.channels().retrieveByCustomId(customId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void retrievePaymentTest() throws ApiException {
        UUID channelId = UUID.fromString("15d0bb11-1e9f-4295-bec5-abd9d5a906a1");
        UUID channelPaymentId = UUID.fromString("704291ec-0b90-4118-89aa-0c9681c3213c");

        ChannelPaymentResult result =
                cryptopay.channels().retrievePayment(channelId, channelPaymentId).execute();

        assertThat(result.getData(), notNullValue());
    }

    @Test
    public void updateTest() throws ApiException {
        UUID channelId = UUID.fromString("15d0bb11-1e9f-4295-bec5-abd9d5a906a1");

        ChannelUpdateParams channelUpdateParams = new ChannelUpdateParams();
        channelUpdateParams.setStatus(ChannelStatus.DISABLED);

        ChannelResult result =
                cryptopay.channels().update(channelId, channelUpdateParams).execute();

        assertThat(result.getData(), notNullValue());
    }
}
