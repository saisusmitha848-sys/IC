import java.util.HashSet;

public class UniqueProductInventory {

    public static void main(String[] args) {

        
        HashSet<String> products = new HashSet<>();

       
        products.add("Laptop");
        products.add("Mobile");
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Monitor");
        products.add("Printer");
        products.add("Headphones");
        products.add("Charger");
        products.add("USB Cable");
        products.add("Webcam");

      
        products.add("Tablet");
        products.add("Smart Watch");

        System.out.println("After Adding New Products:");
        System.out.println(products);

        
        products.add("Laptop");
        products.add("Mobile");

        System.out.println("\nAfter Adding Duplicate Products:");
        System.out.println(products);

       
        products.remove("Printer");
        products.remove("Webcam");

        System.out.println("\nAfter Removing Discontinued Products:");
        System.out.println(products);

       
        String searchProduct = "Keyboard";

        if (products.contains(searchProduct)) {
            System.out.println("\n" + searchProduct + " is available in inventory.");
        } else {
            System.out.println("\n" + searchProduct + " is not available in inventory.");
        }

        
        System.out.println("\nAll Unique Products:");

        for (String product : products) {
            System.out.println(product);
        }

        
        System.out.println("\nTotal Unique Products: " + products.size());
    }
}
