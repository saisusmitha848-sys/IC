class TextConverter {
    String message = "Welcome to Java Programming";

    void display() {
       
        String upper = message.toUpperCase();

   
        String lower = message.toLowerCase();

        
        System.out.println("Original message: " + message);
        System.out.println("Uppercase message: " + upper);
        System.out.println("Lowercase message: " + lower);
    }
}

public class Main2 {
    public static void main(String[] args) {
        TextConverter t1 = new TextConverter();

        t1.display();
    }
}