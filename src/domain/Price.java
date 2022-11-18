package domain;

import java.util.Currency;

public class Price {
    public Price(int amount) {
        this.amount = amount;
        this.currency = Currency.getInstance("USD");
    }

    int amount;
    Currency currency;

}
