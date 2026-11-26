import java.util.HashSet;

public class UniqueStudentRegistration {

    public static void main(String[] args) {

        
        HashSet<Integer> studentIds = new HashSet<>();

       
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(104);
        studentIds.add(105);
        studentIds.add(106);
        studentIds.add(107);
        studentIds.add(108);
        studentIds.add(109);
        studentIds.add(110);

   
        studentIds.add(103);
        studentIds.add(105);

        System.out.println("After Adding Duplicate IDs:");
        System.out.println(studentIds);

       
        studentIds.add(111);

        System.out.println("\nAfter Adding New Student ID:");
        System.out.println(studentIds);

     
        studentIds.remove(105);

        System.out.println("\nAfter Removing Student ID 105:");
        System.out.println(studentIds);

     
        int searchId = 103;

        if (studentIds.contains(searchId)) {
            System.out.println("\nStudent ID " + searchId + " is registered.");
        } else {
            System.out.println("\nStudent ID " + searchId + " is not registered.");
        }

     
        System.out.println("\nAll Registered Student IDs:");

        for (int id : studentIds) {
            System.out.println(id);
        }

        
        System.out.println("\nTotal Unique Registrations: " + studentIds.size());
    }
}
