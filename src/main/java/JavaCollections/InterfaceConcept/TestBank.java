package JavaCollections.InterfaceConcept;

public class TestBank {

    public static void main(String[] args) {
        System.out.println(USBank.MIN_BAL);
        // Static polymorphism
        HSBCbank hs = new HSBCbank();
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.educationLoan();
        hs.carLoan();
        hs.mutualFund();
        // dynamic polymorphism
        USBank us = new HSBCbank(); // Child class object can be referred by parent interface ref variable.

        us.credit();
        us.debit();
        us.transferMoney();


    }

}
