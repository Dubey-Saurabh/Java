package JavaCollections.Static;

public class IDGenerator {

    //Static Method with Static Variable

    private static int nextID = 0;

    public static int generateID() {
        return nextID++;
    }

    public static void main(String[] args) {

        System.out.println(IDGenerator.generateID());
        System.out.println(IDGenerator.generateID());
    }


}
