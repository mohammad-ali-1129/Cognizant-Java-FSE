package EngineeringConcepts.LibraryManagementSystem;

public class Display {

    public static void show(Book book) {

        if (book == null) {
            System.out.println("Book Not Found");
            return;
        }

        System.out.println("Book ID : " + book.getBookId());
        System.out.println("Title : " + book.getTitle());
        System.out.println("Author : " + book.getAuthor());
    }
}