package info.marcm.online_shop.product;

import java.util.ArrayList;
import java.util.Collection;

public class ProductDataService {

    private final Collection<ProductListener> listeners = new ArrayList<>();

    /**
     * In €
     */
    public float getPrice(String itemName) {
        return 0.f; // TODO: Implement
    }

    public void setPrice(String itemName, float newPrice) {
        // TODO: Implement set price in item list
        for (ProductListener listener : listeners) {
            listener.onPriceChanged();
        }
    }
}
