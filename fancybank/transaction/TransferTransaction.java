/*
 * Transaction happened when transfer money between accounts.
 */
package fancybank.transaction;

import fancybank.account.Money;

/**
 * @author Haodong Chen hjc5283@bu.edu
 *         Class for transfer money between accounts.
 */
public class TransferTransaction extends Transaction {

    /**
     * Transaction for transfer money between accounts.
     * 
     * @param from  The account number of the account that the money come from.
     * @param t     The account number of the account that money goes to.
     * @param money Money to transfer.
     */
    public TransferTransaction(int from, int to, Money money) {
        super(from, to, money, TransactionType.TRANSFER);
    }

}
