import java.util.HashMap;

public class InventoryManagement {

    HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product Added.");
    }

    // Update Product
    public void updateProduct(int id, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product Updated.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Delete Product
    public void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product Deleted.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Display Inventory
    public void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        InventoryManagement obj = new InventoryManagement();

        obj.addProduct(new Product(101, "Laptop", 20, 65000));
        obj.addProduct(new Product(102, "Mouse", 100, 700));
        obj.addProduct(new Product(103, "Keyboard", 50, 1200));

        System.out.println("\nInventory:");
        obj.displayProducts();

        obj.updateProduct(102, 120, 750);

        obj.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");
        obj.displayProducts();
    }
}