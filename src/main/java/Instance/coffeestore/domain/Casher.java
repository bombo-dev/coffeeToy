package Instance.coffeestore.domain;

import Instance.coffeestore.exception.lackOfBalanceException;

public class Casher {

    public boolean payment(OrderProduct products, Payment payment, PointCard pointCard) throws lackOfBalanceException {
        int totalPrice = payment.pay(products);
        pointCard.addPoint(payment, totalPrice);
        Barista barista = new Barista(); //
        barista.create(products);
        return true;
    }

    public boolean rePayment(OrderProduct products, Payment payment, PointCard pointCard) {
        int totalPrice = 0;

        try {
            totalPrice = payment.pay(products);
        } catch (lackOfBalanceException e) {
            e.printStackTrace();
        }
        pointCard.addPoint(payment, totalPrice);
        Barista barista = new Barista();
        barista.create(products);
        return true;
    }
}
