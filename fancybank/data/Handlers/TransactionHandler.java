package fancybank.data.Handlers;

import java.util.ArrayList;
import java.util.Collections;

import fancybank.transaction.AccountTransaction;
import fancybank.transaction.CashTransaction;
import fancybank.transaction.InterestTransaction;
import fancybank.transaction.StockTransaction;
import fancybank.transaction.Transaction;
import fancybank.transaction.TransferTransaction;

/**
 * @author Haodong Chen hjc5283@bu.edu
 * Class for maintaining customers' transactions. 
 */
public class TransactionHandler {

    private AccountTransaction[] accountTrans;
    private CashTransaction[] cashTrans;
    private InterestTransaction[] interestTrans;
    private TransferTransaction[] transferTrans;
    private StockTransaction[] stockTrans;

    public TransactionHandler() {
        accountTrans = new AccountTransaction[0];
        cashTrans = new CashTransaction[0];
        interestTrans = new InterestTransaction[0];
        transferTrans = new TransferTransaction[0];
        stockTrans = new StockTransaction[0];
    }

    public Transaction[] getTransactions() {
        ArrayList<Transaction> resultList = new ArrayList<Transaction>();
        Collections.addAll(resultList, accountTrans);
        Collections.addAll(resultList, cashTrans);
        Collections.addAll(resultList, interestTrans);
        Collections.addAll(resultList, transferTrans);
        Collections.addAll(resultList, stockTrans);
        return resultList.toArray(new Transaction[0]);
    }

    public AccountTransaction[] getAccountTrans() {
        return accountTrans;
    }

    public CashTransaction[] getCashTrans() {
        return cashTrans;
    }

    public InterestTransaction[] getInterestTrans() {
        return interestTrans;
    }

    public TransferTransaction[] getTransferTrans() {
        return transferTrans;
    }

    public StockTransaction[] getStockTrans() {
        return stockTrans;
    }

    public void addAccountTran(AccountTransaction e) {
        AccountTransaction[] newArr = new AccountTransaction[accountTrans.length + 1];
        for(int i = 0; i < accountTrans.length; i ++) {
            newArr[i] = accountTrans[i];
        }
        newArr[accountTrans.length] = e;
        accountTrans = newArr;
    }

    public void addCashTran(CashTransaction e) {
        CashTransaction[] newArr = new CashTransaction[cashTrans.length + 1];
        for(int i = 0; i < cashTrans.length; i ++) {
            newArr[i] = cashTrans[i];
        }
        newArr[cashTrans.length] = e;
        cashTrans = newArr;
    }

    public void addInterestTran(InterestTransaction e) {
        InterestTransaction[] newArr = new InterestTransaction[interestTrans.length + 1];
        for(int i = 0; i < interestTrans.length; i ++) {
            newArr[i] = interestTrans[i];
        }
        newArr[interestTrans.length] = e;
        interestTrans = newArr;
    }

    public void addTransferTran(TransferTransaction e) {
        TransferTransaction[] newArr = new TransferTransaction[transferTrans.length + 1];
        for(int i = 0; i < transferTrans.length; i ++) {
            newArr[i] = transferTrans[i];
        }
        newArr[transferTrans.length] = e;
        transferTrans = newArr;
    }

    public void addStockTran(StockTransaction e) {
        StockTransaction[] newArr = new StockTransaction[stockTrans.length + 1];
        for(int i = 0; i < transferTrans.length; i ++) {
            newArr[i] = stockTrans[i];
        }
        newArr[stockTrans.length] = e;
        stockTrans = newArr;
    }
    
}
