/*
 * Pathes of stored data files
 */
package fancybank.data;

public enum DataFile {
    CUSTOMER("./Customer.data"),
    MANAGER("./Manager.data"),
    TRANSACTION("./Transaction.data"),
    STOCKMARKET("./Stock.data"),
    CURRENCY("./Currency.data"),
    SIMULATETIME("./Time.data"),
    BANK("./Bank.data"),
    ;

    private String path;

    DataFile(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
