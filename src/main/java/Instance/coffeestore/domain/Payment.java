package Instance.coffeestore.domain;

import Instance.coffeestore.exception.lackOfCashBalanceException;

public interface Payment {

    int pay(OrderProduct products) throws lackOfCashBalanceException;
}
