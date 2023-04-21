package Instance.coffeestore.domain;

import Instance.coffeestore.exception.lackOfCashBalanceException;

import java.util.List;

public class Card implements Payment {

    int balance;

    @Override
    public int pay(OrderProduct products) throws lackOfCashBalanceException {
        int totalMoney = calcTotalMoney(products.menuItemList);
        if(balance - totalMoney < 0) {
            throw new lackOfCashBalanceException("카드 잔액이 부족합니다.");
        }
        return totalMoney;
    }

    private int calcTotalMoney(List<MenuItem> products) {
        int totalMoney = 0;
        for(MenuItem item : products){
            totalMoney += item.price;
        }

        return totalMoney;
    }
}
