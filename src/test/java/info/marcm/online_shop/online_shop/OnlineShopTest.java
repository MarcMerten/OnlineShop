package info.marcm.online_shop.online_shop;

import info.marcm.online_shop.OnlineShop;
import info.marcm.online_shop.cart.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class OnlineShopTest {

    @Test
    void simulatedCustomer() {

        String customerName = "Marc";

        // The last entry is not valid and should not be put into the shopping info.marcm.cart
        List<Item> items = List.of(new Item("item1", 3), new Item("item2", 1), new Item("item3", 4), new Item("unknown item", 1));

        OnlineShop onlineShop = new OnlineShop();

        for (Item item : items) {
            for (int i = 0; i < item.getAmount(); i++) {
                onlineShop.addToCart(customerName, item.getName());
            }
        }

        List<Item> cart = onlineShop.getCustomersItems(customerName);

        Assertions.assertNotNull(cart, "Cart is null");
        Assertions.assertEquals(3, cart.size(), "Cart should contain three different items");
        Assertions.assertTrue(cart.stream().allMatch(itemFromCart -> items.stream().anyMatch(itemFromCart::equals)), "Cart does not match the expected output");

        System.out.println("Successfully tested real cart");
        System.out.println("\n\n");
    }

}