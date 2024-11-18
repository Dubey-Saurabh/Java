package JavaCollections.Static;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private static String bankName;
    private static double interestRate;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {

        BankAccount.setBankName("SBI");
        BankAccount.setInterestRate(17.2);

        BankAccount bankAccount = new BankAccount(256378336, 453.2);
        bankAccount.printDetails();



    }
}
