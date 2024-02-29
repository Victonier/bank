
# CS611-<Final Project>
## <My Fancy Bank>
---------------------------------------------------------------------------
<Kangxian Xie>
<kangxian@bu.edu> 
<U24768544> 

<Yuhang Song> 
<yuhangs@bu.edu>
<U94197488>

<Di Wang>
<vvictors@bu.edu>
<U22721196>

<Haodong Chen>
<hjc5283@bu.edu>
<U60875202>

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directorycontains Main.java after unzipping the files
2. Run the following instructions:

[Windows]
mkdir bin
javac -d bin -cp ".;lib/*"  -nowarn Main.java 
java -cp "bin/;lib/*" Main

[Linux & MacOS]
mkdir bin
javac -d bin -cp ".:lib/*"  -nowarn Main.java 
java -cp "bin/:lib/*" Main


## Files
---------------------------------------------------------------------------
<A brief description of each file and what it does>

Java files:
Account class: (abstract) implements Transferable interface
Account class defines a general bank account object, which contains basic information like account ID and balance. Account class implements Transferable interface because in our belief, any account can transfer money to another account.

Exchangeable: (interface)
This interface defines the behavior of exchanging money currency between two accounts, with the purpose of exchanging between different currencies.

CashOperable:(interface)
This interface defines behaviors that concern cash operations for bank accounts. More precisely, it regulates the cash-related operations that an account could do. Cash operations are withdrawals and deposits. 

Transferable: (interface)
This interface defines inter-account money transfer. Any subclass of account class that could transfer money from itself to other accounts should implement this interface. In our case, all accounts should implement this interface.

Tradable: (interface)
This interface defines the behavior of an account that can invest in the stock market. Therefore, important methods like BuyStock, SellStock are included in this interface.

CheckingAccount Class:
extends Account class, implements CashOperable, Exchangeable 
The CheckingAccount class represents a bank checking account with specific currency type and contains information of cash loans made with this account. 
Given that different checking accounts maintain different currencies, it implements the “Exchangeable interface” so that the checking account serves the currency exchange functionality.
It also implements the CashOperable interface because cash operations are the fundamental purpose of checking accounts.

SavingAccount Class:
extends Account class, implements CashOperable
The SavingAccount is set up for saving money for interest generation and as a source of funding to the security account. For calculating interest, it defines an interest rate variable. It implements CashOperable because direct cash operation on saving accounts should also be available.

SecurityAccount Class:
 extends Account class, implements CashOperable, Tradable
The Security Account class mostly serves stock investment purposes. Apart from the between account transfer function, it allows for stock trading.

Balance Class: 
This class represents a bank account balance, which consists of the balance amount as well as the currency type. Within this class, it also handles balance exchange between different currencies, implicitly.

Money Class:	
This class represents money in the bank account. It helps to get the currency and amount of the current account.

StockHoldingList Class:
A class that assists with the management of StockHolding objects.

Currency Class:
Currency class represents the status of a currency, which includes the currency symbol, its exchange rate with USD, and currency name.

CurrencyFactory Class:
This class interacts with the database and provides a list of currencies that are available.

Loan Class:
As customers are allowed to request a loan from the bank, we define a Loan object that represents each loan. Each Loan object should include information about the loan amount, interest rate, a proof of collateral and whether the loan is approved.

Collateral Class:
This class represents an object that is the proof of property that is part of a loan that, upon approval, grants the customer the loan. It is treated as a computer file.

Stock Class:
This class represents a stock object in the market, where the public information of the stock is maintained.

StockHolding Class:
This class represents a piece of stock share that was purchased by a customer. It will contain more transactional information like purchase price, amount of share purchased. This will aid us in determining the realized profit and unrealized profit.

StockMarket Class:
This class represents the entire stock market, where we employed the singleton design pattern to ensure the uniqueness. This class interacts with data storage and provides information of stock market prices, stock purchase availability.

Transaction class:(abstract)
To keep a record of any bank atm operations, we introduce the transaction class that records that specific information regarding each transaction. The common variables for any transaction are amount, operation type, transaction source, transaction target.

CashTransaction Class: extends Transaction class
This type of transaction is cash related transaction and it’s to record when accounts make deposits or withdrawals.

TransferTransaction Class: extends Transaction class
This type of transaction is a transfer transaction, and it’s created when accounts transfer money to other accounts.

AccountTransaction Class: extends Transaction class
This transaction type records account opening and closing.

InterestTransaction Class: extends Transaction class
This type of transaction is interest related transaction and it’s to record when paying the loan interest.

TransactionType Class:
This is an Enumerated types to enumerate all transaction types. 

User class(abstract): 
This class defines any user who could operate on the ATM machine. Anyone who could operate on the machine needed to login to the machine and provide personal information for verification. Therefore, the class should have member variables like UID and PersonalInfo, which is the intuition for designing this class. The two classes that extend this object would be Customer class and BankManager class.

Customer Class:(extends User class)
This class represents an instance of a bank customer, an instance who could operate the ATM. A bank customer has his/her personal accounts with different purposes. A customer can have multiple checking accounts that support multi-currency, saving accounts for generating interest revenue and security accounts for investment.

Manager Class:(extends User class)
A bank manager is also a user of the ATM, but the operations are fundamentally different from that of customers. The bank manager can access information of all customers, define trading availability of stocks and manipulate stock prices.

Report Class:
This is a class represents detailed report when paying interests and charging fees.

FeeType Class:
This is an Enumerated types to enumerate all fee types. 

Bank Class:
This class represents an instance of a bank. Two types of users can use the bank to register and log in. Also, the user who is given the administrative rights can modify the interest rate.

GUI files:
ApproveLoanPage:
GUI of manager approving the loan with its features.
CheckingAccountPage:	
GUI of checking account with its features.
CustomerEditPage:
GUI of process of manager editing an existed customer.
CustomerInfoPage:
GUI of showing customer information.
CustomerListPage:
GUI of showing existed customers in the bank system.
CustomerMainPage:
GUI of main customer menu that displays after successful login.
DailyTransactionPage:
GUI of showing daily transactions for manager.
ExchangePage:
GUI of processing currency exchange.
ExchangeRateChangePage:
GUI of manager processing existed currency exchange rate.
FileChooserPage:
GUI of customer choosing a proof for loan.
FinancialReportPage:
GUI of showing financial report for manager which including the fees and interests.
LoanDetailPage:
GUI of showing detail information of customers who requested the loan for manager.
LoginPage:
GUI of processing the log in function for two types of users.
ManagerMainPage:
GUI of main manager menu that displays after successful login.
MoneyOperationPage:
GUI of processing money operations including the deposit, withdraw, paying for the loan.
NewCustomerPage:
GUI of creating a user.
OwnStockPage:
GUI of Showing the owned stocks with its features.
RequestLoanPage:
GUI of requesting a loan by the customer.
SavingAccountPage:
GUI of saving account with its features.
SecurityAccountPage:
GUI of security account with its features.
StockEditPage:
GUI of editing existed stocks.
StockMarketPage:
GUI of showing the stock market.
StockOperationPage:
GUI of operating the stocks.
TransactionsPage:
GUI of showing transactions report for customer.
TransferPage:
GUI of processing the transfer function.


## Notes
---------------------------------------------------------------------------
1. <Files to be parsed should be stored in ConfigFiles, for parser class to
read class>
2. <Bonus Done>
3. <Notes to grader>

Use perfect bank guide UI.
Use suitable design patterns to improve the OOD
Get inputs from the input files and without hard-coded
Write detailed comments



# Compile Instructions:


