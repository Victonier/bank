/*
 * Factory class that holds all the currencies information
 * Singleton class
 * Initialized its data from Data class
 */

package fancybank.currency;

import java.util.ArrayList;

import fancybank.data.Data;

public class CurrencyFactory {
    private static CurrencyFactory instance;

    public static CurrencyFactory getInstance() {
        if (instance == null) {
            ArrayList<Currency> currencyList = Data.getInstance().getCurrencyList();
            instance = new CurrencyFactory(currencyList);
        }
        return instance;
    }

    private ArrayList<Currency> currencyList;

    public CurrencyFactory(ArrayList<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    private void save() {
        Data.getInstance().updateCurrencyList(currencyList);
    }

    public Currency getCurrency(String name) {
        for (Currency currency : currencyList) {
            if (currency.getName().equals(name)) {
                return currency;
            }
        }
        return null;
    }

    public ArrayList<Currency> getCurrencyList() {
        return currencyList;
    }

    public boolean hasCurrency(String name) {
        for (Currency currency : currencyList) {
            if (currency.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void addCurrency(String name, String symbol, double rate) {
        if (!hasCurrency(name)) {
            Currency currency = new Currency(name, symbol, rate);
            currencyList.add(currency);
            save();
        }
    }

    public void removeCurrency(String name) {
        for (Currency currency : currencyList) {
            if (currency.getName().equals(name)) {
                currencyList.remove(currency);
                save();
                break;
            }
        }
    }

    public void updateCurrencyRate(String name, double rate) {
        for (Currency currency : currencyList) {
            if (currency.getName().equals(name)) {
                currency.setRate(rate);
                save();
                break;
            }
        }
    }

}
