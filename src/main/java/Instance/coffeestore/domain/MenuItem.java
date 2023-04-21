package Instance.coffeestore.domain;

public class MenuItem {

    String name;
    int price;

    @Override
    public String toString() {
        return "커피 이름 : " + name + "커피 가격 : " + price;
    }
}
