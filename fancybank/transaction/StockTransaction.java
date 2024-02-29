/*
 * Transaction happened when buy/sell stocks.
 */

package fancybank.transaction;

import fancybank.account.Money;

public class StockTransaction extends Transaction {

    private String stock;
    private int quantity;

    public StockTransaction(int from, int to, Money money, int quantity, String stockSymbol) {
        super(from, to, money, TransactionType.STOCK);
        this.stock = stockSymbol;
        this.quantity = quantity;
    }

    public String getSymbol() {
        return stock;
    }

    public int getQuantity() {
        return quantity;
    }

}
