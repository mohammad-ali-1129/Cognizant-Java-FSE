package EngineeringConcepts.Ecommerce;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        System.out.println("Linear Search");

        Product result = Search.linearSearch(products, 104);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");


        System.out.println("\nBinary Search");

        result = Search.binarySearch(products, 104);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");
    }
}
