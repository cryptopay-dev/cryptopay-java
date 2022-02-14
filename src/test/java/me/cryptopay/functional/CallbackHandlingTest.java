package me.cryptopay.functional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import me.cryptopay.Cryptopay;
import me.cryptopay.server.TestingCallbackApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@SpringBootTest(
        classes = {TestingCallbackApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CallbackHandlingTest {

    @LocalServerPort private int port;

    @Autowired private TestRestTemplate restTemplate;

    @Test
    public void invoiceCallbackTest() throws Exception {
        String body =
                Files.readString(
                        Path.of(
                                Objects.requireNonNull(
                                                this.getClass()
                                                        .getClassLoader()
                                                        .getResource(
                                                                "invoice-transaction-created.json"))
                                        .toURI()));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add(
                Cryptopay.CALLBACK_SIGNATURE_HEADER,
                "df2ca74547c413435e1cd4676de83f3a16c6793c83af69b6fae3dba8eb858955");

        ResponseEntity<String> result =
                restTemplate.postForEntity(
                        String.format("http://localhost:%s/callback", port),
                        new HttpEntity<>(body, headers),
                        String.class);

        assertThat(result.getStatusCode(), is(HttpStatus.OK));
    }
}
