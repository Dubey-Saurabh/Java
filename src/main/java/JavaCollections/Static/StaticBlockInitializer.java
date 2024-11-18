package JavaCollections.Static;

public class StaticBlockInitializer {

    // Static Block

    private static int staticValue;

    static {
        staticValue = 1000;
        System.out.println(StaticBlockInitializer.staticValue);
    }

    public static void main(String[] args) {

        System.out.println(StaticBlockInitializer.staticValue);
        StaticBlockInitializer initializer = new StaticBlockInitializer();
        System.out.println(StaticBlockInitializer.staticValue);


    }

}
