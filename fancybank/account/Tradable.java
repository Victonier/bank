/*
 * Interface for those accounts that provide stock trading function
 */
package fancybank.account;

import fancybank.stock.Stock;

public interface Tradable {
    public boolean buyStock(Stock stock, int quantity);

    public boolean buyStock(String symbol, int quantity);

    public int hasStock(String symbol);

    public int hasStock(Stock symbol);

    public double sellStock(Stock stock, int quantity);

    public double sellStock(String symbol, int quantity);
}
