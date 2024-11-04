package JavaBasics.Practice;

public class New {
    public static void main(String[] args) {

        int x = 64;

        int count = 1;
        for (int i = 2; i <= x; i++) {
            if (x% i == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
