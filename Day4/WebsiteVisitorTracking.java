import java.util.LinkedHashSet;
import java.util.Scanner;

public class WebsiteVisitorTracking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        LinkedHashSet<String> visitors = new LinkedHashSet<>();

        int choice;

        do {
            System.out.println("\n--- Website Visitor Tracking ---");
            System.out.println("1. Add visitor");
            System.out.println("2. Remove visitor");
            System.out.println("3. Check visitor");
            System.out.println("4. Display visitors");
            System.out.println("5. Display total unique visitors");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter visitor ID: ");
                    String visitorId = sc.nextLine().trim();

                    if (visitorId.isEmpty()) {
                        System.out.println("Visitor ID cannot be empty.");
                    } else if (visitors.add(visitorId)) {
                        System.out.println("Visitor recorded successfully.");
                    } else {
                        System.out.println("This visitor has already visited.");
                    }
                    break;

                case 2:
                    System.out.print("Enter visitor ID to remove: ");
                    String removeId = sc.nextLine().trim();

                    if (visitors.remove(removeId)) {
                        System.out.println("Visitor removed successfully.");
                    } else {
                        System.out.println("Visitor ID not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter visitor ID to check: ");
                    String searchId = sc.nextLine().trim();

                    if (visitors.contains(searchId)) {
                        System.out.println("This visitor has already visited.");
                    } else {
                        System.out.println("This visitor has not visited yet.");
                    }
                    break;

                case 4:
                    if (visitors.isEmpty()) {
                        System.out.println("No visitors recorded.");
                    } else {
                        System.out.println("Visitors in arrival order:");
                        for (String id : visitors) {
                            System.out.println(id);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total unique visitors: " + visitors.size());
                    break;

                case 6:
                    System.out.println("Exiting Visitor Tracking System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
