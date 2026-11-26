import java.util.LinkedHashSet;
import java.util.Scanner;

public class RecentlyAddedContacts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        LinkedHashSet<String> contacts = new LinkedHashSet<>();

        int choice;

        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Search contact");
            System.out.println("4. Display all contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter contact name to add: ");
                    String newContact = sc.nextLine().trim();

                    if (newContact.isEmpty()) {
                        System.out.println("Contact name cannot be empty.");
                    } else if (contacts.add(newContact)) {
                        System.out.println("Contact added successfully.");
                    } else {
                        System.out.println("Contact already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter contact name to remove: ");
                    String removeContact = sc.nextLine().trim();

                    if (contacts.remove(removeContact)) {
                        System.out.println("Contact removed successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter contact name to search: ");
                    String searchContact = sc.nextLine().trim();

                    if (contacts.contains(searchContact)) {
                        System.out.println("Contact found.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        System.out.println("Contacts in the order they were added:");
                        for (String contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
