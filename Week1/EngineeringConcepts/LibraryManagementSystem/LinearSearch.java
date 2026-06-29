package EngineeringConcepts.LibraryManagementSystem;

public class LinearSearch {

    public static Book search(Book[] books, String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }
}