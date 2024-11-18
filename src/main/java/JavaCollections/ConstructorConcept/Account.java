package JavaCollections.ConstructorConcept;

public class Account {

    //Constructor with Validation

    private static String accountNumber;
    private static double balance;


    public Account(String accountNumber, double balance) {

        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Account number can't be null or empty");
            return;
        }

        if (balance < 0) {
            System.out.println("Balance can't be negative");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;


    }

    public static void main(String[] args) {

        Account account = new Account("123674884", 234.2);
        System.out.println(account.accountNumber);
        System.out.println(account.balance);

        // Test with invalid accountNumber
        Account account2 = new Account("", 400.00);

        // Test with invalid balance
        Account account3 = new Account("1230000873", -200.00);

    }
}
