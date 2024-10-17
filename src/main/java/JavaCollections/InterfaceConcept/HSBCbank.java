package JavaCollections.InterfaceConcept;

public class HSBCbank implements USBank, BrazilBank { // achieving Multiple inheritance
    // IS-A relationship.

    // Its mandatory to declare all the methods and their body of the interface inside the class which implemented its property.

    public void credit() {
        System.out.println("HSBC_credit");
    }

    public void debit() {
        System.out.println("HSBC_debit0");
    }

    public void transferMoney() {
        System.out.println("HSBC_transferMoney");
    }

    public void educationLoan() {
        System.out.println("HSBC_educationLoan");
    }

    public void carLoan() {
        System.out.println("HSBC_carLoan");
    }

    public void mutualFund() {
        System.out.println("HSBC_mutualFund");
    }
}
