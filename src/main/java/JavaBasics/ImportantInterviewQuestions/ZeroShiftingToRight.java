package JavaBasics.ImportantInterviewQuestions;

import java.util.Arrays;

public class ZeroShiftingToRight {

    public static int[] shiftingZero(int[] num) {

        if (num.length == 1) {
            return num;
        }

        int count = 0;
        int newArray[] = new int[num.length];

        for (int number : num) {
            if (number != 0) {
                newArray[count] = number;
                count++;
            }
        }

        return newArray;

    }

    public static void main(String[] args) {

        int i[] = new int[] {1,2,3,0,5,0,0,3,5};
        System.out.println(Arrays.toString(shiftingZero(i)));

    }

}
