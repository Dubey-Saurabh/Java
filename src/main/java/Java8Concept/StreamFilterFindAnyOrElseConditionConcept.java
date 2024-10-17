package Java8Concept;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterFindAnyOrElseConditionConcept {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();
        new Customer("Akash", 32);
        new Customer("Anurag", 31);
        new Customer("Saurabh", 33);
        new Customer("Ravi", 34);

        Customer customer = customerList.stream().filter(e -> "Akash".equals(e.getName()))
                .findAny() //return if find any
                .orElse(null);

        System.out.println(customer.getName() + " " + customer.getAge());

             //multiple condition

        Customer customer1 = customerList.stream().filter(e -> "Akash".equals(e.getName()) && 33 == e.getAge())
                .findAny().orElse(null);

        System.out.println(customer1.getName() + " " + customer1.getAge());


    }
}
