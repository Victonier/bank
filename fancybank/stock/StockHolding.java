/*
 * Every time you buy a stock, you will have a stock holding.
 */
package fancybank.stock;

public class StockHolding {
    private String symbol;
    private double boughtPrice;
    private int quantity;

    public StockHolding(String symbol) {
        this.symbol = symbol;
        this.boughtPrice = 0.0;
        this.quantity = 0;
    }

    public StockHolding(String symbol, double boughtPrice, int quantity) {
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public StockHolding(Stock stock, int quantity) {
        this.symbol = stock.getSymbol();
        this.boughtPrice = stock.getPrice();
        this.quantity = quantity;
    }

    public Stock getStock() {
        Stock curStock = StockMarket.getInstance().getStock(symbol);
        // if the stock is not in the market, it might be taken down so we assume it
        // value goes to 0.
        if (curStock == null) {
            curStock = new Stock(symbol);
        }
        return StockMarket.getInstance().getStock(symbol);
    }

    public void setStock(Stock stock) {
        this.symbol = stock.getSymbol();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getValue() {
        return getStock().getPrice() * quantity;
    }

    public double getUnrealizedProfit() {
        return getValue() - boughtPrice * quantity;
    }

}
