package Java8Concept.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowToUseComparatorUsingLE {

    public static void main(String[] args) {

        List <Integer>arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(9);

        Collections.sort(arrayList, (a,b) -> b-a);
        System.out.println(arrayList);

    }



}
