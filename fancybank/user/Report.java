/*
 * Class to generate reports for the bank
 * including the fees collected, interest paid, interest collected
 */

package fancybank.user;

import java.util.HashMap;

import fancybank.transaction.Transaction;

public class Report {

    private double payInterest, collectInterest, collectFee;

    private HashMap<Transaction, FeeType> detail;

    public Report(Transaction[] trans) {
        this.payInterest = 0;
        this.collectInterest = 0;
        this.collectFee = 0;
        this.detail = new HashMap<Transaction, FeeType>();
        generateReport(trans);
    }

    public double getPayInterest() {
        return payInterest;
    }

    public double getCollectInterest() {
        return collectInterest;
    }

    public double getCollectFee() {
        return collectFee;
    }

    private void generateReport(Transaction[] trans) {
        for (Transaction t : trans) {
            switch (t.getType()) {
                case ACCOUNT:
                    if (t.getFrom() < 0) {
                        detail.put(t, FeeType.OPEN_ACCOUNT);
                        collectFee += FeeType.OPEN_ACCOUNT.getAmount();
                    } else {
                        detail.put(t, FeeType.CLOSE_ACCOUNT);
                        collectFee += FeeType.CLOSE_ACCOUNT.getAmount();
                    }
                    break;
                case CASH:
                    detail.put(t, FeeType.CASH_OPERATION);
                    collectFee += FeeType.CASH_OPERATION.getAmount();
                    break;
                case INTEREST:
                    if (t.getFrom() < 0) {
                        detail.put(t, FeeType.SAVE_INTEREST);
                        payInterest += t.getMoney().getAmount() / t.getMoney().getCurrency().getRate();
                    } else {
                        detail.put(t, FeeType.LOAN_INTEREST);
                        collectInterest += t.getMoney().getAmount() / t.getMoney().getCurrency().getRate();
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
