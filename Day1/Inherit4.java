class Employee {
    String name;
    double baseSalary;

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Tester extends Employee {
    String testingTool;

    void runTests() {
        System.out.println("Testing Tool: " + testingTool);
    }
}

class Inherit4 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Sai";
        d.baseSalary = 30000;
        d.programmingLanguage = "Java";

        Tester t = new Tester();
        t.name = "Archana";
        t.baseSalary = 25000;
        t.testingTool = "Selenium";

        System.out.println("--- Developer Details ---");
        d.displayBasicInfo();
        d.writeCode();

        System.out.println("\n--- Tester Details ---");
        t.displayBasicInfo();
        t.runTests();
    }
}
