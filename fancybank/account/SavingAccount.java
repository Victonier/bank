/*
 * SavingAccount can be used to withdraw and deposit money. But not for currency exchange.
 */
package fancybank.account;

import fancybank.data.Data;
import fancybank.transaction.CashTransaction;

public class SavingAccount extends Account implements CashOperable, Transferable {
    public SavingAccount() {
        super();
    }

    public SavingAccount(int accountNumber) {
        super(accountNumber, "saving", 0, "USD");
    }

    public SavingAccount(int accountNumber, double balance, String currency) {
        super(accountNumber, "saving", balance, currency);
    }

    @Override
    public void deposit(double amount) {
        getBalance().add(amount);
        Data.getInstance().addTransaction(
                new CashTransaction(-1, getAccountNumber(), new Money(getBalance().getCurrency(), amount)));
    }

    @Override
    public void withdraw(double amount) {
        getBalance().subtract(amount);
        Data.getInstance().addTransaction(
                new CashTransaction(getAccountNumber(), -1, new Money(getBalance().getCurrency(), amount)));
    }

    @Override
    public void transferTo(Account target, double amount) {
        if (amount < 0) {
            return;
        }
        if (!getBalance().isSufficient(amount)) {
            return;
        }
        getBalance().subtract(amount);
        target.getBalance().add(amount);
    }
}
