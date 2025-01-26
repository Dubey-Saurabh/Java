package JavaCollections.ArrayPrograms;

public class PairsOfElementsWhoseSumIsEqualToANumber {

    public static void main(String[] args) {

        //Sorted array with distinct elements
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 9;

        //Two indexes low and high
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

          /*
            if sum of arr[low] + arr[high] is greater than the
            value of sum then decrement the value of high.
         */
            if ((arr[low] + arr[high]) > sum) {
                high--;

            } else if ((arr[low] + arr[high]) < sum) {
                low++;

            } else if ((arr[low] + arr[high]) == sum) {
                System.out.println(" Pair (" + arr[low] + " , " + arr[high] + " )");
                low++;
                high--;


            }

        }
    }
}
