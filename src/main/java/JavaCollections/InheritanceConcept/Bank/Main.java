package JavaCollections.InheritanceConcept.Bank;

public class Main {

    public static void main(String[] args) {

        //Created bank account with 500 balance
        BankAccount bankAccount = new BankAccount("BA1234",500);

        //deposit 100
        bankAccount.deposit(1000);
        System.out.println("New balance: "+ bankAccount.getBalance());

        bankAccount.withDrawAmount(200);
        System.out.println("After Withdrawl balance: " +bankAccount.getBalance());

        //Open Saving account

        SavingsAccount savingsAccount = new SavingsAccount("SA2341", 200);

        savingsAccount.deposit(300);
        System.out.println("After deposit in savings account+" +savingsAccount.getBalance());

        savingsAccount.withDrawAmount(100);
        System.out.println("After withdraw from Saving Account:" +savingsAccount.getBalance());

        savingsAccount.withDrawAmount(350);
        System.out.println("Balance after trying to with draw amount 100: " +savingsAccount.getBalance());

    }
}
