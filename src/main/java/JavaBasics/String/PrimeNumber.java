package JavaBasics.String;

public class PrimeNumber {

    public static void checkPrime(int n) {
        int m, flag = 0;
        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Prime");
            }
        }
    }

    public static void main(String[] args) {
        checkPrime(11);
        checkPrime(24);
        checkPrime(31);

    }

}
