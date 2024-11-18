package JavaBasics.Practice;

public class ReverseAnArray {

    public static void main(String[] args) {


        int arr[] = {2, 4, 6, 7, 3, 2, 6, 7};

        int length = args.length;
        int greatestNumber = Math.floorDiv(length, 2);
        int temp;

        for (int i = 0; i < greatestNumber; i++) {

            temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;


        }

        for (int element : arr){
            System.out.print(element+ " ");
        }

    }
}
