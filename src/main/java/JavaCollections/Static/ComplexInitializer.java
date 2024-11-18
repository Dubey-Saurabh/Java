package JavaCollections.Static;

public class ComplexInitializer {

    private static int x,y,z;

    static {

        x= 12;
        y=20;
        z=30;

    }

    public static void main(String[] args) {

        System.out.println(ComplexInitializer.x);
        System.out.println(ComplexInitializer.y);
        System.out.println(ComplexInitializer.z);

    }

}
