/*
 * Base class for any kind of stock.
 * each stock has a symbol, name, and price
 */
package fancybank.stock;

public class Stock {
    private String symbol;
    private String name;
    private double price;

    public Stock(String symbol, String name, double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    public Stock(String symbol, String name) {
        this(symbol, name, 0.0);
    }

    public Stock(String symbol) {
        this(symbol, "", 0.0);
    }

    // symbol is unique identifier to the stock
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
        StockMarket.getInstance().save();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        StockMarket.getInstance().save();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        StockMarket.getInstance().save();
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == this.getClass() && this.symbol.equals(((Stock) obj).getSymbol());
    }

}
