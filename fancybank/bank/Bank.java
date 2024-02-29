/*
 * Bank singleton class to store necessary information for the bank
 */

package fancybank.bank;

import fancybank.data.Data;
import fancybank.user.Address;
import fancybank.user.Customer;
import fancybank.user.Email;
import fancybank.user.Manager;
import fancybank.user.Name;
import fancybank.user.Password;
import fancybank.user.Username;

public class Bank {
    private static Bank instance;

    public static Bank getInstance() {
        if (instance == null)
            instance = Data.getInstance().getBank();
        return instance;
    }

    public Bank() {
        fee = 0.01;
        savingInterestRate = 0.01;
        loanInterestRate = 0.05;
    }

    public void save() {
        Data.getInstance().updateBank(instance);
    }

    private double savingInterestStart = 2000;
    private double savingInterestRate;
    private double loanInterestRate;
    private double fee;

    public double getSavingInterestStart() {
        return savingInterestStart;
    }

    public double getSavingsInterestRate() {
        return savingInterestRate;
    }

    public double getLoanInterestRate() {
        return loanInterestRate;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
        this.save();
    }

    public void setSavingsInterestRate(double savingInterestRate) {
        this.savingInterestRate = savingInterestRate;
        this.save();
    }

    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
        this.save();
    }

    public Customer Login(String username, String password) {
        Customer customer = Data.getInstance().getCustomerByUsername(new Username(username), password);
        // return null if username or password is wrong
        return customer;
    }

    public Customer Register(String username, String firstName, String middleName,
            String lastName, String street, String city, String state, String zip, String country, String email,
            String password) {
        Customer customer = Data.getInstance().addCustomer(new Username(username),
                new Name(firstName, middleName, lastName), new Address(street, city, state, zip, country),
                new Email(email), new Password(password));
        customer.createSavingAccount(0, "USD");
        customer.createSecurityAccount(0);
        customer.createCheckAccount(0, "USD");
        return customer;
    }

    public Manager ManagerLogin(String username, String password) {
        Manager manager = Data.getInstance().getManagerByUsername(new Username(username), password);
        return manager;

    }

    // TODO
    public Manager ManagerRegister(String username, String firstName, String middleName,
            String lastName, String street, String city, String state, String zip, String country, String email,
            String password) {
        Manager manager = Data.getInstance().addManager(new Username(username),
                new Name(firstName, middleName, lastName), new Address(street, city, state, zip, country),
                new Email(email), new Password(password));
        return manager;
    }
}
