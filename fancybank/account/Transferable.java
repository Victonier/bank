/*
 * Interface for those accounts than can transfer money to other accounts.
 */

package fancybank.account;

public interface Transferable {
    public void transferTo(Account target, double amount);

}
