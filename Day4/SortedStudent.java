import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class SortedStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> students = new TreeMap<>();
        int choice;

        do {
            System.out.println("\n1.Add  2.Update  3.Remove  4.Ascending");
            System.out.println("5.Descending  6.Range  7.First/Last  8.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    if (choice == 2 && !students.containsKey(roll)) {
                        System.out.println("Student not found.");
                        break;
                    }

                    if (choice == 1 && students.containsKey(roll)) {
                        System.out.println("Roll number already exists.");
                        break;
                    }

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine().trim();

                    if (!name.isEmpty()) {
                        students.put(roll, name);
                        System.out.println("Record saved.");
                    } else {
                        System.out.println("Name cannot be empty.");
                    }
                    break;

                case 3:
                    System.out.print("Enter roll number to remove: ");
                    if (students.remove(sc.nextInt()) != null)
                        System.out.println("Record removed.");
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    display(students);
                    break;

                case 5:
                    display(students.descendingMap());
                    break;

                case 6:
                    System.out.print("Enter start and end roll numbers: ");
                    int start = sc.nextInt();
                    int end = sc.nextInt();

                    if (start <= end)
                        display(students.subMap(start, true, end, true));
                    else
                        System.out.println("Invalid range.");
                    break;

                case 7:
                    if (students.isEmpty())
                        System.out.println("No records available.");
                    else
                        System.out.println("First: " + students.firstKey()
                                + "\nLast: " + students.lastKey());
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

    static void display(Map<Integer, String> records) {
        if (records.isEmpty()) {
            System.out.println("No records available.");
            return;
        }

        for (Map.Entry<Integer, String> entry : records.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}