/* 
 * StockHoldingList contains a list of StockHolding objects.
 * each stockholding is a stock transaction we bought.
 */

package fancybank.account;

import java.util.ArrayList;

import fancybank.stock.Stock;
import fancybank.stock.StockHolding;

public class StockHoldingList {
    private ArrayList<StockHolding> stockHoldingList;

    public StockHoldingList() {
        stockHoldingList = new ArrayList<StockHolding>();
    }

    public ArrayList<StockHolding> getStockHoldingList() {
        return stockHoldingList;
    }

    public void setStockHoldingList(ArrayList<StockHolding> stockList) {
        this.stockHoldingList = stockList;
    }

    public void add(StockHolding stockHolding) {
        stockHoldingList.add(stockHolding);
    }

    public void remove(StockHolding stockHolding) {
        stockHoldingList.remove(stockHolding);
    }

    public boolean hasStockHolding(StockHolding stockHolding) {
        return stockHoldingList.contains(stockHolding);
    }

    public boolean hasStockHolding(String symbol) {
        for (StockHolding stockHolding : stockHoldingList) {
            if (stockHolding.getStock().getSymbol().equals(symbol)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<StockHolding> getStockHoldingList(String symbol) {
        ArrayList<StockHolding> re = new ArrayList<StockHolding>();
        for (StockHolding stockHolding : stockHoldingList) {
            if (stockHolding.getSymbol().equals(symbol)) {
                re.add(stockHolding);
            }
        }
        return re;
    }

    public ArrayList<StockHolding> getStockHoldingList(Stock stock) {
        return getStockHoldingList(stock.getSymbol());
    }

    public int size() {
        return stockHoldingList.size();
    }

    public double getTotalValue() {
        double re = 0;
        for (StockHolding stockHolding : stockHoldingList) {
            re += stockHolding.getValue();
        }
        return re;
    }
}
