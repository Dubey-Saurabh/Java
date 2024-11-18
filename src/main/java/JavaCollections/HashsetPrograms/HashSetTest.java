package JavaCollections.HashsetPrograms;

import java.util.*;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> accessories = new HashSet<>();
        accessories.add("Pen");
        accessories.add("Ink");
        accessories.add("Bottle");
        accessories.add("Thread");
        accessories.add("Pencil");

        System.out.println(accessories);

        //iterate through all elements in a hash list.
        Iterator it = accessories.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //get the number of elements in a hash set.
        System.out.println(accessories.size());

        //empty an hash set.
        //        accessories.removeAll(accessories);

        //if a hash set is empty or not.
        System.out.println(accessories.isEmpty());

        //clone a hash set to another hash set.
        HashSet<String> newAccessories = (HashSet<String>) accessories.clone();
        System.out.println(newAccessories);

        //convert a hash set to an array.
        System.out.println("Converting hashset to array");
        String arr[] = new String[newAccessories.size()];
        accessories.toArray(arr);
        System.out.println(Arrays.toString(arr));

        //convert a hash set to a tree set.
        System.out.println("Converting hashset to treeset");
        Set<String> tree_set = new TreeSet<>(accessories);
        System.out.println(tree_set);

        //Java program to find numbers less than 7 in a tree set.
        TreeSet<Integer> tree_num = new TreeSet<>();
        TreeSet<Integer> treeHeadset;

        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);

        treeHeadset = (TreeSet<Integer>) tree_num.headSet(7);

        Iterator it1 = treeHeadset.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        //compare two sets and retain elements that are the same.
        HashSet<String> addMoreAccessories = new HashSet<>();
        addMoreAccessories.add("Key");
        addMoreAccessories.add("Thread");
        addMoreAccessories.add("Bottle");
        addMoreAccessories.add("lunchbox");

        accessories.retainAll(addMoreAccessories);
        System.out.println(accessories);

        //remove all elements from a hash set.
        addMoreAccessories.clear();
        System.out.println(addMoreAccessories);


    }
}
