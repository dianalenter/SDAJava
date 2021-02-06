package fundamentals.oopBankAccount;

/**
 * Write an application that contains the following classes:
 * BankAccount which is consists of:
 * constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized with 0 in the constructor)
 * fields: type of the account (SAVING or SPENDING),  balance ( the amount of money), currency ( USD, EUR),
 * methods:
 * 1.addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
 * 2.withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance can not be < 0 otherwise print a suggestive  error message ),
 * 3.covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and returns the result = the money in the input currency)
 */
public class BankAccount { //ALT + Insert creiaza automat Setter si Getter
    //creeam fildurile
    /**
     * Type of account:SAVING or SPENDING
     */
    private String type;
    /**
     * Balance of the account
     */
    private double balance;
    /**
     * Currency: USA or EUR
     */
    private String currency;  //USA /EUR

    public final static double USD_TO_EUR = 0.23;  //constantele se declara cu litere mari si _
    public final static double EUR_TO_USD = 1.23;

    //creeam constructorul - nu este voie cu celasi nr de argumente
    public BankAccount(String type, String currency) {    //1st constructor (defoult constructor)
        this.type = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {                                  //2md constructor
        this.type = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    /**
     * 1.addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of
     * money that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
     *
     * @return
     */
//    public void addMoney(double newMoney) {
//        if (this.type == "SPENDING") {
//            if (newMoney <= this.balance / 10) {
//                System.out.println("Please add least 10% of actual balance ");
//            } else {
//                this.balance += newMoney;
//            }
//            return;
//        }
//        this.balance += newMoney;
//    }
    //sau
    public void addMoney1(double newMoney) {
        if (this.type == "SPENDING" && newMoney <= this.balance / 10) {
            System.out.println("Please add least 10% of actual balance ");
            return;   //return te scoate din metoda complet.(iese din functie)
        }
        this.balance += newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    /**
     * 2.withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING
     * the remaining balance can not be < 0 otherwise print a suggestive  error message ),
     *
     * @return
     */
    public void withdrawMoney(double newMoney) {
        if (this.type == "SAVING" && this.balance - newMoney < 0) {
            System.out.println("Your balance can't be negative! ");
            return;
        }
        this.balance -= newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    /**
     * 3.covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert,
     * and the currency to convert to and returns the result = the money in the input currency)
     *
     * @return
     */

    public static double convertMoneyToCurrency(double amountOfMuney, String inputCurrency, String outputCurrency) {
        if (inputCurrency.equals("EUR") && outputCurrency.equals("USD")) {
            return amountOfMuney * EUR_TO_USD;
        }
        return amountOfMuney * USD_TO_EUR;
    }

    @Override                       //alt+insert + toString()
    public String toString() {
        return "BankAccount{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Return the balance of the account
     *
     * @return
     */

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {                                  //CTRL+Click ne duce direct la metoda
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
