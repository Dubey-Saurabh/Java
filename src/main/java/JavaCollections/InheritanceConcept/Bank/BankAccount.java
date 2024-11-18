package JavaCollections.InheritanceConcept.Bank;

public class BankAccount {

    private String account_number;
    private double balance;

    public BankAccount(String account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;

    }

    public void withDrawAmount(double amount) {

        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }

    }

    public double getBalance() {
        return balance;
    }

}

