package EngineeringConcepts.LibraryManagementSystem;

public class Library {

    private Book[] books;

    public Library() {

        books = new Book[]{

                new Book(101, "Algorithms", "Thomas Cormen"),
                new Book(102, "Clean Code", "Robert Martin"),
                new Book(103, "Data Structures", "Mark Allen"),
                new Book(104, "Java Programming", "Herbert Schildt"),
                new Book(105, "Operating Systems", "Abraham Silberschatz")

        };
    }

    public Book[] getBooks() {
        return books;
    }
}