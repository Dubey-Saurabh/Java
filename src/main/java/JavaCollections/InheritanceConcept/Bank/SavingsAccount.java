package JavaCollections.InheritanceConcept.Bank;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String account_number, double balance) {
        super(account_number, balance);
    }

    public void withDrawAmount(double amount) {

        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance should be 100");
        } else {
            super.withDrawAmount(amount);
        }

    }


}
