class Product {

    String productName;
    int quantity;
    double price;

    Product() {
        productName = "Unknown";
        quantity = 1;
        price = 100;
    }

    Product(String productName) {
        this.productName = productName;
        quantity = 1;
        price = 100;
    }

    Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}

public class MainConstructor1 {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mobile", 2, 25000);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
    }
}
