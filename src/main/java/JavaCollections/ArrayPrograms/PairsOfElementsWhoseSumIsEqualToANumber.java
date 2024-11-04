package JavaCollections.ArrayPrograms;

public class PairsOfElementsWhoseSumIsEqualToANumber {

    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int low = 0;
        int sum = 40;
        int high = my_array.length - 1;

        for (int i = 0; i < args.length; i++) {

            while (low < high) {

                if (my_array[low] + my_array[high] > sum) {
                    high--;
                } else if (my_array[low] + my_array[high] < sum) {
                    low++;
                }
                else if (my_array[low] + my_array[high] == sum) {
                    System.out.println("Pair (" + my_array[low] + "," + my_array[high] +")");
                    low++;
                    high--;
                }

            }


        }


    }


}
