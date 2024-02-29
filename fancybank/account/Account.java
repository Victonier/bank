/*
 * This is the base class for all accounts. It contains the account number, balace and account type.
 */
package fancybank.account;

import java.io.Serializable;

public class Account implements Serializable {
    private int accountNumber;
    private Balance balance;
    private String accountType;

    public Account() {
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = new Balance();
        this.accountType = "";
    }

    public Account(int accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = new Balance();
    }

    public Account(int accountNumber, double balance, String currency) {
        this.accountNumber = accountNumber;
        this.balance = new Balance(balance, currency);
    }

    public Account(int accountNumber, String accountType, double balance, String currency) {
        this.accountNumber = accountNumber;
        this.balance = new Balance(balance, currency);
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
