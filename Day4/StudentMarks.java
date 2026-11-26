import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        HashMap<String, Integer> students = new HashMap<>();

        int choice;

        do {
            System.out.println("\n--- Student Marks Management ---");
            System.out.println("1. Add student");
            System.out.println("2. Update student marks");
            System.out.println("3. Search student marks");
            System.out.println("4. Remove student");
            System.out.println("5. Display all students");
            System.out.println("6. Calculate average marks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("Student name cannot be empty.");
                        break;
                    }

                    if (students.containsKey(name)) {
                        System.out.println("Student already exists. Use Update to change marks.");
                    } else {
                        System.out.print("Enter marks (0-100): ");
                        int marks = sc.nextInt();
                        sc.nextLine();

                        if (marks >= 0 && marks <= 100) {
                            students.put(name, marks);
                            System.out.println("Student record added successfully.");
                        } else {
                            System.out.println("Invalid marks. Enter marks between 0 and 100.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter student name to update: ");
                    String updateName = sc.nextLine().trim();

                    if (students.containsKey(updateName)) {
                        System.out.print("Enter new marks (0-100): ");
                        int newMarks = sc.nextInt();
                        sc.nextLine();

                        if (newMarks >= 0 && newMarks <= 100) {
                            students.put(updateName, newMarks);
                            System.out.println("Marks updated successfully.");
                        } else {
                            System.out.println("Invalid marks. Enter marks between 0 and 100.");
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine().trim();

                    if (students.containsKey(searchName)) {
                        System.out.println(searchName + "'s marks: " + students.get(searchName));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to remove: ");
                    String removeName = sc.nextLine().trim();

                    if (students.containsKey(removeName)) {
                        students.remove(removeName);
                        System.out.println("Student record removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    if (students.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        System.out.println("Student Name - Marks");
                        for (String studentName : students.keySet()) {
                            System.out.println(studentName + " - " + students.get(studentName));
                        }
                    }
                    break;

                case 6:
                    if (students.isEmpty()) {
                        System.out.println("No student records available to calculate average.");
                    } else {
                        int total = 0;

                        for (int mark : students.values()) {
                            total += mark;
                        }

                        double average = (double) total / students.size();
                        System.out.printf("Average marks: %.2f%n", average);
                    }
                    break;

                case 7:
                    System.out.println("Exiting Student Marks Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}