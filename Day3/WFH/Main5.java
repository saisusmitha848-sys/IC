class EmployeeSalary {

    void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException(
                "Salary must be greater than zero"
            );
        }

        System.out.println("Employee Salary: ₹" + salary);
    }
}

public class Main5 {
    public static void main(String[] args) {

        EmployeeSalary emp = new EmployeeSalary();

        try {
            emp.setSalary(25000);
            emp.setSalary(50000);
            emp.setSalary(0);
            emp.setSalary(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}