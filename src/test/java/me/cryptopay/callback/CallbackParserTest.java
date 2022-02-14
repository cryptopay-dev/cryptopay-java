package me.cryptopay.callback;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import me.cryptopay.Cryptopay;
import me.cryptopay.model.Callback;
import me.cryptopay.model.ChannelPaymentCallback;
import me.cryptopay.model.CoinWithdrawalCallback;
import me.cryptopay.model.InvoiceCallback;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CallbackParserTest {
    private Cryptopay cryptopay;

    @BeforeEach
    void setup() {
        this.cryptopay = Cryptopay.builder().build();
    }

    @Test
    void parseChannelPaymentCreatedCallback() throws Exception {
        String body = readFile("channel-payment-created.json");

        Callback callback = cryptopay.callbacks().parse(body);

        assertThat(callback, is(instanceOf(ChannelPaymentCallback.class)));
    }

    @Test
    void parseChannelPaymentCompletedCallback() throws Exception {
        String body = readFile("channel-payment-completed.json");

        Callback callback = cryptopay.callbacks().parse(body);

        assertThat(callback, is(instanceOf(ChannelPaymentCallback.class)));
    }

    @Test
    void parseInvoiceTransactionCreatedCallback() throws Exception {
        String body = readFile("invoice-transaction-created.json");

        Callback callback = cryptopay.callbacks().parse(body);

        assertThat(callback, is(instanceOf(InvoiceCallback.class)));
    }

    @Test
    void parseInvoiceStatusChangedCallback() throws Exception {
        String body = readFile("invoice-status-changed.json");

        Callback callback = cryptopay.callbacks().parse(body);

        assertThat(callback, is(instanceOf(InvoiceCallback.class)));
    }

    @Test
    void parseCoinWithdrawalStatusChangedCallback() throws Exception {
        String body = readFile("coin-withdrawal-status-changed.json");

        Callback callback = cryptopay.callbacks().parse(body);

        assertThat(callback, is(instanceOf(CoinWithdrawalCallback.class)));
    }

    private String readFile(String name) throws Exception {
        return Files.readString(
                Path.of(
                        Objects.requireNonNull(this.getClass().getClassLoader().getResource(name))
                                .toURI()));
    }
}
