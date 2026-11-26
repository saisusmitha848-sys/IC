import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> results = new TreeMap<>();

        
        results.put(101, 85);
        results.put(102, 92);
        results.put(103, 76);
        results.put(104, 88);
        results.put(105, 95);

       
        results.put(103, 80);

       
        System.out.println("All Student Results:");
        results.forEach((roll, marks) ->
            System.out.println(roll + " : " + marks));

       
        System.out.println("Highest Marks: " +
            Collections.max(results.values()));
        System.out.println("Lowest Marks: " +
            Collections.min(results.values()));

       
        System.out.println("Marks of 102: " + results.get(102));

        
        System.out.println("Results from 102 to 104:");
        System.out.println(results.subMap(102, true, 104, true));

   
        System.out.println("Reverse Order:");
        System.out.println(results.descendingMap());

    
        System.out.println("First Entry: " + results.firstEntry());
        System.out.println("Last Entry: " + results.lastEntry());
    }
}
