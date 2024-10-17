package JavaBasics.String;

public class StarPattern {

    public static void main(String[] args) {

        //First
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //Second
        for (int i = 0; i < 6; i++) {
            for (int j = 2 * (6 - i); j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //Third
        for (int i = 0; i < 6; i++) {
            for (int j = 6 - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //Fourth
        int row = 7;
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * " + "  ");
            }
            System.out.println();
        }
    }

}
