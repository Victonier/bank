/*
 * Transaction happened when withdraw/deposit cash.
 */
package fancybank.transaction;

import fancybank.account.Money;

/**
 * @author Haodong Chen hjc5283@bu.edu
 *         Class for cash transactions (withdraw/deposit).
 */
public class CashTransaction extends Transaction {

    /**
     * Cash related transactions.
     * 
     * @param from  Account number in the case of withdraw, or -1.
     * @param to    Account number in the case of deposit, or -1.
     * @param money Money to be withdraw/deposit.
     */
    public CashTransaction(int from, int to, Money money) {
        super(from, to, money, TransactionType.CASH);
    }

}
