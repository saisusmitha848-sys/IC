class Manager {
}

class Developer {
}

public class Main6 {
    public static void main(String[] args) {

       
        Object obj1 = new Developer();

        try {
            Manager m1 = (Manager) obj1;
            System.out.println("Manager object created successfully");
        } catch (ClassCastException e) {
            System.out.println("Invalid Employee Role Conversion");
        }

        
        Object obj2 = new Manager();

        try {
            Manager m2 = (Manager) obj2;
            System.out.println("Manager object created successfully");
        } catch (ClassCastException e) {
            System.out.println("Invalid Employee Role Conversion");
        }
    }
}