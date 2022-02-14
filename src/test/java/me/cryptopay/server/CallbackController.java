package me.cryptopay.server;


import me.cryptopay.Cryptopay;
import me.cryptopay.model.Callback;
import me.cryptopay.model.ChannelPaymentCallback;
import me.cryptopay.model.CoinWithdrawalCallback;
import me.cryptopay.model.InvoiceCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(
        value = "/callback",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        headers = Cryptopay.CALLBACK_SIGNATURE_HEADER)
public class CallbackController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CallbackController.class);

    private final Cryptopay cryptopay;

    public CallbackController() {
        this.cryptopay =
                Cryptopay.builder()
                        .callbackSecret("KN8weStbVNpr-ecRgChlD7wEQGG3BdCX-vxlvRZx2kk")
                        .build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void process(
            @RequestBody String body,
            @RequestHeader(Cryptopay.CALLBACK_SIGNATURE_HEADER) String signature)
            throws Exception {
        LOGGER.debug("Processing callback...");

        if (!cryptopay.callbacks().validate(signature, body)) {
            LOGGER.warn("Invalid signature [{}]. Skipping", signature);

            return;
        }

        Callback callback = cryptopay.callbacks().parse(body);

        if (callback instanceof ChannelPaymentCallback) {
            process((ChannelPaymentCallback) callback);
        } else if (callback instanceof CoinWithdrawalCallback) {
            process((CoinWithdrawalCallback) callback);
        } else if (callback instanceof InvoiceCallback) {
            process((InvoiceCallback) callback);
        } else {
            LOGGER.warn("Unable to process unsupported event. Skipping:\n{}", body);
        }
    }

    private void process(ChannelPaymentCallback callback) {
        LOGGER.debug("Event of type [{}] received:\n{}", callback.getType(), callback);
    }

    private void process(CoinWithdrawalCallback callback) {
        LOGGER.debug("Event of type [{}] received:\n{}", callback.getType(), callback);
    }

    private void process(InvoiceCallback callback) {
        LOGGER.debug("Event of type [{}] received:\n{}", callback.getType(), callback);
    }
}
