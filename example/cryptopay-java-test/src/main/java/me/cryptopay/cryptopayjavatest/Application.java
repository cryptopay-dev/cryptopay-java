package me.cryptopay.cryptopayjavatest;

import me.cryptopay.Cryptopay;
import me.cryptopay.exception.ApiException;
import me.cryptopay.model.Account;
import me.cryptopay.model.Customer;
import me.cryptopay.model.CustomerParams;
import me.cryptopay.model.ExchangeTransfer;
import me.cryptopay.model.ExchangeTransferParams;
import me.cryptopay.model.Invoice;
import me.cryptopay.model.InvoiceParams;
import me.cryptopay.model.NetworkFee;
import me.cryptopay.model.Rate;
import me.cryptopay.model.Transaction;
import me.cryptopay.model.TransactionListResult;
import me.cryptopay.model.TransactionReferenceType;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws ApiException {
        Cryptopay cryptopay = Cryptopay.builder()
                .debug(true)
                .apiUrl(Cryptopay.API_URL_SANDBOX)
                .apiKey(System.getenv("CRYPTOPAY_API_KEY"))
                .apiSecret(System.getenv("CRYPTOPAY_API_SECRET"))
                .build();

        listCoinWithdrawalNetworkFees(cryptopay);
        createCustomer(cryptopay);
        createInvoice(cryptopay);
        listAccounts(cryptopay);
        retrieveRate(cryptopay);
        listTransactions(cryptopay);
        createExchangeTransfer(cryptopay);
    }

    private static void listCoinWithdrawalNetworkFees(Cryptopay cryptopay) throws ApiException {
        List<NetworkFee> networkFees = cryptopay.coinWithdrawals().listNetworkFees().execute().getData();

        LOGGER.info("Network Fees: {}", networkFees);
    }

    private static void createCustomer(Cryptopay cryptopay) throws ApiException {
        CustomerParams customerParams = new CustomerParams();
        customerParams.setId(RandomStringUtils.randomAlphanumeric(32));
        customerParams.setCurrency("BTC");
        customerParams.setRefundAddresses(Map.of(
                    "BTC", "2NGPwyaRTrKpjf9njHQDfXAReb2iwbYkZrg",
                    "ETH", "0x54baa6f4ff2374b2f8f3a32c0c3dad0acbdb42b2"));

        Customer customer = cryptopay.customers().create(customerParams).execute().getData();

        LOGGER.info("Customer: {}", customer);
    }

    private static void createInvoice(Cryptopay cryptopay) throws ApiException {
        InvoiceParams invoiceParams = new InvoiceParams();

        invoiceParams.setCustomId(RandomStringUtils.randomAlphanumeric(16));
        invoiceParams.setDescription("deserunt pari");
        invoiceParams.setName("incididunt dolor");
        invoiceParams.setPayCurrency("BTC");
        invoiceParams.setPriceAmount(BigDecimal.valueOf(100.0));
        invoiceParams.setPriceCurrency("EUR");
        invoiceParams.setMetadata(null);
        invoiceParams.setSuccessRedirectUrl(URI.create("http://UNgTuIpY.nzyofUcnwac"));
        invoiceParams.setUnsuccessRedirectUrl(URI.create("http://ByIOMdmR.akmmFLYmzbNkKNbPXZgkcBlTWvZaqbUe2YhbYmCnh0efRvraLMh,jDNmnp8RXz5yhnx"));

        Invoice invoice = cryptopay.invoices().create(invoiceParams)
            .execute().getData();

        LOGGER.info("Invoice: {}", invoice);
    }

    private static void listAccounts(Cryptopay cryptopay) throws ApiException {
        List<Account> accounts = cryptopay.accounts().list()
            .execute().getData();

        LOGGER.info("Accounts: {}", accounts);
    }

    private static void listTransactions(Cryptopay cryptopay) throws ApiException {
        TransactionListResult page1 = cryptopay.transactions()
            .list()
            .referenceType(TransactionReferenceType.INVOICE)
            .currency("EUR")
            .execute();

        LOGGER.info("Transactions page 1: {}", page1);

        TransactionListResult page2 = cryptopay.transactions()
            .list()
            .referenceType(TransactionReferenceType.INVOICE)
            .currency("EUR")
            .startingAfter(page1.getData().get(5).getId().toString())
            .execute();

        LOGGER.info("Transactions page 2: {}", page2);
    }

    private static void retrieveRate(Cryptopay cryptopay) throws ApiException {
        Rate rate = cryptopay.rates().retrieve("BTC", "EUR")
            .execute().getData();

        LOGGER.info("Rate: {}", rate);
    }

    private static void createExchangeTransfer(Cryptopay cryptopay) throws ApiException {
        ExchangeTransferParams exchangeTransferParams = new ExchangeTransferParams();

        exchangeTransferParams.setChargedAmount(BigDecimal.valueOf(10.0));
        exchangeTransferParams.setChargedCurrency("EUR");
        exchangeTransferParams.setReceivedCurrency("BTC");
        exchangeTransferParams.setForceCommit(false);

        ExchangeTransfer transfer = cryptopay.exchangeTransfers().create(exchangeTransferParams)
            .execute().getData();

        LOGGER.info("ExchangeTransfer: {}", transfer);
    }
}
