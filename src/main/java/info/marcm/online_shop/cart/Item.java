package info.marcm.online_shop.cart;

import lombok.*;

// Generates getters
@Getter
// Generates setters
@Setter
// Generates equals and hash
@EqualsAndHashCode
// Creates constructor without any parameters
@NoArgsConstructor
// Creates constructor with a parameter for every field
@AllArgsConstructor
public class Item {
    private String name;
    private int amount;
}
