package EngineeringConcepts.SortingCustomerOrders;

public class Main {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Ali", 4500),
                new Order(102, "Ahmed", 2200),
                new Order(103, "Sara", 8000),
                new Order(104, "John", 1200),
                new Order(105, "Ayesha", 5000)
        };

        System.out.println("Bubble Sort");

        Sort.bubbleSort(orders);

        Sort.display(orders);

        Order[] orders2 = {
                new Order(101, "Ali", 4500),
                new Order(102, "Ahmed", 2200),
                new Order(103, "Sara", 8000),
                new Order(104, "John", 1200),
                new Order(105, "Ayesha", 5000)
        };

        System.out.println("\nQuick Sort");

        Sort.quickSort(orders2, 0, orders2.length - 1);

        Sort.display(orders2);
    }
}