import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        TreeSet<String> skills = new TreeSet<>();

       
        skills.add("Java");
        skills.add("Python");
        skills.add("React");
        skills.add("SQL");
        skills.add("MongoDB");

       
        skills.add("Java");

       
        skills.add("HTML");

        skills.remove("SQL");

        
        String search = "Python";
        System.out.println("Skill Found: " + skills.contains(search));

       
        System.out.println("Skills: " + skills);

       
        System.out.println("First Skill: " + skills.first());
        System.out.println("Last Skill: " + skills.last());

       
        System.out.println("Descending Order: " + skills.descendingSet());
    }
}