/*
 * General money class for passing amount of money and currency information between classes.
 */

package fancybank.account;

import fancybank.currency.Currency;

public class Money {

    Currency currency;
    double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

}
