import java.util.ArrayList;

public class ShoppingCartManagement {

    public static void main(String[] args) {

       
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();

       
        products.add("Laptop");
        quantities.add(1);

        products.add("Mobile");
        quantities.add(2);

        products.add("Headphones");
        quantities.add(3);

        products.add("Keyboard");
        quantities.add(1);

        products.add("Mouse");
        quantities.add(2);

        
        System.out.println("Shopping Cart:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + " - Quantity: " + quantities.get(i));
        }

    
        String removeProduct = "Headphones";

        int removeIndex = products.indexOf(removeProduct);

        if (removeIndex != -1) {
            products.remove(removeIndex);
            quantities.remove(removeIndex);

            System.out.println("\n" + removeProduct + " removed from the cart.");
        } else {
            System.out.println("\nProduct not found.");
        }

        
        String updateProduct = "Mobile";
        int newQuantity = 5;

        int updateIndex = products.indexOf(updateProduct);

        if (updateIndex != -1) {
            quantities.set(updateIndex, newQuantity);

            System.out.println("\nQuantity of " + updateProduct + " updated to " + newQuantity);
        } else {
            System.out.println("\nProduct not found.");
        }

      
        System.out.println("\nUpdated Shopping Cart:");

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + " - Quantity: " + quantities.get(i));
        }

        
        String searchProduct = "Laptop";

        if (products.contains(searchProduct)) {
            System.out.println("\n" + searchProduct + " exists in the cart.");
        } else {
            System.out.println("\n" + searchProduct + " does not exist in the cart.");
        }

       
        int totalProducts = 0;

        for (int quantity : quantities) {
            totalProducts += quantity;
        }

        System.out.println("\nTotal Number of Products: " + totalProducts);

       
        products.clear();
        quantities.clear();

        System.out.println("\nCheckout completed.");
        System.out.println("Shopping cart cleared.");

        System.out.println("Products remaining in cart: " + products.size());
    }
}
