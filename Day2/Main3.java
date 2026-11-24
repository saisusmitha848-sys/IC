
abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void showName() {
        System.out.println("Employee: " + name);
    }
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    void calculateSalary() {
        System.out.println("Monthly Salary: ₹" + monthlySalary);
    }
}
class Main3 {
    public static void main(String[] args) {
        FullTimeEmployee emp =
            new FullTimeEmployee("Sai", 30000);

        emp.showName();
        emp.calculateSalary();
    }
}
