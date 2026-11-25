import java.util.Scanner;

class OrderProcessing {
    String productName = "Laptop";
    String quantity = "2";
    double[] productPrices = {45000, 55000, 65000};

    void processOrder(int position) {
        try {
            
            int qty = Integer.parseInt(quantity);

           
            double productPrice = productPrices[position];

            double totalPrice = qty * productPrice;

            System.out.println("Product Name: " + productName);
            System.out.println("Quantity: " + qty);
            System.out.println("Product Price: ₹" + productPrice);
            System.out.println("Total Price: ₹" + totalPrice);

        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity format");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product position");

        } finally {
            System.out.println("Order Processing Completed");
        }
    }
}

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OrderProcessing order = new OrderProcessing();

        System.out.print("Enter product position: ");
        int position = sc.nextInt();

        order.processOrder(position);

        sc.close();
    }
}
