package info.marcm.online_shop.payment;

import java.io.PrintStream;

@FunctionalInterface
public interface PaymentMethod {
    // Just call infoCallback#println with any string as parameter
    void performPayment(float price, PrintStream infoCallback) throws PaymentException;
}
