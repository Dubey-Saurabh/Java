package JavaBasics.String;

public class PrintPrimeNumbersTillTheNumber {

    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            int count = 0;
            for (int j = 1; j < 20; j++) {
                if (i % j == 0) {
                    count++;
                }

            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
