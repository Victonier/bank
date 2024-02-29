package fancybank.stock;

import java.util.ArrayList;

/*
 * Singleton
 * StockMarket class, stores all the stocks in the market
 * Initialize the stock market from DB
 */

import fancybank.data.Data;

public class StockMarket {

    public static StockMarket market;

    public static StockMarket getInstance() {
        if (market == null) {
            // load all the stock data from DB
            market = Data.getInstance().getStockMarket();
        }
        return market;
    }

    private ArrayList<Stock> stockList;

    public void save() {
        Data.getInstance().updateStockMarket(market);
    }

    public StockMarket() {
        stockList = new ArrayList<Stock>();
    }

    public ArrayList<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(ArrayList<Stock> stockList) {
        this.stockList = stockList;
    }

    public boolean addStock(Stock stock) {
        // check if stock already exists
        for (Stock s : stockList) {
            if (s.getSymbol().equals(stock.getSymbol()) || s.getName().equals(stock.getName())) {
                return false;
            }
        }
        stockList.add(stock);
        StockMarket.getInstance().save();
        return true;
    }

    public boolean hasStock(Stock stock) {
        return stockList.contains(stock);
    }

    public boolean hasStock(String symbol) {
        for (Stock stock : stockList) {
            if (stock.getSymbol().equals(symbol)) {
                return true;
            }
        }
        return false;
    }

    public Stock getStock(String symbol) {
        for (Stock stock : stockList) {
            if (stock.getSymbol().equals(symbol)) {
                return stock;
            }
        }
        return null;
    }

    public int size() {
        return stockList.size();
    }

    public boolean removeStock(String symbol) {
        Stock theStock = getStock(symbol);
        if (theStock != null) {
            stockList.remove(theStock);
            return true;
        }
        return false;
    }

    public boolean removeStock(Stock stock) {
        if (hasStock(stock)) {
            stockList.remove(stock);
            return true;
        }
        return false;
    }

}
