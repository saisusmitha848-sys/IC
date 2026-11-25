import java.util.ArrayList;

class MainArrayList{

    public static void main(String[]args){
         ArrayList <Integer> num = new ArrayList<>(); //ArrayList

         num.add(10); //Adding elements into array list

         System.out.println(num.get(0)); //printing element at particular index

         num.remove(0); //removing element at particular index

         System.out.println(num); //printing ArrayList
    }
}