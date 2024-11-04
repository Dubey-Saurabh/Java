package JavaCollections.ArrayPrograms;

public class CheckSpecificElementIsPresent {

    public static boolean contains(int num[], int item) {

        for (int e : num) {
            if (item == e) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        System.out.println(contains(my_array1, 2035));

    }


}
