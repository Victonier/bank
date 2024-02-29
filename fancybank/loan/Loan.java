/*
 * Base class for a loan, including the amount borrowed, interest rate, collateral, and the rest of amount to be paid
 */

package fancybank.loan;

import fancybank.account.Account;
import fancybank.data.Data;
import fancybank.user.UID;

public class Loan {
    private UID uid;
    private Account account;
    private double amount;
    private double interestRate;
    private Collateral collateral;
    private double unpaidAmount;
    private boolean isApproved;
    private boolean isDeclined;

    public Loan(UID uid, Account account, double amount, double interestRate, Collateral collateral) {
        this.uid = uid;
        this.account = account;
        this.amount = amount;
        this.interestRate = interestRate;
        this.collateral = collateral;
        this.unpaidAmount = amount;
        this.isApproved = false;
        this.isDeclined = false;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void approve() {
        this.isApproved = true;
        this.account.getBalance().add(amount);
        Data.getInstance().getCustomerByUid(uid).save();

    }

    public boolean isDeclined() {
        return isDeclined;
    }

    public void decline() {
        if (isApproved) { // you cannot revoke an approved loan
            return;
        }
        this.isDeclined = true;
    }

    public double getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(double unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    public boolean isPaidFully() {
        return unpaidAmount == 0;
    }

    public void pay(double amount) {
        if (amount > unpaidAmount) {
            unpaidAmount = 0;
        } else {
            unpaidAmount -= amount;
        }
    }

    public UID getUid() {
        return uid;
    }

    public void setUid(UID uid) {
        this.uid = uid;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Collateral getCollateral() {
        return collateral;
    }

    public void setCollateral(Collateral collateral) {
        this.collateral = collateral;
    }

}
