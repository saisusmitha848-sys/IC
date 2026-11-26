import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        TreeSet<Integer> marksSet = new TreeSet<>();

       
        students.put("Rahul", 85);
        students.put("Priya", 92);
        students.put("Ravi", 76);
        students.put("Sneha", 92);
        students.put("Arun", 65);

       
        marksSet.addAll(students.values());

        
        System.out.println("Student Results:");
        for (Map.Entry<String, Integer> e : students.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

       
        System.out.println("Highest Marks: " + marksSet.last());
        System.out.println("Lowest Marks: " + marksSet.first());

     
        System.out.println("Unique Marks: " + marksSet);

       
        System.out.println("Students Scoring Above 80:");
        for (Map.Entry<String, Integer> e : students.entrySet()) {
            if (e.getValue() > 80) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }

        
        int total = 0;
        for (int mark : students.values()) {
            total += mark;
        }

        double average = (double) total / students.size();
        System.out.println("Class Average: " + average);

       
        int highest = marksSet.last();
        System.out.println("Top Performing Student(s):");

        for (Map.Entry<String, Integer> e : students.entrySet()) {
            if (e.getValue() == highest) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }

        
        int pass = 0, fail = 0;

        for (int mark : students.values()) {
            if (mark >= 35)
                pass++;
            else
                fail++;
        }

        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);
    }
}
