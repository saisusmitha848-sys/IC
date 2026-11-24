
class Employee {
    int id;
    String name;
    String department;

    
    Employee(int id, String name) {
        this(id, name, "General");
    }

 
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    
    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class Main11 {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Sai");
        Employee e2 = new Employee(102, "Rahul", "IT");

        e1.displayEmployee();
        e2.displayEmployee();
    }
}
