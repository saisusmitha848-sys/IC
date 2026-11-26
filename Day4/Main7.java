import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        LinkedHashSet<String> products = new LinkedHashSet<>();

        
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Keyboard");

 
        products.add("Laptop");

        
        products.add("Mouse");

      
        String search = "Mobile";
        System.out.println("Product Viewed: " + products.contains(search));

       
        products.remove("Keyboard");

     
        System.out.println("Recently Viewed Products: " + products);

       
        System.out.println("Total Products Viewed: " + products.size());
    }
}
