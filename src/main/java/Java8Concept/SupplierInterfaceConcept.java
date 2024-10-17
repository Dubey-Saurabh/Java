package Java8Concept;

import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceConcept {

    public static void main(String[] args) {

        //no argument and get a result

        getText(() -> "Java");

    }

    public static void getText(Supplier<String> text) {
        System.out.println(text.get().length());
    }

}
