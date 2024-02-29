/*
 * Fee schedule of the bank
 */

package fancybank.user;

public enum FeeType {

    SAVE_INTEREST(0.002),
    LOAN_INTEREST(0.004),
    OPEN_ACCOUNT(20),
    CLOSE_ACCOUNT(10),
    CASH_OPERATION(2),
    ;

    private double amount;

    FeeType(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
