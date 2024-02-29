/*
 * Transaiton for getting interest.
 */
package fancybank.transaction;

import fancybank.account.Money;

/**
 * @author Haodong Chen hjc5283@bu.edu
 *         Class for pay/collect interest.
 */
public class InterestTransaction extends Transaction {

    /**
     * Interest related transactions.
     * 
     * @param from  Account number in the case of collect interest (loan), or -1.
     * @param to    Account number in the case of pay interest (saving account), or
     *              -1.
     * @param money Money of the interest.
     */
    public InterestTransaction(int from, int to, Money money) {
        super(from, to, money, TransactionType.INTEREST);
    }

}
