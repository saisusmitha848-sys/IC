import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> employees = new TreeMap<>();

        
        employees.put(101, "HR");
        employees.put(102, "IT");
        employees.put(103, "Finance");
        employees.put(104, "Marketing");
        employees.put(105, "Sales");

       
        employees.put(102, "Development");

        
        System.out.print("Enter Employee ID to Search: ");
        int id = sc.nextInt();

        if (employees.containsKey(id))
            System.out.println("Department: " + employees.get(id));
        else
            System.out.println("Employee Not Found!");

       
        employees.remove(105);

       
        System.out.println("Employees in Ascending Order:");
        System.out.println(employees);

        
        System.out.println("Employees in Descending Order:");
        System.out.println(employees.descendingMap());

        
        System.out.println("First Employee ID: " + employees.firstKey());
        System.out.println("Last Employee ID: " + employees.lastKey());

        
        System.out.print("Enter Starting ID: ");
        int start = sc.nextInt();

        System.out.print("Enter Ending ID: ");
        int end = sc.nextInt();

        System.out.println("Employees in Given Range:");
        System.out.println(employees.subMap(start, true, end, true));

        sc.close();
    }
}
