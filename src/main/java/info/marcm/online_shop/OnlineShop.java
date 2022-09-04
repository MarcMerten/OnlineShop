package info.marcm.online_shop;

import info.marcm.online_shop.cart.Item;
import info.marcm.online_shop.payment.PaymentMethod;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineShop {

    private final Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    public static final String TESTING_PAYMENT_METHOD_NAME = "Test";

    public OnlineShop() {
        paymentMethods.put(TESTING_PAYMENT_METHOD_NAME, null); // TODO: Add custom payment method here
    }

    public List<Item> getCustomersItems(String customer) {
        return new ArrayList<>();
    }

    /**
     * @param customer Customer who is the owner of a cart
     * @return Total cost of all items together
     */
    public float getCustomerCartPrice(String customer) {
        return 0.f;
    }

    // Of course admin only :D
    public void setPriceOfItem(String itemName, float newPrice) {
        // Not yet implemented
    }

    public void addToCart(String customer, String itemName) {
        // Not yet implemented
    }

    public void finishWithPayment(String customer, String paymentMethod, PrintStream infoCallback) {
        // TODO: Execute payment method which calls PrintStream#println in it
    }
}
