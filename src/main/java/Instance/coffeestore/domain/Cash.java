package Instance.coffeestore.domain;

public class Cash implements Payment {

    private int balance;

    @Override
    public int pay(OrderProduct products) {
        return 0;
    }
}
