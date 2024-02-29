/*
 * The balance contains the amount of money and the currency information.
 */

package fancybank.account;

import fancybank.currency.Currency;
import fancybank.currency.CurrencyFactory;

public class Balance {
    private double balance;
    private Currency currency;

    public Balance() {
        this.balance = 0;
        // this.currency = CurrencyFactory.getInstance().getCurrency("USD");
    }

    public Balance(double balance, String currency) {
        if (balance < 0) {
            this.balance = 0;
            return;
        }
        this.balance = balance;
        this.currency = CurrencyFactory.getInstance().getCurrency(currency);
    }

    public Balance(double balance, Currency currency) {
        if (balance < 0) {
            this.balance = 0;
            return;
        }
        this.balance = balance;
        this.currency = currency;
    }

    public double get() {
        return balance;
    }

    public void set(double balance) {
        if (balance < 0) {
            return;
        }
        this.balance = balance;
    }

    public void add(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance += amount;
    }

    public void add(Balance balance) {
        if (balance.get() < 0) {
            return;
        }
        double amount = balance.get();
        if (!this.currency.equals(balance.getCurrency())) {
            amount = amount / balance.currency.getRate() * this.currency.getRate();
        }
        this.balance += amount;
    }

    public void subtract(double amount) {
        if (amount < 0) {
            return;
        }
        if (!isSufficient(amount)) {
            return;
        }
        this.balance -= amount;
    }

    public void subtract(Balance balance) {
        if (balance.get() < 0) {
            return;
        }
        double amount = balance.get();
        if (!this.currency.equals(balance.getCurrency())) {
            amount = amount / balance.currency.getRate() * this.currency.getRate();
        }
        if (!isSufficient(amount)) {
            return;
        }
        this.balance -= amount;
    }

    public boolean isSufficient(double amount) {
        return this.balance >= amount;
    }

    public boolean isSufficient(Balance balance) {
        double amount = balance.get();
        if (!this.currency.equals(balance.getCurrency())) {
            amount = amount / balance.currency.getRate() * this.currency.getRate();
        }
        return this.balance >= amount;
    }

    public String toString() {
        return String.format("%.2f", balance);
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = CurrencyFactory.getInstance().getCurrency(currency);
    }
}
