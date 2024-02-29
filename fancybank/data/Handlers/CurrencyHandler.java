package fancybank.data.Handlers;

import java.util.ArrayList;

import fancybank.currency.Currency;

public class CurrencyHandler {

    ArrayList<Currency> currencies;

    public CurrencyHandler() {
        currencies = new ArrayList<Currency>();
        currencies.add(new Currency("USD", "$", 1.0));
        currencies.add(new Currency("EUR", "€", 0.9));
        currencies.add(new Currency("JPY", "¥", 110.0));
        currencies.add(new Currency("GBP", "£", 0.8));
        currencies.add(new Currency("AUD", "$", 1.4));
        currencies.add(new Currency("CAD", "$", 1.3));
        currencies.add(new Currency("CHF", "Fr", 1.0));
        currencies.add(new Currency("CNY", "¥", 7.0));
        currencies.add(new Currency("HKD", "$", 7.8));
        currencies.add(new Currency("NZD", "$", 1.5));
        currencies.add(new Currency("SEK", "kr", 9.0));
        currencies.add(new Currency("SGD", "$", 1.4));
        currencies.add(new Currency("KRW", "₩", 1200.0));
        currencies.add(new Currency("MXN", "$", 20.0));
        currencies.add(new Currency("NOK", "kr", 9.0));
        currencies.add(new Currency("RUB", "₽", 70.0));
        currencies.add(new Currency("INR", "₹", 70.0));
        currencies.add(new Currency("ZAR", "R", 14.0));
        currencies.add(new Currency("TRY", "₺", 6.0));
        currencies.add(new Currency("BRL", "R$", 4.0));
        currencies.add(new Currency("TWD", "NT$", 30.0));
        currencies.add(new Currency("MYR", "RM", 4.0));
        currencies.add(new Currency("PHP", "₱", 50.0));
        currencies.add(new Currency("IDR", "Rp", 14000.0));
        currencies.add(new Currency("THB", "฿", 30.0));
        currencies.add(new Currency("VND", "₫", 23000.0));
        currencies.add(new Currency("CZK", "Kč", 23.0));
        currencies.add(new Currency("DKK", "kr", 6.5));
        currencies.add(new Currency("HUF", "Ft", 300.0));
        currencies.add(new Currency("PLN", "zł", 3.8));
        currencies.add(new Currency("ILS", "₪", 3.5));
    }

    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(ArrayList<Currency> currencies) {
        this.currencies = currencies;
    }

}
