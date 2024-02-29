/*
 * Base tranation class for any kind of stock trades
 */

package fancybank.transaction;

import fancybank.account.Money;
import fancybank.data.Data;

/**
 * @author Haodong Chen hjc5283@bu.edu
 *         Abstract class for transaction history.
 */
public abstract class Transaction {

    private int from;
    private int to;
    private TransactionType type;
    private Money money;
    private int date;

    public Transaction(int from, int to, Money money, TransactionType type) {
        this.from = from;
        this.to = to;
        this.money = money;
        this.type = type;
        this.date = Data.getInstance().getTime().getDay();
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public TransactionType getType() {
        return type;
    }

    public Money getMoney() {
        return money;
    }

    public int getDate() {
        return date;
    }

}
