import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        HashMap<Integer, Double> employees = new HashMap<>();

        int choice;

        do {
            System.out.println("\n--- Employee Salary Management ---");
            System.out.println("1. Add employee salary");
            System.out.println("2. Update employee salary");
            System.out.println("3. Search employee salary");
            System.out.println("4. Display all employees");
            System.out.println("5. Find employee with highest salary");
            System.out.println("6. Calculate total salary expenditure");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter employee ID: ");
                    int employeeId = sc.nextInt();

                    if (employees.containsKey(employeeId)) {
                        System.out.println("Employee ID already exists. Use Update to change salary.");
                    } else {
                        System.out.print("Enter salary: ");
                        double salary = sc.nextDouble();

                        if (salary >= 0) {
                            employees.put(employeeId, salary);
                            System.out.println("Employee salary added successfully.");
                        } else {
                            System.out.println("Salary cannot be negative.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter employee ID to update: ");
                    int updateId = sc.nextInt();

                    if (employees.containsKey(updateId)) {
                        System.out.print("Enter new salary: ");
                        double newSalary = sc.nextDouble();

                        if (newSalary >= 0) {
                            employees.replace(updateId, newSalary);
                            System.out.println("Salary updated successfully.");
                        } else {
                            System.out.println("Salary cannot be negative.");
                        }
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = sc.nextInt();

                    if (employees.containsKey(searchId)) {
                        System.out.println(
                            "Employee ID: " + searchId +
                            ", Salary: " + employees.get(searchId)
                        );
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 4:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records available.");
                    } else {
                        System.out.println("Employee ID - Salary");

                        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {
                            System.out.println(
                                entry.getKey() + " - " + entry.getValue()
                            );
                        }
                    }
                    break;

                case 5:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records available.");
                    } else {
                        int highestPaidId = 0;
                        double highestSalary = -1;

                        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {
                            if (entry.getValue() > highestSalary) {
                                highestSalary = entry.getValue();
                                highestPaidId = entry.getKey();
                            }
                        }

                        System.out.println("Employee with highest salary:");
                        System.out.println("Employee ID: " + highestPaidId);
                        System.out.println("Salary: " + highestSalary);
                    }
                    break;

                case 6:
                    double totalSalary = 0;

                    for (double salary : employees.values()) {
                        totalSalary += salary;
                    }

                    System.out.println("Total salary expenditure: " + totalSalary);
                    break;

                case 7:
                    System.out.println("Exiting Employee Salary Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}