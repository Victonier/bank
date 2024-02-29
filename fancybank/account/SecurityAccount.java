/*
 * Security Account is for stock trading. But it can also be used to transfer money.
 */
package fancybank.account;

import java.util.ArrayList;

import fancybank.data.Data;
import fancybank.stock.Stock;
import fancybank.stock.StockHolding;
import fancybank.stock.StockMarket;
import fancybank.transaction.StockTransaction;

public class SecurityAccount extends Account implements Transferable, Tradable, CashOperable {
    private StockHoldingList stockHoldingList = new StockHoldingList();

    public SecurityAccount() {
        super();
    }

    public SecurityAccount(int accountNumber) {
        super(accountNumber, "security", 0, "USD");
    }

    // we only allow USD for stock account
    public SecurityAccount(int accountNumber, double balance) {
        super(accountNumber, "security", balance, "USD");
    }

    public StockHoldingList getStockHoldingList() {
        return stockHoldingList;
    }

    public void setStockHoldingList(StockHoldingList stockHoldingList) {
        this.stockHoldingList = stockHoldingList;
    }

    @Override
    public void transferTo(Account target, double amount) {
        if (amount < 0) {
            return;
        }
        if (!getBalance().isSufficient(amount)) {
            return;
        }
        getBalance().subtract(amount);
        target.getBalance().add(amount);
    }

    @Override
    public boolean buyStock(Stock stock, int quantity) {
        // query the latest market information
        stock = StockMarket.getInstance().getStock(stock.getSymbol());
        System.out.println("here");
        if (stock == null) {
            return false;
        }
        if (quantity <= 0) {
            return false;
        }
        System.out.println("here");
        double totalCost = stock.getPrice() * quantity;
        if (!getBalance().isSufficient(totalCost)) {
            return false;
        }
        System.out.println("here");

        getBalance().subtract(totalCost);
        System.out.println("here");

        StockHolding stockHolding = new StockHolding(stock, quantity);
        stockHoldingList.add(stockHolding);
        Data.getInstance()
                .addTransaction(new StockTransaction(-2, getAccountNumber(),
                        new Money(getBalance().getCurrency(), totalCost), quantity, stock.getSymbol()));
        return true;
    }

    @Override
    public boolean buyStock(String symbol, int quantity) {
        Stock stock = StockMarket.getInstance().getStock(symbol);
        return buyStock(stock, quantity);
    }

    @Override
    public int hasStock(Stock stock) {
        if (stock == null) {
            return 0;
        }
        ArrayList<StockHolding> stockHoldingList = this.stockHoldingList.getStockHoldingList(stock);
        if (stockHoldingList.size() == 0) {
            return 0;
        }
        int totalQuantity = 0;
        for (StockHolding stockHolding : stockHoldingList) {
            totalQuantity += stockHolding.getQuantity();
        }
        return totalQuantity;
    }

    @Override
    public int hasStock(String symbol) {
        Stock stock = StockMarket.getInstance().getStock(symbol);
        if (stock == null) {
            return 0;
        }
        return hasStock(stock);
    }

    @Override
    public double sellStock(Stock stock, int quantity) {
        if (stock == null) {
            return 0;
        }
        if (quantity <= 0 || quantity > hasStock(stock)) {
            return 0;
        }
        ArrayList<StockHolding> stockHoldingList = this.stockHoldingList.getStockHoldingList(stock);
        double totalValue = stock.getPrice() * quantity, totalBoughtPrice = 0;
        getBalance().add(totalValue);
        int remainingQuantity = quantity;
        for (StockHolding stockHolding : stockHoldingList) {
            System.out.println(totalBoughtPrice);
            if (stockHolding.getQuantity() <= remainingQuantity) {
                this.stockHoldingList.remove(stockHolding);
                totalBoughtPrice += stockHolding.getQuantity() * stockHolding.getBoughtPrice();
                remainingQuantity -= stockHolding.getQuantity();
            } else {
                stockHolding.setQuantity(stockHolding.getQuantity() - remainingQuantity);
                totalBoughtPrice += remainingQuantity * stockHolding.getBoughtPrice();
                remainingQuantity = 0;
            }
            if (remainingQuantity == 0) {
                break;
            }
        }
        Data.getInstance()
                .addTransaction(new StockTransaction(getAccountNumber(), -2,
                        new Money(getBalance().getCurrency(), totalValue), quantity, stock.getSymbol()));
        return totalValue - totalBoughtPrice;
    }

    @Override
    public double sellStock(String symbol, int quantity) {
        Stock stock = StockMarket.getInstance().getStock(symbol);
        return sellStock(stock, quantity);
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        getBalance().add(amount);
    }

    @Override
    public void withdraw(double amount) {
        // TODO Auto-generated method stub
        getBalance().subtract(amount);
    }
}
