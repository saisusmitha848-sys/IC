public class Main6 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "sana";
        manager.employeeid = 1001;
        manager.department = "Engineering";

        manager.displayPerson();
        manager.displayEmployee();
        manager.displayManager();
    }
}

class Person {
    String name;

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeid;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeid);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }
}
