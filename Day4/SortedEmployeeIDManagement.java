import java.util.TreeSet;

public class SortedEmployeeIDManagement {

    public static void main(String[] args) {

       
        TreeSet<Integer> employeeIds = new TreeSet<>();

        
        employeeIds.add(105);
        employeeIds.add(102);
        employeeIds.add(108);
        employeeIds.add(101);
        employeeIds.add(110);
        employeeIds.add(104);
        employeeIds.add(106);
        employeeIds.add(103);
        employeeIds.add(109);
        employeeIds.add(107);

     
        System.out.println("Employee IDs in Ascending Order:");
        System.out.println(employeeIds);

      
        employeeIds.add(112);

        System.out.println("\nAfter Adding Employee ID 112:");
        System.out.println(employeeIds);

      
        employeeIds.remove(106);

        System.out.println("\nAfter Removing Employee ID 106:");
        System.out.println(employeeIds);

        
        System.out.println("\nSmallest Employee ID: " + employeeIds.first());
        System.out.println("Largest Employee ID: " + employeeIds.last());

       
        int searchId = 105;

        System.out.println("\nSearching for Employee ID: " + searchId);

        System.out.println("Next Higher ID: " + employeeIds.higher(searchId));
        System.out.println("Next Lower ID: " + employeeIds.lower(searchId));

       
        int startId = 103;
        int endId = 109;

        System.out.println("\nEmployee IDs from " + startId + " to " + endId + ":");
        System.out.println(employeeIds.subSet(startId, true, endId, true));

       
        System.out.println("\nEmployee IDs below 105:");
        System.out.println(employeeIds.headSet(105));

        
        System.out.println("\nEmployee IDs from 105 onwards:");
        System.out.println(employeeIds.tailSet(105));
    }
}
