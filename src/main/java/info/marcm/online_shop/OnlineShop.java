package info.marcm.online_shop;

import info.marcm.online_shop.cart.Item;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {

    public List<Item> getCustomersItems(String customer) {
        return new ArrayList<>();
    }

    /**
     *
     * @param customer Customer who is the owner of a cart
     * @return Total cost of all items together
     */
    public float getCustomerCartPrice(String customer) {
        return 0.f;
    }

    // Of course admin only :D
    public void setPriceOfItem(String itemName, float newPrice){
        // Not yet implemented
    }

    public void addToCart(String customer, String itemName) {
        // Not yet implemented
    }
}
