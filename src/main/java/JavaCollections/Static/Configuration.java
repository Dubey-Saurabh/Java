package JavaCollections.Static;

public class Configuration {

    //Static Block for Initialization

    private static String configValue;

    static {

        configValue = "default config value";
        System.out.println("static block initialization: " +configValue);
    }

    public static void main(String[] args) {

        System.out.println(configValue);

    }
}
