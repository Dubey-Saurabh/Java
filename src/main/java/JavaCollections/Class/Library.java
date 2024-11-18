package JavaCollections.Class;

public class Library {

    //Inner Class Accessing Outer Class Members

    String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    class Book {

        public String getLibraryName() {
            return libraryName;
        }

    }

    public static void main(String[] args) {

        Library library = new Library("Centre");
        Library.Book book = library.new Book();
        System.out.println(book.getLibraryName());


    }


}
