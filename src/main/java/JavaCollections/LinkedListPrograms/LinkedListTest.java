package JavaCollections.LinkedListPrograms;

import java.util.*;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

        System.out.println(fruits);

        //iterate through all elements in a linked list.
        for (String e : fruits) {
            System.out.println(e);
        }

        //iterate through all elements in a linked list starting at the specified position.
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //iterate a linked list in reverse order.
        Iterator reverseIt = fruits.descendingIterator();
        while (reverseIt.hasNext()) {
            System.out.println(reverseIt.next());
        }

        //insert the specified element at the specified position in the linked list.
        fruits.add(2, "Guava");
        System.out.println(fruits);

        //insert elements into the linked list at the first and last positions.
        fruits.addFirst("Banana");
        fruits.addLast("Kiwi");
        System.out.println(fruits);

        //insert the specified element at the front of a linked list.
        fruits.offerFirst("Watermelon");
        fruits.offerLast("Blackberry");
        System.out.println("++++++++++++++");
        System.out.println(fruits);

        //add fruits list to 0th index of more fruits list
        LinkedList<String> moreFruits = new LinkedList<>();
        moreFruits.add("Papaya");
        moreFruits.addAll(0, fruits);
        System.out.println("++++++++++++++");
        System.out.println(moreFruits);

        //get the first and last elements in a linked list.
        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());

        //remove a specified element from a linked list.
        fruits.remove(3);
        System.out.println(fruits);

        //remove the first and last elements from a linked list.
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println(fruits);

        //remove all elements from a linked list.
//        fruits.removeAll(fruits);

        //swaps two elements in a linked list.
        Collections.swap(fruits, 1, 4);
        System.out.println(fruits);

        //shuffle elements in a linked list.
        Collections.shuffle(fruits);
        System.out.println(fruits);

        //Join two linked lists
        LinkedList<String> c1 = new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first linked list: " + c1);
        LinkedList<String> c2 = new LinkedList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second linked list: " + c2);
        LinkedList<String> a = new LinkedList<>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list: " + a);

        //copy a linked list to another linked list.
        Collections.copy(c1, c2);
        System.out.println("++++++++++++++");
        System.out.println(c1);

        //remove and return the first element of a linked list
        fruits.pop();
        System.out.println("++++++++++++++");
        System.out.println(fruits);

        //retrieve, but not remove, the last element of a linked list.
        System.out.println(fruits.peekFirst());
        System.out.println(fruits.peekLast());

        //if a particular element exists in a linked list.
        if (fruits.contains("Kiwi")) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        //convert a linked list to an array list.
        List<String> arrayLists = new ArrayList<>(fruits);
        System.out.println(arrayLists);

        //compare two linked lists.
        LinkedList<String> c3 = new LinkedList<String>();
        c3.add("Red");
        c3.add("Green");
        c3.add("Black");
        c3.add("White");
        c3.add("Pink");

        LinkedList<String> c4 = new LinkedList<String>();
        c4.add("Red");
        c4.add("Green");
        c4.add("Black");
        c4.add("Orange");

        //comparison output in linked list
        LinkedList<String> c5 = new LinkedList<String>();
        for (String e : c3) {
            c5.add(c4.contains(e) ? "Yes" : "No");
            System.out.println(c5);
        }

        // if a linked list is empty or not.
        System.out.println(fruits.isEmpty());

        //to replace an element in a linked list.
        fruits.set(1, "Promenade");
        System.out.println(fruits);


    }
}
