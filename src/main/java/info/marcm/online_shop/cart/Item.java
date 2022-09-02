package info.marcm.online_shop.cart;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    String name;
    int amount;
}
