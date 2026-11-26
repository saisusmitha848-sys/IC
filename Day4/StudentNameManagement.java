import java.util.ArrayList;

public class StudentNameManagement {

    public static void main(String[] args) {

        
        ArrayList<String> students = new ArrayList<>();

        
        students.add("Rahul");
        students.add("Priya");
        students.add("Suresh");
        students.add("Anjali");
        students.add("Kiran");
        students.add("Sneha");
        students.add("Arjun");
        students.add("Divya");
        students.add("Ravi");
        students.add("Bhavitha");

       
        System.out.println("All Student Names:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

      
        students.add(2, "Sushmitha");

        System.out.println("\nAfter Adding a Student:");
        System.out.println(students);

       
        students.remove("Suresh");

        System.out.println("\nAfter Removing Suresh:");
        System.out.println(students);

   
        students.set(3, "Meghana");

        System.out.println("\nAfter Updating Student at Index 3:");
        System.out.println(students);

        
        String searchName = "Priya";

        if (students.contains(searchName)) {
            System.out.println("\n" + searchName + " exists in the list.");
        } else {
            System.out.println("\n" + searchName + " does not exist in the list.");
        }

      
        System.out.println("\nTotal Number of Students: " + students.size());
    }
}