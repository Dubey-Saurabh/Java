package JavaBasics.String;

public class StringSubsets {

    public static void main(String[] args) {

        String str = "Saurabh";
        int temp = 0;

        int length = str.length();

        String arr[] = new String[length * (length + 1) / 2];

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                arr[temp] = str.substring(i, j + 1);
                temp++;
            }
        }
        System.out.println("All subsets are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}

