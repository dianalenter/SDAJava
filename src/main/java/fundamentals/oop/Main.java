package fundamentals.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Type: " + bankAccount.getType());
        System.out.println("Currency : " + bankAccount.getCurrency());

        Client client1 = new Client("Diana", "54564366774678", bankAccount);
        System.out.println(client1.toString());
//case 1 give bank accout to the client from outside(created outsiede)
        client1.getBankAccount().addMoney1(12); //a returnat suma din contul respectiv
        System.out.println(client1.toString());
        client1.getBankAccount().setType("SPENDING");
        client1.getBankAccount().addMoney1(1);
        client1.getBankAccount().withdrawMoney(2);

        //double x = bankAccount.convertMoneyToCurrency(10, "EUR", "USD");
        System.out.println(bankAccount.convertMoneyToCurrency(10, "EUR", "USD"));
        // System.out.println(x);

        BankAccount bankAccount1 = new BankAccount("SAVING", "USD");    //dublam o linie de cod cu comanda ctrl+d
        BankAccount bankAccount2 = new BankAccount("SPENDING", "USD");
        BankAccount[] myArray = {bankAccount1, bankAccount2};

        client1.setBankAccounts(myArray);
        System.out.println(myArray[0]);
        BankAccount[] clientBankAcounts = client1.getBankAccounts();
        System.out.println(clientBankAcounts[0]);
        System.out.println(client1.getBankAccounts()[0]);

        BankAccount bankAccount3 = new BankAccount("", "USD;"); //ctrl+d
        BankAccount bankAccount4 = new BankAccount("SAVING", "USD;"); //ctrl+d
        BankAccount[] myAccounts = {bankAccount3, bankAccount4};

        client1.setBankAccounts(myAccounts);
        System.out.println("Datele clientului: " + client1);
        System.out.print("Enter the type of new banking account (SAVING / SPENDING): ");
        String newType = scanner.next();
        System.out.print("Enter the currency of new banking account (EUR / USD): ");
        String newCurrency = scanner.next();
        BankAccount newBankAccount = new BankAccount(newType, newCurrency);

        client1.addBankAccount(newBankAccount);
        System.out.println("Datele actualizate ale clientului: " + client1);
        System.out.println("Contul SAVING al clientului: " + client1.getSavingAccount());
        System.out.print("Enter the type of the banking account you wish to remove (SAVING / SPENDING): ");
        newType = scanner.next();
        client1.removeAccountByType(newType);
        System.out.println("Datele clientului:" + client1);




     /*   System.out.println("input client's name: "); //introducem de la tastatura noul client
        String name = scanner.next();
        System.out.println("input client's cnp: ");
        String cnp = scanner.next();
//case2: client has asigned by defoult a defoult bank account - create the bank account insede the constructor
        Client client2 = new Client(name, cnp);
        System.out.println(client2.toString());*/
    }
}
