import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAttendanceManagement {

    public static void main(String[] args) {

        
        ArrayList<String> employees = new ArrayList<>();

     
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Suresh");
        employees.add("Anjali");
        employees.add("Kiran");
        employees.add("Sneha");
        employees.add("Arjun");
        employees.add("Divya");
        employees.add("Ravi");
        employees.add("Bhavitha");

   
        System.out.println("Employee Attendance List:");

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

     
        employees.add("Meghana");
        employees.add("Vijay");

        System.out.println("\nAfter Adding New Employees:");
        System.out.println(employees);

       
        employees.remove("Suresh");
        employees.remove("Ravi");

        System.out.println("\nAfter Removing Absent Employees:");
        System.out.println(employees);

       
        String searchEmployee = "Priya";

        if (employees.contains(searchEmployee)) {
            System.out.println("\n" + searchEmployee + " is present.");
        } else {
            System.out.println("\n" + searchEmployee + " is absent.");
        }

       
        System.out.println("\nTotal Present Employees: " + employees.size());

      
        System.out.println("\nEmployees in Reverse Order:");

        for (int i = employees.size() - 1; i >= 0; i--) {
            System.out.println(employees.get(i));
        }
    }
}