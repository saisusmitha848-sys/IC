import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductInventoryManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> inventory = new HashMap<>();
        int choice, id, qty;

        do {
            System.out.println("\n1.Add  2.Update  3.Sell  4.Search");
            System.out.println("5.Low Stock  6.Remove Out-of-Stock  7.Display  8.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Enter product ID: ");
                    id = sc.nextInt();

                    if (choice == 1 && inventory.containsKey(id)) {
                        System.out.println("Product already exists.");
                        break;
                    }
                    if (choice == 2 && !inventory.containsKey(id)) {
                        System.out.println("Product not found.");
                        break;
                    }

                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();

                    if (qty >= 0) {
                        inventory.put(id, qty);
                        System.out.println("Quantity saved.");
                    } else {
                        System.out.println("Quantity cannot be negative.");
                    }
                    break;

                case 3:
                    System.out.print("Enter product ID: ");
                    id = sc.nextInt();
                    System.out.print("Enter quantity sold: ");
                    qty = sc.nextInt();

                    if (!inventory.containsKey(id))
                        System.out.println("Product not found.");
                    else if (qty <= 0 || qty > inventory.getOrDefault(id, 0))
                        System.out.println("Invalid sale quantity.");
                    else {
                        inventory.put(id, inventory.get(id) - qty);
                        System.out.println("Remaining quantity: " + inventory.get(id));
                    }
                    break;

                case 4:
                    System.out.print("Enter product ID: ");
                    id = sc.nextInt();
                    if (inventory.containsKey(id))
                        System.out.println("Quantity: " + inventory.get(id));
                    else
                        System.out.println("Product not found.");
                    break;

                case 5:
                    boolean found = false;
                    for (Map.Entry<Integer, Integer> e : inventory.entrySet()) {
                        if (e.getValue() < 5) {
                            System.out.println(e.getKey() + " - " + e.getValue());
                            found = true;
                        }
                    }
                    if (!found) System.out.println("No low-stock products.");
                    break;

                case 6:
                    inventory.values().removeIf(q -> q == 0);
                    System.out.println("Out-of-stock products removed.");
                    break;

                case 7:
                    for (Map.Entry<Integer, Integer> e : inventory.entrySet())
                        System.out.println(e.getKey() + " - " + e.getValue());
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}