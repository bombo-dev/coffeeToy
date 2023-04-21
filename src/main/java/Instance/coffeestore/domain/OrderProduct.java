package Instance.coffeestore.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderProduct {

    List<MenuItem> menuItemList;

    public OrderProduct() {
        menuItemList = new ArrayList<>();
    }
}
