package Java8Concept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

    public static void main(String[] args) {

        Predicate<Integer> pred = x -> x > 5;
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(11);
        list.add(1);

        List<Integer> newList = list.stream().filter(pred).collect(Collectors.toList());
        System.out.println(newList);


        //And condition
        List<Integer> listAgain = list.stream().filter(x->x>2 && x< 12).collect(Collectors.toList());
        System.out.println(listAgain);


    }
}
