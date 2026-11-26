import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> sales = new LinkedHashMap<>();

        
        sales.put("Laptop", 10);
        sales.put("Mobile", 25);
        sales.put("Headphones", 15);
        sales.put("Keyboard", 8);

       
        sales.put("Mobile", 30);

        
        System.out.println("Daily Sales Report:");
        for (Map.Entry<String, Integer> e : sales.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        
        int total = 0;
        for (int qty : sales.values())
            total += qty;

        System.out.println("Total Quantity Sold: " + total);

       
        String product = "";
        int max = 0;

        for (Map.Entry<String, Integer> e : sales.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                product = e.getKey();
            }
        }

        System.out.println("Highest Sales: " + product + " - " + max);
    }
}
