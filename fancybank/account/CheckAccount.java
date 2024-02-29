/*
 * CheckAccount. Users can deposit, withdraw, transfer, and exchange money.
 */
package fancybank.account;

import fancybank.data.Data;
import fancybank.transaction.CashTransaction;

public class CheckAccount extends Account implements CashOperable, Transferable, Exchangeable {

    public CheckAccount() {
        super();
    }

    public CheckAccount(int accountNumber) {
        super(accountNumber, "checking", 0, "USD");
    }

    public CheckAccount(int accountNumber, double balance, String currency) {
        super(accountNumber, "checking", balance, currency);

    }

    public CheckAccount(int accountNumber, String accountType, double balance, String currency) {
        super(accountNumber, accountType, balance, currency);
    }

    public void setBalance(double balance) {
        getBalance().set(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            return;
        }
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

    @Override
    public boolean exchangeTo(Account targetAccount, Balance exBalance) {
        if (!(targetAccount instanceof Exchangeable)) {
            return false;
        }
        if (exBalance.get() < 0) {
            return false;
        }
        if (!getBalance().isSufficient(exBalance)) {
            return false;
        }
        System.out.println(exBalance.get());
        System.out.println(this.getAccountType() + this.getAccountNumber());
        System.out.println(targetAccount.getAccountType() + targetAccount.getAccountNumber());
        this.getBalance().subtract(exBalance);
        targetAccount.getBalance().add(exBalance);
        return true;
    }
}
