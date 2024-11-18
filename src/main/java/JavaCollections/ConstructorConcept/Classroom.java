package JavaCollections.ConstructorConcept;

public class Classroom {

    //Constructor with Array Initialization

    private static String className;
    private static String students[];

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    public void printClassRoom() {
        System.out.println("ClassName: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String arr[] = {"Andrine", "Ruslan", "Martin"};

        Classroom classroom = new Classroom("Science Batch", arr);
        classroom.printClassRoom();

    }

}
