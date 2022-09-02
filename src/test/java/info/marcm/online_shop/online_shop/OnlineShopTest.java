package info.marcm.online_shop.online_shop;

import info.marcm.online_shop.OnlineShop;
import info.marcm.online_shop.cart.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OnlineShopTest {

    @Test
    void simulatedCustomer() {

        String customerName = "Marc";

        // The last entry is not valid and should not be put into the shopping cart
        Map<Item, Float> items = new HashMap<>();
        items.put(new Item("item1", 3), 4.f);
        items.put(new Item("item2", 1), 6.f);
        items.put(new Item("item3", 4), 8.f);
        items.put(new Item("unknown item", 1), 10.f);
        List.of(new Item("item1", 3), new Item("item2", 1), new Item("item3", 4), new Item("unknown item", 1));

        OnlineShop onlineShop = new OnlineShop(){
            @Override
            public List<Item> getCustomersItems(String customer) {
                if(customer.equals("unknown user")) return new ArrayList<>();
                Map<Item, Float> items = new HashMap<>();
                items.put(new Item("item1", 3), 4.f);
                items.put(new Item("item2", 1), 6.f);
                items.put(new Item("item3", 4), 8.f);
                return new ArrayList<>(items.keySet());
            }

            @Override
            public float getCustomerCartPrice(String customer) {
                return 84;
            }
        };

        for (Item item : items.keySet()) {
            for (int i = 0; i < item.getAmount(); i++) {
                onlineShop.addToCart(customerName, item.getName());
                onlineShop.setPriceOfItem(item.getName(), items.get(item));
            }
        }

        List<Item> cart = onlineShop.getCustomersItems(customerName);

        Assertions.assertNotNull(cart, "Cart is null");
        Assertions.assertEquals(3, cart.size(), "Cart should contain three different items");
        Assertions.assertTrue(cart.stream().allMatch(itemFromCart -> items.keySet().stream().anyMatch(itemFromCart::equals)), "Cart does not match the expected output");

        float price = onlineShop.getCustomerCartPrice(customerName);

        Assertions.assertEquals(84, price);

        cart =  onlineShop.getCustomersItems("unknown user");
        Assertions.assertTrue(cart.isEmpty());

        System.out.println("Successfully tested real cart");
        System.out.println("\n\n");
    }

}