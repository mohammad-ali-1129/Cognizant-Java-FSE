package EngineeringConcepts.LibraryManagementSystem;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book[] books = library.getBooks();

        System.out.println("Linear Search\n");

        Book book = LinearSearch.search(books, "Java Programming");

        Display.show(book);

        System.out.println("\nBinary Search\n");

        book = BinarySearch.search(books, "Java Programming");

        Display.show(book);
    }
}