package Java8Concept.FunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, Integer> function = x -> x.length();
        Function<String, String> function2 = x -> x.substring(0, 3);
        Function<List<Student>, List<Student>> studentsWithFirstThreeLetterAsMON = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (function2.apply(s.getName()).equalsIgnoreCase("mon")) {
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student(3, "Money");
        Student s2 = new Student(6, "Monkesh");
        Student s3 = new Student(3, "Rishabh");

        List<Student> students = Arrays.asList(s1, s2, s3);
        List<Student> filteredStudent = studentsWithFirstThreeLetterAsMON.apply(students);
        System.out.println(filteredStudent);

        /*andThen method*/
        Function<String, String> function1 = s -> s.toUpperCase();
        System.out.println(function1.andThen(function2).apply("Saurabh"));

        Function<Integer, Integer> function3 = x-> x*2;
        Function<Integer, Integer> function4 = x-> x*x*x;

        System.out.println(function3.andThen(function4).apply(3));
        System.out.println(function4.andThen(function3).apply(3));

        /*compose method*/
        System.out.println(function3.compose(function4).apply(3));

        /*identity method*/
        Function<String, String>functionIdentity = Function.identity();
        System.out.println(functionIdentity.apply("Saurabh"));


    }

    static class Student {

        private int id;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;


    }
}
