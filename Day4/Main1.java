import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> orders = new LinkedHashMap<>();


        orders.put(101, "Rahul");
        orders.put(102, "Priya");
        orders.put(103, "Ravi");

       
        orders.put(102, "Sneha");

      
        orders.remove(103);

       
        int id = 101;
        if (orders.containsKey(id))
            System.out.println("Order Found: " + orders.get(id));
        else
            System.out.println("Order Not Found");

       
        System.out.println("All Orders:");
        orders.forEach((orderId, customer) ->
            System.out.println(orderId + " : " + customer));
    }
}
