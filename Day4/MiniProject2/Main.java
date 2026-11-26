import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> inventory = new HashMap<>();
        HashMap<Integer, String> names = new HashMap<>();
        HashMap<Integer, String> categories = new HashMap<>();
        HashMap<Integer, Double> prices = new HashMap<>();

        HashSet<String> categorySet = new HashSet<>();
        LinkedHashSet<String> recentProducts = new LinkedHashSet<>();

        int choice;

        do {
            System.out.println("\n===== PRODUCT INVENTORY SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Sell Product");
            System.out.println("6. Remove Product");
            System.out.println("7. Add Product Category");
            System.out.println("8. Display Unique Categories");
            System.out.println("9. Display Sorted Categories");
            System.out.println("10. Display Recently Added Products");
            System.out.println("11. Generate Inventory Report");
            System.out.println("12. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (inventory.containsKey(id)) {
                        System.out.println("Product ID Already Exists!");
                        break;
                    }

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    if (price < 0 || qty < 0) {
                        System.out.println("Invalid Price or Quantity!");
                        break;
                    }

                    inventory.put(id, qty);
                    names.put(id, name);
                    categories.put(id, category);
                    prices.put(id, price);

                    categorySet.add(category);
                    recentProducts.add(name);

                    System.out.println("Product Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nID\tName\t\tCategory\tPrice\tQuantity");

                    for (int key : inventory.keySet()) {
                        System.out.println(
                            key + "\t" +
                            names.get(key) + "\t\t" +
                            categories.get(key) + "\t" +
                            prices.get(key) + "\t" +
                            inventory.get(key)
                        );
                    }

                    System.out.println("Total Products: " + inventory.size());
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    if (inventory.containsKey(id)) {
                        System.out.println("Product Name: " + names.get(id));
                        System.out.println("Category: " + categories.get(id));
                        System.out.println("Price: " + prices.get(id));
                        System.out.println("Quantity: " + inventory.get(id));
                    } else {
                        System.out.println("Product Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    if (inventory.containsKey(id)) {
                        System.out.print("Enter New Quantity: ");
                        qty = sc.nextInt();

                        if (qty >= 0) {
                            inventory.put(id, qty);
                            System.out.println("Quantity Updated Successfully!");
                        } else {
                            System.out.println("Quantity Cannot Be Negative!");
                        }
                    } else {
                        System.out.println("Product Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    if (inventory.containsKey(id)) {
                        System.out.print("Enter Quantity Sold: ");
                        qty = sc.nextInt();

                        int available = inventory.get(id);

                        if (qty > 0 && qty <= available) {
                            inventory.put(id, available - qty);

                            System.out.println("Sale Completed Successfully!");
                            System.out.println("Product: " + names.get(id));
                            System.out.println("Remaining Quantity: " +
                                inventory.get(id));
                        } else {
                            System.out.println("Insufficient Stock or Invalid Quantity!");
                        }
                    } else {
                        System.out.println("Product Not Found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    if (inventory.containsKey(id)) {
                        String removedName = names.get(id);
                        String removedCategory = categories.get(id);

                        inventory.remove(id);
                        names.remove(id);
                        categories.remove(id);
                        prices.remove(id);

                        // Remove name only if no other product uses it
                        if (!names.containsValue(removedName)) {
                            recentProducts.remove(removedName);
                        }

                        // Remove category only if no other product uses it
                        if (!categories.containsValue(removedCategory)) {
                            categorySet.remove(removedCategory);
                        }

                        System.out.println("Product Removed Successfully!");
                    } else {
                        System.out.println("Product Not Found!");
                    }
                    break;

                case 7:
                    System.out.print("Enter Category: ");
                    category = sc.nextLine();

                    if (categorySet.add(category)) {
                        System.out.println("Category Added Successfully!");
                    } else {
                        System.out.println("Category Already Exists!");
                    }
                    break;

                case 8:
                    System.out.println("\nProduct Categories:");

                    for (String c : categorySet) {
                        System.out.println(c);
                    }

                    System.out.println("Total Unique Categories: " +
                        categorySet.size());
                    break;

                case 9:
                    TreeSet<String> sortedCategories =
                        new TreeSet<>(categorySet);

                    System.out.println("\nSorted Categories: " + sortedCategories);
                    System.out.println("First Category: " + sortedCategories.first());
                    System.out.println("Last Category: " + sortedCategories.last());
                    System.out.println("Descending Order: " +
                        sortedCategories.descendingSet());
                    break;

                case 10:
                    System.out.println("\nRecently Added Products:");

                    for (String p : recentProducts) {
                        System.out.println(p);
                    }

                    System.out.print("Search Product Name: ");
                    name = sc.nextLine();

                    if (recentProducts.contains(name)) {
                        System.out.println("Product Found!");
                    } else {
                        System.out.println("Product Not Found!");
                    }
                    break;

                case 11:
                    int total = 0;
                    int max = -1;
                    String highestProduct = "";

                    System.out.println("\nInventory Report:");

                    for (int key : inventory.keySet()) {
                        int quantity = inventory.get(key);

                        System.out.println(
                            names.get(key) + " : " + quantity
                        );

                        total += quantity;

                        if (quantity < 5) {
                            System.out.println("Low Stock: " + names.get(key));
                        }

                        if (quantity > max) {
                            max = quantity;
                            highestProduct = names.get(key);
                        }
                    }

                    System.out.println("Total Units Available: " + total);

                    if (max >= 0) {
                        System.out.println("Highest Stock Product: " +
                            highestProduct + " - " + max);
                    } else {
                        System.out.println("No Products Available!");
                    }

                    System.out.println("Unique Categories: " + categorySet);
                    System.out.println("Total Categories: " + categorySet.size());
                    break;

                case 12:
                    System.out.println("Exiting Inventory System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 12);

        sc.close();
    }
}