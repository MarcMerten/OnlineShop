package info.marcm.online_shop.cart;

import lombok.Getter;

import java.util.List;

public class Cart {
    @Getter
    private float price;
    private List<Item> items;
}
