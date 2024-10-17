package JavaBasics.String;

public class SwapTwoNumbersWithoutUsingThirdVariable {

    public static void main(String[] args) {

        int x = 34;
        int y = 47;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping: " + x + "," + y);

    }
}
