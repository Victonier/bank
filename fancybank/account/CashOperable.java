/*
 * Interface for accounts that can withdraw and deposit cash.
 */
package fancybank.account;

public interface CashOperable {
    public void deposit(double amount);

    public void withdraw(double amount);
}
