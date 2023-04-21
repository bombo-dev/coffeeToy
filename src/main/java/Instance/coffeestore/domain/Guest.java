package Instance.coffeestore.domain;

import Instance.coffeestore.exception.lackOfBalanceException;

public class Guest {

    Card card;
    Cash cash;
    PointCard pointCard;

    public void order(Menu menu, Casher casher, Payment payment, String... names) {
        OrderProduct orders = menu.chooseMenu(names);
        try {
            casher.payment(orders, payment, pointCard);
        } catch (lackOfBalanceException e) {
            if(isCard(payment)) {
                casher.rePayment(orders, cash, pointCard);
            } else {
                casher.rePayment(orders, card, pointCard);
            }
        }
    }

    private boolean isCard(Payment payment) {
        return payment instanceof Card;
    }

}
