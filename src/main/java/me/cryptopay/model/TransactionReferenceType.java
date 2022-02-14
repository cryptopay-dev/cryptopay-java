// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets TransactionReferenceType. */
@JsonAdapter(TransactionReferenceType.Adapter.class)
public enum TransactionReferenceType {

    /** "BankDeposit". */
    BANKDEPOSIT("BankDeposit"),

    /** "BankWithdrawal". */
    BANKWITHDRAWAL("BankWithdrawal"),

    /** "ChannelPayment". */
    CHANNELPAYMENT("ChannelPayment"),

    /** "CoinDeposit". */
    COINDEPOSIT("CoinDeposit"),

    /** "CoinWithdrawal". */
    COINWITHDRAWAL("CoinWithdrawal"),

    /** "ExchangeTransfer". */
    EXCHANGETRANSFER("ExchangeTransfer"),

    /** "Invoice". */
    INVOICE("Invoice"),

    /** "InvoiceRefund". */
    INVOICEREFUND("InvoiceRefund"),

    /** "ManualBalanceTransaction". */
    MANUALBALANCETRANSACTION("ManualBalanceTransaction");

    private String value;

    TransactionReferenceType(final String value) {
        this.value = value;
    }

    /**
     * Returns TransactionReferenceType value.
     *
     * @return enum value
     */
    public String getValue() {
        return value;
    }

    /**
     * Creates a new TransactionReferenceType from value.
     *
     * @param value
     * @return TransactionReferenceType
     */
    public static TransactionReferenceType fromValue(final String value) {
        for (TransactionReferenceType b : TransactionReferenceType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static final class Adapter extends TypeAdapter<TransactionReferenceType> {
        @Override
        public void write(final JsonWriter jsonWriter, final TransactionReferenceType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public TransactionReferenceType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return TransactionReferenceType.fromValue(value);
        }
    }
}
