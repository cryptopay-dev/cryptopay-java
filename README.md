# Cryptopay Java Library

Cryptopay - the official Java client for the Cryptopay API.

Cryptopay is a payment gateway and business wallet that allows merchants to automate the processes of accepting cryptocurrency payments and payouts from their customers, as well as making currency exchange transactions and receiving data on the transaction history and account balance statuses for reporting.

For more information, please visit [Cryptopay API docs](https://developers.cryptopay.me).

# Table of contents

* [Installation](#installation)
* [Configuration](#configuration)
* [Usage](#usage)
  * [Complete examples](#complete-examples)
  * [Accounts](#accounts)
  * [Channels](#channels)
  * [CoinWithdrawals](#coinwithdrawals)
  * [Customers](#customers)
  * [ExchangeTransfers](#exchangetransfers)
  * [Invoices](#invoices)
  * [Rates](#rates)
  * [Risks](#risks)
  * [Transactions](#transactions)
* [Callbacks](#callbacks)
* [Development](#development)
  * [Local build](#local-build)
  * [Unit tests](#unit-tests)
  * [Coding conventions](#coding-conventions)
* [Contributing](#contributing)
* [License](#license)

## Installation

For _Maven_, add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>me.cryptopay</groupId>
    <artifactId>cryptopay-java</artifactId>
    <version>0.0.2</version>
</dependency>
```

For _Gradle_, add the following dependency to your `build.gradle`:

```groovy
implementation group: 'me.cryptopay', name: 'cryptopay-java', version: '0.0.2'
```

### Requirements

* Java 11+

## Configuration

### Create API credentials

Learn mode about API credentials at [Developers guide](https://developers.cryptopay.me/guides/api-credentials).

### Configure library

```java
import me.cryptopay.Cryptopay;

Cryptopay cryptopay = Cryptopay.builder()
    .apiUrl(Cryptopay.API_URL_SANDBOX)
    .apiKey(System.getenv("CRYPTOPAY_API_KEY"))
    .apiSecret(System.getenv("CRYPTOPAY_API_SECRET"))
    .callbackSecret(System.getenv("CRYPTOPAY_CALLBACK_SECRET"))
    .build()
```

## Usage

### Complete examples

Examples of usage of the library can be found [here](example).

### Accounts

[Accounts API docs](https://developers.cryptopay.me/reference/accounts)

#### List accounts

```java
AccountListResult result = cryptopay.accounts().list().execute();
```

#### List account transactions

```java
UUID accountId = UUID.fromString("31804390-d44e-49e9-8698-ca781e0eb806");

TransactionListResult result = cryptopay.accounts().listTransactions(accountId).execute();
```

### Channels

A channel is a static cryptocurrency address that may be assigned to each one of your customers.

[Channels API docs](https://developers.cryptopay.me/reference/payment-channels)

#### Create a channel

```java
ChannelParams channelParams = new ChannelParams();
channelParams.setName("Channel name");
channelParams.setPayCurrency("ETH");
channelParams.setReceiverCurrency("BTC");

ChannelResult result = cryptopay.channels().create(channelParams).execute();
```

#### List channels

```java
ChannelListResult result = cryptopay.channels().list().execute();
```

#### List channel payments

```java
UUID channelId = UUID.fromString("15d0bb11-1e9f-4295-bec5-abd9d5a906a1");

ChannelPaymentListResult result = cryptopay.channels().listPayments(channelId).execute();
```

#### Retrieve a channel

```java
UUID channelId = UUID.fromString("15d0bb11-1e9f-4295-bec5-abd9d5a906a1");

ChannelResult result = cryptopay.channels().retrieve(channelId).execute();
```

#### Retrieve a channel by custom id

```java
String customId = "CHANNEL-123";

ChannelResult result = cryptopay.channels().retrieveByCustomId(customId).execute();
```

#### Retrieve a channel payment

```java
UUID channelId = UUID.fromString("15d0bb11-1e9f-4295-bec5-abd9d5a906a1");
UUID channelPaymentId = UUID.fromString("704291ec-0b90-4118-89aa-0c9681c3213c");

ChannelPaymentResult result = cryptopay.channels().retrievePayment(channelId, channelPaymentId).execute();
```

#### Update a channel

```java
UUID channelId = UUID.fromString("15d0bb11-1e9f-4295-bec5-abd9d5a906a1");

ChannelUpdateParams channelUpdateParams = new ChannelUpdateParams();
channelUpdateParams.setStatus(ChannelStatus.DISABLED);

ChannelResult result = cryptopay.channels().update(channelId, channelUpdateParams).execute();
```

### CoinWithdrawals

In addition to accepting payments through the Cryptopay payment gateway, it is also possible to make payments to your customers in any of the cryptocurrency currently supported by Cryptopay. In Cryptopay, these payments are called “Coin Withdrawal”. The process of requesting coin withdrawal is almost the same for a customer in Cashier as the process of making a deposit with one exception - the customer will need to specify the address of the wallet he wants to send the cryptocurrency to.

[Coin withdrawals API docs](https://developers.cryptopay.me/reference/coin-withdrawals)

#### Commit a withdrawal

```java
CoinWithdrawalParams coinWithdrawalParams = new CoinWithdrawalParams();
coinWithdrawalParams.setAddress("2Mz3bcjSVHG8uQJpNjmCxp24VdTjwaqmFcJ");
coinWithdrawalParams.setChargedAmount(BigDecimal.valueOf(100.0));
coinWithdrawalParams.setChargedCurrency("EUR");
coinWithdrawalParams.setReceivedCurrency("BTC");
coinWithdrawalParams.setForceCommit(false);

CoinWithdrawal coinWithdrawal = cryptopay.coinWithdrawals().create(coinWithdrawalParams).execute().getData();

CoinWithdrawalResult result = cryptopay.coinWithdrawals().commit(coinWithdrawal.getId()).execute();
```

#### Create a withdrawal

[Documentation](https://developers.cryptopay.me/guides/payouts/create-a-coin-withdrawal)
```java
CoinWithdrawalParams coinWithdrawalParams = new CoinWithdrawalParams();
coinWithdrawalParams.setAddress("2Mz3bcjSVHG8uQJpNjmCxp24VdTjwaqmFcJ");
coinWithdrawalParams.setChargedAmount(BigDecimal.valueOf(100.0));
coinWithdrawalParams.setChargedCurrency("EUR");
coinWithdrawalParams.setReceivedCurrency("BTC");
coinWithdrawalParams.setForceCommit(false);

CoinWithdrawalResult result = cryptopay.coinWithdrawals().create(coinWithdrawalParams).execute();
```

#### List withdrawals

```java
CoinWithdrawalListResult result = cryptopay.coinWithdrawals().list().execute();
```

#### List network fees

```java
NetworkFeeListResult result = cryptopay.coinWithdrawals().listNetworkFees().execute();
```

#### Retrieve a withdrawal

```java
UUID coinWithdrawalId = UUID.fromString("3cf9d1c4-6191-4826-8cae-2c717810c7e9");

CoinWithdrawalResult result = cryptopay.coinWithdrawals().retrieve(coinWithdrawalId).execute();
```

#### Retrieve a withdrawal by custom id

```java
String customId = "PAYMENT-123";

CoinWithdrawalResult result = cryptopay.coinWithdrawals().retrieveByCustomId(customId).execute();
```

### Customers

Customer objects allow you to reject High-Risk transactions automatically, and to track multiple transactions, that are associated with the same customer

[Customers API docs](https://developers.cryptopay.me/reference/customers)

#### Create a customer

```java
CustomerParams customerParams = new CustomerParams();
customerParams.setId("CUSTOMER-123");
customerParams.setCurrency("BTC");
customerParams.setRefundAddresses(Map.of(
            "BTC", "2NGPwyaRTrKpjf9njHQDfXAReb2iwbYkZrg",
            "ETH", "0x54baa6f4ff2374b2f8f3a32c0c3dad0acbdb42b2"));

CustomerResult result = cryptopay.customers().create(customerParams).execute();
```

#### List customers

```java
CustomerListResult result = cryptopay.customers().list().execute();
```

#### Retrieve a customer

```java
String customerId = "CUSTOMER-123";

CustomerResult result = cryptopay.customers().retrieve(customerId).execute();
```

#### Update a customer

```java
String customerId = "CUSTOMER-123";

CustomerUpdateParams customerUpdateParams = new CustomerUpdateParams();
customerUpdateParams.setRefundAddresses(Map.of("BTC", "2N9wPGx67zdSeAbXi15qHgoZ9Hb9Uxhd2uQ"));

CustomerResult result = cryptopay.customers().update(customerId, customerUpdateParams).execute();
```

### ExchangeTransfers

[Exchange transfers API docs](https://developers.cryptopay.me/reference/exchange)

#### Commit an exchange transfer

```java
ExchangeTransferParams exchangeTransferParams = new ExchangeTransferParams();
exchangeTransferParams.setChargedAmount(BigDecimal.valueOf(10));
exchangeTransferParams.setChargedCurrency("EUR");
exchangeTransferParams.setReceivedCurrency("BTC");
exchangeTransferParams.setForceCommit(false);

ExchangeTransfer exchangeTransfer = cryptopay.exchangeTransfers().create(exchangeTransferParams)
    .execute()
    .getData();

ExchangeTransferResult result = cryptopay.exchangeTransfers().commit(exchangeTransfer.getId()).execute();
```

#### Create an exchange transfer

```java
ExchangeTransferParams exchangeTransferParams = new ExchangeTransferParams();
exchangeTransferParams.setChargedAmount(BigDecimal.valueOf(10));
exchangeTransferParams.setChargedCurrency("EUR");
exchangeTransferParams.setReceivedCurrency("BTC");
exchangeTransferParams.setForceCommit(false);

ExchangeTransferResult result = cryptopay.exchangeTransfers().create(exchangeTransferParams).execute();
```

#### Retrieve an exchange transfer

```java
UUID exchangeTransferId = UUID.fromString("2c090f99-7cc1-40da-9bca-7caa57b4ebfb");

ExchangeTransferResult result = cryptopay.exchangeTransfers().retrieve(exchangeTransferId).execute();
```

### Invoices

An invoice is a request for a cryptocurrency payment which contains a unique BTC, LTC, ETH or XRP address and the amount that has to be paid while the invoice is valid.

[Invoices API docs](https://developers.cryptopay.me/reference/invoices)

#### Commit invoice recalculation

```java
UUID invoiceId = UUID.fromString("2738682a-11ff-4013-8380-6a70df995ea9");

InvoiceRecalculationParams invoiceRecalculationParams = new InvoiceRecalculationParams();
invoiceRecalculationParams.setForceCommit(false);

InvoiceRecalculation recalculation = cryptopay.invoices()
    .createRecalculation(invoiceId, invoiceRecalculationParams)
    .execute()
    .getData();

InvoiceRecalculationResult result = cryptopay.invoices()
    .commitRecalculation(invoiceId, recalculation.getId())
    .execute();
```

#### Create an invoice

```java
InvoiceParams invoiceParams = new InvoiceParams();
invoiceParams.setCustomId("PAYMENT-123");
invoiceParams.setPayCurrency("BTC");
invoiceParams.setPriceAmount(BigDecimal.valueOf(100.0));
invoiceParams.setPriceCurrency("EUR");
invoiceParams.setMetadata(Map.of("custom-key", "custom-value"));
invoiceParams.setSuccessRedirectUrl(URI.create("https://success.example.com"));
invoiceParams.setUnsuccessRedirectUrl(URI.create("https://unsuccess.example.com"));

InvoiceResult result = cryptopay.invoices().create(invoiceParams).execute();
```

#### Create invoice recalculation

```java
UUID invoiceId = UUID.fromString("2738682a-11ff-4013-8380-6a70df995ea9");

InvoiceRecalculationParams invoiceRecalculationParams = new InvoiceRecalculationParams();
invoiceRecalculationParams.setForceCommit(false);

InvoiceRecalculationResult result = cryptopay.invoices()
    .createRecalculation(invoiceId, invoiceRecalculationParams)
    .execute();
```

#### Create invoice refund

```java
UUID invoiceId = UUID.fromString("7e274430-e20f-4321-8748-20824287ae44");

InvoiceRefundParams invoiceRefundParams = new InvoiceRefundParams();
invoiceRefundParams.setAddress("0xf3532c1fd002665ec54d46a50787e0c69c76cd44");

InvoiceRefundResult result = cryptopay.invoices().createRefund(invoiceId, invoiceRefundParams).execute();
```

#### List invoices

```java
InvoiceListResult result = cryptopay.invoices().list().execute();
```

#### List invoice refunds

```java
UUID invoiceId = UUID.fromString("7e274430-e20f-4321-8748-20824287ae44");

InvoiceRefundListResult result = cryptopay.invoices().listRefunds(invoiceId).execute();
```

#### Retrieve an invoice

```java
UUID invoiceId = UUID.fromString("c8233d57-78c8-4c36-b35e-940ae9067c78");

InvoiceResult result = cryptopay.invoices().retrieve(invoiceId).execute();
```

#### Retrieve an invoice by custom_id

```java
String customId = "PAYMENT-123";

InvoiceResult result = cryptopay.invoices().retrieveByCustomId("PAYMENT-123").execute();
```

### Rates

[Public rates API docs](https://developers.cryptopay.me/reference/public-rates)

#### Retrieve all rates

```java
RatesResult result = cryptopay.rates().all().execute();
```

#### Retrieve a pair rate

```java
String baseCurrency = "BTC";
String quoteCurrency = "EUR";

RateResult result = cryptopay.rates().retrieve(baseCurrency, quoteCurrency).execute();
```

### Risks

[Risks API docs](https://developers.cryptopay.me/reference/risks)

#### Score a coin address

```java
RiskParams riskParams = new RiskParams();
riskParams.setAddress("2NGPwyaRTrKpjf9njHQDfXAReb2iwbYkZrg");
riskParams.setCurrency("BTC");
riskParams.setType(RiskType.SOURCE_OF_FUNDS);

RiskResult result = cryptopay.risks().score(riskParams).execute();
```

### Transactions

[Transactions API docs](https://developers.cryptopay.me/reference/transactions)

#### List transactions

```java
TransactionListResult result = cryptopay.transactions()
    .list()
    .referenceType(TransactionReferenceType.INVOICE)
    .execute();
```

## Callbacks

[Documentation](https://developers.cryptopay.me/guides/api-basics/callbacks)

Every callback request contains a `X-Cryptopay-Signature` header which is needed to verify webhook body

```java
String body = "{\"event\":\"transaction_created\",\"data\":{\"id\":\"cc75b958-5780-4b34-a33a-cf63b349fbab\",\"custom_id\":\"209584732\",\"customer_id\":null,\"status\":\"new\",\"status_context\":null,\"address\":\"2NG8f2EVxN8XJ4DHriRt9q9LkdVCpQZ2UGB\",\"uri\":null,\"price_amount\":100.0,\"price_currency\":\"EUR\",\"fee\":null,\"fee_currency\":\"EUR\",\"pay_amount\":0.02038328,\"pay_currency\":\"BTC\",\"paid_amount\":0.02038328,\"exchange\":{\"pair\":\"BTCEUR\",\"rate\":4905.9838,\"fee\":null,\"fee_currency\":\"EUR\"},\"transactions\":[{\"txid\":\"502e6de0c3b1d129974c55e6cd127fd548e4501ff8e8d9330ea9a30a83dbd16e\",\"risk\":{\"score\":3.1,\"level\":\"low\",\"resource_name\":\"Bitstamp\",\"resource_category\":\"Exchange\"}}],\"name\":\"invoice name\",\"description\":\"invoice description\",\"metadata\":{\"foo\":\"bar\"},\"success_redirect_url\":null,\"unsuccess_redirect_url\":null,\"hosted_page_url\":\"https://hosted-business.cryptopay.me/invoices/cc75b958-5780-4b34-a33a-cf63b349fbab\",\"created_at\":\"2019-05-02T13:56:56Z\",\"expires_at\":\"2019-05-02T14:06:56Z\"},\"type\":\"Invoice\"}";
String signature = "cd6ab5292630005bb79d299bdc64cbe69eedcc8dfd60ff615b5ed40923c23821";

boolean valid = cryptopay.callbacks().validate(signature, body);

if (valid) {
    Callback callback = cryptopay.callbacks().parse(body);

    if (callback instanceof ChannelPaymentCallback) {
        process((ChannelPaymentCallback) callback);
    } else if (callback instanceof CoinWithdrawalCallback) {
        process((CoinWithdrawalCallback) callback);
    } else if (callback instanceof InvoiceCallback) {
        process((InvoiceCallback) callback);
    } else {

    }
}
```

Complete example of usage is available here: [client-side](src/test/java/me/cryptopay/server/CallbackController.java), [server-side](src/test/java/me/cryptopay/client/CallbackTest.java).

## Development

### Local build

Check out the source code and run the following command to download all the dependencies and build the library:
```bash
mvn clean install
```

### Coding conventions

[checkstyle.xml](checkstyle.xml) file describes coding conventions. Based on [sun_checks.xml](https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/sun_checks.xml) with some adjustments.
Rules are enforced by `maven-checkstyle-plugin` during the build process.

## Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/cryptopay-dev/cryptopay-java.

## License

The library is available as open source under the terms of the [MIT License](https://opensource.org/licenses/MIT).
