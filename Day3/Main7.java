class NameExtractor {
    String fullName = "Java Full Stack Developer";

    void extractWords() {
       
        String word1 = fullName.substring(0, 4);

     
        String word2 = fullName.substring(5, 9);

        
        String word3 = fullName.substring(10);

        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);
        System.out.println("Remaining text: " + word3);
    }
}

public class Main7 {
    public static void main(String[] args) {
        NameExtractor n1 = new NameExtractor();

        n1.extractWords();
    }
}