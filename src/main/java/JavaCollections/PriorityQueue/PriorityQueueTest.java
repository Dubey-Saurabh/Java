package JavaCollections.PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue<String> colors = new PriorityQueue<>();

        colors.add("Yellow");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Orange");

        System.out.println(colors);

        // iterate through all elements in a tree set.
        for (String e : colors) {
            System.out.println(e);
        }

        PriorityQueue<String> moreColors = new PriorityQueue<>();
        moreColors.addAll(colors);
        System.out.println(moreColors);

        //insert a given element into a priority queue.
        moreColors.offer("Red");
        System.out.println("++++++++++++++");
        System.out.println(moreColors);

        //remove all elements from a priority queue.
//        moreColors.clear();

        //count the number of elements in a priority queue.
        System.out.println(colors.size());

        //retrieve the first element of the priority queue.
        System.out.println(moreColors.peek());

        //retrieve and remove the first element.
        System.out.println(moreColors.poll());
        System.out.println(moreColors);

        //convert a priority queue to an array containing all its elements.
        String arr[] = new String[colors.size()];
        colors.toArray(arr);
        System.out.println(Arrays.toString(arr));

        // Displaying the head of the queue using element() method
        // This method throws an exception if the queue is empty
        System.out.println("head:" + colors.element());

        // Removing the head of the queue using remove() method
        // This method throws an exception if the queue is empty
        colors.remove();
        System.out.println(colors);


    }


}


