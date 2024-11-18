package JavaCollections.TreeSet;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Orange");

        System.out.println(colors);

        // iterate through all elements in a tree set.
        for (String e : colors) {
            System.out.println(e);
        }

        //add all the elements of a specified tree set to another tree set.
        TreeSet<String> moreColors = new TreeSet<>();
        moreColors.addAll(colors);
        System.out.println(moreColors);

        // reverse order view of the elements contained in a given tree set.
        Iterator it = moreColors.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //get the first and last elements in a tree set.
        System.out.println(colors.pollFirst());
        System.out.println(colors.pollLast());
        System.out.println(colors.first());
        System.out.println(colors.last());

        //clone a tree set list to another tree set.
        TreeSet<String> addColors = (TreeSet<String>) colors.clone();
        addColors.addAll(moreColors);
        System.out.println(addColors);

        // number of elements in a tree set.
        System.out.println(addColors.size());

        //compare two tree sets
        TreeSet<String> t_set1 = new TreeSet<>();
        t_set1.add("Red");
        t_set1.add("Green");
        t_set1.add("Black");
        t_set1.add("White");
        System.out.println("Free Tree set: " + t_set1);

        TreeSet<String> t_set2 = new TreeSet<>();
        t_set2.add("Red");
        t_set2.add("Pink");
        t_set2.add("Black");
        t_set2.add("Orange");
        System.out.println("Second Tree set: " + t_set2);

        for (String e : colors) {
            System.out.println(moreColors.contains(e) ? "Yes" : "No");
        }

        System.out.println("__________");

        //greater than or equal to the given element.

        TreeSet<Integer> tree_num = new TreeSet<>();
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        tree_num.ceiling(16);
        System.out.println(tree_num);

        //less than or equal to the given element.
        tree_num.floor(70);
        System.out.println(tree_num.floor(70));

        //strictly greater than or equal to the given element.
        tree_num.higher(70);
        System.out.println(tree_num.higher(70));

        // lower value than the given element.
        tree_num.lower(89);
        System.out.println(tree_num.lower(89));

        //remove a given element from a tree set.
        tree_num.remove(70);
        System.out.println(tree_num);

        //NavigableSet functions

        //print in reverse order
        System.out.println(tree_num.descendingSet());

        //print till some element
        System.out.println(tree_num.headSet(16, true));

        //ignore some element and print till the given element
        TreeSet<Integer> tree_head = new TreeSet<>();
        tree_head.add(10);
        tree_head.add(22);
        tree_head.add(36);
        tree_head.add(25);
        tree_head.add(16);
        tree_head.add(70);
        tree_head.add(82);
        tree_head.add(89);
        tree_head.add(14);
        System.out.println(tree_head.subSet(22, false, 89, true));

        //print till tailhead
        System.out.println(tree_head.tailSet(82, true));

        //print subset of tree set
        System.out.println(tree_head.subSet(22, 89));

        //print from element till tail of set
        System.out.println(tree_head.tailSet(16));


    }
}
