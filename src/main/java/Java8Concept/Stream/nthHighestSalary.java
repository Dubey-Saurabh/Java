package Java8Concept.Stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class nthHighestSalary {

    public static Map.Entry<String, Integer> getnThHighestSalary(Map<String, Integer> employeeSalaries, int n) {

        return employeeSalaries.entrySet()
                .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(n - 1);


    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Abrar", 30000);
        map.put("Chand", 80000);
        map.put("kalam", 70000);
        map.put("Raheem", 25000);
        map.put("Kiran", 63000);
        map.put("Esa", 45000);

        int n=2;

        Map.Entry<String, Integer> res= getnThHighestSalary(map,n);
        System.out.println(res.getValue() + " " + res.getKey());


    }


}
