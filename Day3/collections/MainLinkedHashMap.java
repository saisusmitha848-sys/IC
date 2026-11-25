import java.util.LinkedHashMap;

class MainLinkedHashMap{
    public static void main(String[]args){
        LinkedHashMap <Integer , String> students = new LinkedHashMap<>();
          
          students.put(101, "Sai");
          students.put(102, "Sandy");
          students.put(103, "Sruthi");

          System.out.println(students);

          System.out.println("student 101: " + students.get(101));

          students.put(102, "Sanjay");

          students.remove(103);

          System.out.println("Updated Map: " + students);
    }
}
    


