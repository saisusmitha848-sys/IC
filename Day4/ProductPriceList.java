import java.util.ArrayList;
import java.util.Collections;

public class ProductPriceList {

    public static void main(String[] args) {

    
        ArrayList<Double> prices = new ArrayList<>();

       
        prices.add(250.0);
        prices.add(1200.0);
        prices.add(450.0);
        prices.add(150.0);
        prices.add(800.0);
        prices.add(350.0);
        prices.add(2000.0);
        prices.add(600.0);
        prices.add(100.0);
        prices.add(950.0);

       
        System.out.println("Product Prices:");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }

       
        int index = 2;
        double newPrice = 500.0;

        prices.set(index, newPrice);

        System.out.println("\nAfter Updating Price at Index " + index + ":");
        System.out.println(prices);

        
        double highestPrice = Collections.max(prices);
        System.out.println("\nHighest Price: " + highestPrice);

       
        double lowestPrice = Collections.min(prices);
        System.out.println("Lowest Price: " + lowestPrice);

        
        double total = 0;

        for (double price : prices) {
            total += price;
        }

        double average = total / prices.size();

        System.out.println("Average Price: " + average);

       
        Collections.sort(prices);

        System.out.println("\nPrices in Ascending Order:");
        System.out.println(prices);

       
        double minRange = 200.0;
        double maxRange = 800.0;

        System.out.println("\nPrices between " + minRange + " and " + maxRange + ":");

        for (double price : prices) {
            if (price >= minRange && price <= maxRange) {
                System.out.println(price);
            }
        }
    }
}