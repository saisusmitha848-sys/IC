import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

       
        queue.addLast("Rahul");
        queue.addLast("Priya");
        queue.addLast("Ravi");

       
        queue.addFirst("Emergency Customer");

      
        System.out.println("Waiting Customers: " + queue);

       
        System.out.println("Next Customer: " + queue.peek());

       
        queue.remove("Ravi");
        System.out.println("After Removing Ravi: " + queue);

       
        System.out.println("Total Customers: " + queue.size());

       
        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }

        System.out.println("Queue Empty: " + queue.isEmpty());
    }
}
