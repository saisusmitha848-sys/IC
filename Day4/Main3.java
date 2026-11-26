import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

       
        books.add("Java");
        books.add("Python");
        books.add("C Programming");
        books.add("Web Development");

       
        books.remove("C Programming");

       
        books.set(1, "Python Programming");

       
        String search = "Java";
        if (books.contains(search))
            System.out.println("Book Found: " + search);
        else
            System.out.println("Book Not Found");

        
        System.out.println("Available Books: " + books);

        System.out.println("Total Books: " + books.size());

       
        Collections.reverse(books);
        System.out.println("Books in Reverse Order: " + books);
    }
}