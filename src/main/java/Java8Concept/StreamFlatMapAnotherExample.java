package Java8Concept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapAnotherExample {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.addDevices("OnePlus");
        e.addDevices("Iphone6");
        e.addDevices("Samsung 7");
        e.addDevices("Moto");

        Employee f = new Employee();
        e.addDevices("Oppo");
        e.addDevices("Iphone6");
        e.addDevices("Vivo");
        e.addDevices("Moto");

        List<Employee >empList = new ArrayList<>();
        empList.add(e);
        empList.add(f);

        List<String> collectionOfUniqueDevices = empList.stream().map(x->x.getDevices())
                .flatMap(x->x.stream())
                .distinct().collect(Collectors.toList());

        collectionOfUniqueDevices.forEach(x-> System.out.println(x));









    }
}
