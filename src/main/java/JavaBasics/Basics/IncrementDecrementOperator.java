package JavaBasics.Basics;

public class IncrementDecrementOperator {

    public static void main(String[] args) {

        int i = 23;
        int a = i++; // first i assigned to a then it'll increment
        int b= ++i; // first increment will happen then i will be assigned 24
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

    }
}
