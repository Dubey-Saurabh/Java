package JavaBasics.Practice;

public class ArmstrongNumber {

    public static void isArmstrong(int num) {

        System.out.println("Given number is: " + num);

        int t, r;
        int cube = 0;

        t = num;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            cube = cube + r * r * r;
        }

        if (t == cube) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }

    public static void main(String[] args) {

        isArmstrong(153);
        isArmstrong(1342);

    }
}
