import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> words = new HashMap<>();

        
        System.out.println("Enter Paragraph:");
        String text = sc.nextLine().toLowerCase();

        
        String[] arr = text.replaceAll("[^a-z0-9\\s]", "").split("\\s+");

       
        for (String word : arr) {
            if (!word.isEmpty())
                words.put(word, words.getOrDefault(word, 0) + 1);
        }

       
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> e : words.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        
        String maxWord = "";
        int max = 0;

        for (String word : words.keySet()) {
            if (words.get(word) > max) {
                max = words.get(word);
                maxWord = word;
            }
        }

        System.out.println("Most Frequent Word: " + maxWord + " : " + max);

        
        System.out.println("Unique Words: " + words.size());

        sc.close();
    }
}