import java.util.Scanner;
import java.util.TreeSet;

public class ExamScoreRanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        TreeSet<Integer> scores = new TreeSet<>();

     
        scores.add(85);
        scores.add(92);
        scores.add(76);
        scores.add(85); 
        scores.add(68);
        scores.add(90);

        System.out.println("Unique scores in ascending order: " + scores);

    
        System.out.println("Lowest score: " + scores.first());
        System.out.println("Highest score: " + scores.last());

      
        System.out.print("Enter a score to find the next higher score: ");
        int givenScore = sc.nextInt();

        Integer higherScore = scores.higher(givenScore);

        if (higherScore != null) {
            System.out.println("Immediately higher score: " + higherScore);
        } else {
            System.out.println("No higher score exists.");
        }

      
        System.out.print("Enter a score to find the next lower score: ");
        givenScore = sc.nextInt();

        Integer lowerScore = scores.lower(givenScore);

        if (lowerScore != null) {
            System.out.println("Immediately lower score: " + lowerScore);
        } else {
            System.out.println("No lower score exists.");
        }

        
        System.out.println("Scores in descending order: " + scores.descendingSet());

        sc.close();
    }
}
