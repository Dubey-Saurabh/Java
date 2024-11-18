package JavaCollections.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistTest {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Orange");

        System.out.println(colors);

        for (String e : colors) {
            System.out.println(e);
        }

        //insert an element
        colors.add(1, "Red");
        System.out.println(colors);

        //set an element
        colors.set(2, "Purple");
        System.out.println(colors);

        //retrieve an element
        System.out.println(colors.get(4));

        //remove the third element
        colors.remove(3);
        System.out.println(colors);

        //search for an element in an array list
        if (colors.contains("Yellow")) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }

        //sort a given array list.
        Collections.sort(colors);
        System.out.println(colors);

        //Copying array, we may use Collections.copy also
        ArrayList<String> moreColors = new ArrayList<>(colors);
        moreColors.add("Nylon");
        moreColors.add("Olive green");

        System.out.println(moreColors);

        //shuffle elements in an array list
        Collections.shuffle(moreColors);
        System.out.println(moreColors);

        //reverse elements in an array list.
        Collections.reverse(moreColors);
        System.out.println(moreColors);

        //extract a portion of an array list.
        System.out.println("+++++++++");
        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        List<String> sub_List = list_Strings.subList(0, 3);
        System.out.println(sub_List);

        //compare two array lists.
        System.out.println("======");
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<>();
        for (String e : c1) {
            c3.add(c2.contains(e) ? "Present" : "NotPresent");
        }
        System.out.println(c3);

        //swaps two elements in an array list
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Red");
        a1.add("Green");
        a1.add("Black");
        a1.add("White");
        a1.add("Pink");

        Collections.swap(a1, 1, 3);
        System.out.println(a1);

        //Merge two array lists
        System.out.println("Merging two list ==========");
        ArrayList<String> c4 = new ArrayList<>();
        c4.add("Red");
        c4.add("Green");
        c4.add("Black");
        c4.add("White");
        c4.add("Pink");

        ArrayList<String> c5 = new ArrayList<>();
        c5.add("Red");
        c5.add("Green");
        c5.add("Black");
        c5.add("Pink");

        ArrayList<String> c6 = new ArrayList<>();
        c6.addAll(c4);
        c6.addAll(c5);
        System.out.println(c6);

        //common elements in both list
        System.out.println("+++++++++++++");
        c4.retainAll(c5);
//        for (String ele: c4){
//            System.out.println(ele);
//        }
        System.out.println(c4);

        //clone an array list to another array list.
        System.out.println("Cloning a list ==========");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Mazda");

        ArrayList<String> newCars = (ArrayList<String>) cars.clone();
        newCars.add("Audi");
        newCars.set(3, "Lexus");

        System.out.println(newCars);

        //empty an array list.
        newCars.removeAll(newCars);
        System.out.println(newCars);

        //an array list is empty or not.
        System.out.println(newCars.isEmpty());

        // trimming the capacity of an array list.
        cars.trimToSize();
        System.out.println(cars);

        //increase an array list size.
        cars.ensureCapacity(6);
        cars.add("Lexus");
        cars.add("Mustang");
        System.out.println(cars);

        //print all the elements of an ArrayList using the elements' position
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }


    }
}
