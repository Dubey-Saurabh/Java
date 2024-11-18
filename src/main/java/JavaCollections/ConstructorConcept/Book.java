package JavaCollections.ConstructorConcept;

public class Book {

    //Constructor Overloading
    private static String title;
    private static String author;
    private static double price;

    public Book() {
        this.title = "Unknown";
        this.author = "UnknownAuthor";
        this.price = 0.0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);

        System.out.println("___");

        Book book2 = new Book("Habits","Atomic Murray");
        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.price);

        System.out.println("___");
        Book book3 = new Book("Harry Potter","J K Rowling",132.34);
        System.out.println(book3.title);
        System.out.println(book3.author);
        System.out.println(book3.price);

    }


}
