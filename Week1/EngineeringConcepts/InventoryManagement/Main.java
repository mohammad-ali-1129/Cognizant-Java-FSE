package EngineeringConcepts.InventoryManagement;
public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 15, 65000);
        Product p2 = new Product(102, "Keyboard", 30, 1200);
        Product p3 = new Product(103, "Mouse", 50, 700);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\nInventory:");
        inventory.displayProducts();

        inventory.updateProduct(102, "Mechanical Keyboard", 25, 2200);

        inventory.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");
        inventory.displayProducts();
    }
}