package fancybank.user;

import java.util.ArrayList;
import java.util.Arrays;

import fancybank.data.Data;
import fancybank.data.Handlers.SimulateTime;
import fancybank.loan.Loan;
import fancybank.stock.StockMarket;

/**
 * @author Haodong Chen hjc5283@bu.edu
 * Class for bank manager.
 */
public class Manager extends User {

    public Manager(UID UID, Username username, Name name, Address address, Email email, Password password) {
        super(UID, username, name, address, email, password);
    }

    public ArrayList<Customer> getAllCustomers() {
        return new ArrayList<Customer>(Arrays.asList(Data.getInstance().getCustomerAll()));
    }

    public StockMarket getStockMarket() {
        return Data.getInstance().getStockMarket();
    }

    public Report getReport(SimulateTime date) {
        return new Report(Data.getInstance().getTransactionByDay(Data.getInstance().getTime()));
    }

    public void approveLoan(Loan e) {
        e.approve();
    }

}
