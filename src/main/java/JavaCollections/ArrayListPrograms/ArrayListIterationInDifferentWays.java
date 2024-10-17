package JavaCollections.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArrayListIterationInDifferentWays {

    //8 ways to do that

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Saurabh");
        list.add("Akash");
        list.add("Anurag");
        list.add("Ravi");
        list.add("Rahul");
        list.add("Shivdeep");
        list.add("Nikhil");
        list.add("Kapil");
        list.add("Dushyant");

        //for each loop

        for (String friends : list) {
            System.out.println(friends);
        }

        //for loop

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Iterator

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for each and lambda expression
        System.out.println("------------------------");
        list.forEach(friends -> System.out.println(friends));

        //for each remaining

        System.out.println("-------------");
        it = list.iterator();
        it.forEachRemaining(friend -> System.out.println(friend));

        //traverse in both direction

        ListIterator<String> newListIterator = list.listIterator(list.size());
        while (newListIterator.hasPrevious()) {
            System.out.println(newListIterator.previous());
        }

        //for each and consumer interface concept

        System.out.println("+++++++++++");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //System.out::println method
        System.out.println("+++++++++++");
        list.forEach(System.out::println);

    }
}

