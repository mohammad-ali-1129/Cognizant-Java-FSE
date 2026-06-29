package EngineeringConcepts.LibraryManagementSystem;

public class BinarySearch {

    public static Book search(Book[] books, String title) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = books[mid].getTitle().compareToIgnoreCase(title);

            if (compare == 0) {
                return books[mid];
            }

            if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}