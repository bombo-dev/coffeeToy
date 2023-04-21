package Instance.coffeestore.domain;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    // 커피 메뉴 리스트, 이렇게 하면 참조하는데 오래 걸리지 않을까
    // 손님은 메뉴판을 보고 이름만 얘기할텐데, Map 을 사용해볼까
    Map<String, MenuItem> menuMap = new HashMap<>();

    public OrderProduct chooseMenu(String... names){
        OrderProduct product = new OrderProduct();

        for(String name : names) {
            product.menuItemList.add(menuMap.get(name));
        }

        return product;
    }
}
