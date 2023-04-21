package Instance.coffeestore.domain;

public class PointCard {

    int balance;

    public PointCard(int balance){
        this.balance = balance;
    }

    public void addPoint(Payment payment, int price) {

    }

    private boolean isCard(Payment payment) {
        return payment instanceof Card;
    }
}
