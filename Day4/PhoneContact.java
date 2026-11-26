import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneContact {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        HashMap<String, String> contacts = new HashMap<>();

        int choice;

        do {
            System.out.println("\n--- Phone Contact Directory ---");
            System.out.println("1. Add new contact");
            System.out.println("2. Update phone number");
            System.out.println("3. Search contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Display all contacts");
            System.out.println("6. Check whether phone number is saved");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter contact name: ");
                    String name = sc.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("Contact name cannot be empty.");
                        break;
                    }

                    if (contacts.containsKey(name)) {
                        System.out.println("Contact already exists. Use Update to change the number.");
                    } else {
                        System.out.print("Enter phone number: ");
                        String phone = sc.nextLine().trim();

                        if (phone.isEmpty()) {
                            System.out.println("Phone number cannot be empty.");
                        } else if (contacts.containsValue(phone)) {
                            System.out.println("This phone number is already saved.");
                        } else {
                            contacts.put(name, phone);
                            System.out.println("Contact added successfully.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter contact name to update: ");
                    String updateName = sc.nextLine().trim();

                    if (contacts.containsKey(updateName)) {
                        System.out.print("Enter new phone number: ");
                        String newPhone = sc.nextLine().trim();

                        if (newPhone.isEmpty()) {
                            System.out.println("Phone number cannot be empty.");
                        } else if (contacts.containsValue(newPhone)
                                && !contacts.get(updateName).equals(newPhone)) {
                            System.out.println("This phone number is already saved for another contact.");
                        } else {
                            contacts.put(updateName, newPhone);
                            System.out.println("Phone number updated successfully.");
                        }
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter contact name to search: ");
                    String searchName = sc.nextLine().trim();

                    if (contacts.containsKey(searchName)) {
                        System.out.println(
                            "Name: " + searchName +
                            ", Phone: " + contacts.get(searchName)
                        );
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter contact name to delete: ");
                    String deleteName = sc.nextLine().trim();

                    if (contacts.containsKey(deleteName)) {
                        contacts.remove(deleteName);
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        System.out.println("Contact Name - Phone Number");

                        for (Map.Entry<String, String> entry : contacts.entrySet()) {
                            System.out.println(
                                entry.getKey() + " - " + entry.getValue()
                            );
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter phone number to check: ");
                    String checkPhone = sc.nextLine().trim();

                    if (contacts.containsValue(checkPhone)) {
                        System.out.println("Phone number is already saved.");
                    } else {
                        System.out.println("Phone number is not saved.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting Phone Contact Directory.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
