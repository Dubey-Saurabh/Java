package Java8Concept.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseOfComparatorInCustomDefinedClass {

    public static void main(String[] args) {

        Student student1 = new Student(3, "Saurabh");
        Student student2 = new Student(7, "Mani");
        Student student3 = new Student(5, "Sarayu");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list, (a, b) -> b.id - a.id);
        System.out.println(list);


    }


    static class Student {

        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return this.id + ":" + this.name;
        }
    }


}


