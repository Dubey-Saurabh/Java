package Java8Concept.MethodAndConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void test(String s){
        System.out.println(s);;
    }

    public static void main(String[] args) {

        List<String>students = Arrays.asList("Ashok", "Shivam", "Akash");
        /*method reference */
        students.forEach(Main :: test);


        /*Constructor reference*/
        List<String>names = Arrays.asList("Ashok", "Shivam", "Akash");
        List<Student> studentsList = names.stream().map(Student::new).collect(Collectors.toList());
        studentsList.forEach(x-> System.out.println(x));

    }
}
