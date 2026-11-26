import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        HashSet<Integer> event1 = new HashSet<>();
        HashSet<Integer> event2 = new HashSet<>();

        
        event1.add(101);
        event1.add(102);
        event1.add(103);
        event1.add(104);

       
        event2.add(102);
        event2.add(103);
        event2.add(105);

        
        event1.add(101);

       
        event1.remove(104);

       
        System.out.println("Student 101 Registered: " +
            event1.contains(101));

      
        System.out.println("Event 1 Registrations: " + event1);
        System.out.println("Event 2 Registrations: " + event2);

        
        System.out.println("Event 1 Total: " + event1.size());
        System.out.println("Event 2 Total: " + event2.size());

      
        HashSet<Integer> both = new HashSet<>(event1);
        both.retainAll(event2);

        System.out.println("Registered for Both Events: " + both);

        
        HashSet<Integer> all = new HashSet<>(event1);
        all.addAll(event2);

        System.out.println("Total Unique Students: " + all.size());
    }
}