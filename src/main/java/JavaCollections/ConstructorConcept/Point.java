package JavaCollections.ConstructorConcept;

public class Point {

    //Overloading Constructors with Different Data Types

    private static int x;
    private static double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public void printPointers() {
        System.out.println("Value of x: " + x + " ," + "Value of y: " + y);
    }

    public static void main(String[] args) {

        Point point1 = new Point(34, 43);
        point1.printPointers();
        Point point2 = new Point(463.2, 89.3);
        point2.printPointers();

    }


}
