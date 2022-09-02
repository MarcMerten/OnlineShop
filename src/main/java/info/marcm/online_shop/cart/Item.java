package info.marcm.online_shop.cart;

import lombok.*;

// Here an example for Lombok, it's super useful to avoid writing a lot of boiler code

/**
 * Amount and name of an item
 */

// Generates getters
@Getter
// Generates setters
@Setter
// Generates equals- and hash method
@EqualsAndHashCode
// Creates constructor without any parameters
@NoArgsConstructor
// Creates constructor with a parameter for every field
@AllArgsConstructor
public class Item {
    private String name;
    private int amount;
}
