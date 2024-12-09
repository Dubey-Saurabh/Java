package JavaBasics.String;

public class PrimeNumber {

    public static void checkPrime(int num) {
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                System.out.println("Not prime");
                return;
            } else {
                System.out.println("prime");
                return;
            }
        }


    }

    public static void main(String[] args) {
        checkPrime(11);
        checkPrime(24);
        checkPrime(31);

    }

}
