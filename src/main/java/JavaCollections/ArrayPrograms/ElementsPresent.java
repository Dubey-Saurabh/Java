package JavaCollections.ArrayPrograms;

public class ElementsPresent {


    public static boolean ifElementPresent(int arr[], int a, int b) {


        for (int e : arr) {

            boolean r = e != a && e != b;
            // If the condition is met, return false.
            if (r) {
                return false;
            }
        }
        // If all elements in the array are either num1 or num2, return true.
        return true;
    }


    public static void main(String[] args) {

        int array[] = {77, 77, 65, 65, 65, 77};

        System.out.println(ifElementPresent(array,65,77));

    }


}
