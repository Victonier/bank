/*
 * Transactions happpened when create a new account or close an account.
 */
package fancybank.transaction;

/**
 * @author Haodong Chen hjc5283@bu.edu
 *         Class for open/close account.
 */
public class AccountTransaction extends Transaction {

    /**
     * Transaction for open/close account.
     * 
     * @param from Account number of the account being closed, or -1.
     * @param to   Account number of the account being opened, or -1.
     */
    public AccountTransaction(int from, int to) {
        super(from, to, null, TransactionType.ACCOUNT);
    }

}
