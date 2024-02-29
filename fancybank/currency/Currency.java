/*
 * Base class for any kind of currency. It records the name, symbol and exchange rate of the currency.
 * exchange rate is the rate of the currency to the base currency (USD).
 * So the usd's exchange rate is 1.0
 */
package fancybank.currency;

public class Currency {
    private String name;
    private String symbol;
    private double rate;

    public Currency(String name, String symbol, double rate) {
        this.name = name;
        this.symbol = symbol;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Currency) {
            Currency currency = (Currency) obj;
            return this.name.equals(currency.getName());
        }
        return false;
    }
}
