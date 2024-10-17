package Java8Concept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapConcept {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();
        new Customer("Akash", 32);
        new Customer("Anurag", 31);
        new Customer("Saurabh", 33);
        new Customer("Ravi", 34);

        String name = customerList.stream().filter(e->"Akash".equals(e.getName()))
                .map(Customer::getName) // Will map the filter to the same object filter is referring
                .findAny().orElse(null);

        System.out.println(name);

        //To collect all customer name

        List<String> customerNames = customerList.stream().map(Customer::getName).collect(Collectors.toList());
        System.out.println("customerNames = " + customerNames);
        customerNames.forEach(System.out::println);


    }
}
