
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private String department;
    private int[] marks;

    private static final int SUBJECTS = 5;
    private static final int PASS_MARK = 35;

    
    Student(int id, String name, String department, int[] marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks.clone();
    }

    
    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

   
    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

  
    double calculateAverage() {
        return calculateTotal() / (double) SUBJECTS;
    }

    
    String calculateGrade() {
        double average = calculateAverage();

        if (average >= 90)
            return "A+";
        else if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "Fail";
    }

    
    boolean isSubjectPassed(int mark) {
        return mark >= PASS_MARK;
    }

   
    boolean isPassed() {
        for (int mark : marks) {
            if (!isSubjectPassed(mark)) {
                return false;
            }
        }

        return true;
    }

   
    void updateMarks(int[] newMarks) {
        this.marks = newMarks.clone();
    }

   
    void displayStudent() {

        System.out.println("\n--------------------------------");
        System.out.println("STUDENT REPORT");
        System.out.println("--------------------------------");

        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Department   : " + department);

        System.out.println("\nIndividual Subject Marks:");

        for (int i = 0; i < SUBJECTS; i++) {
            System.out.println(
                "Subject " + (i + 1) + " : " + marks[i]
                + " - "
                + (isSubjectPassed(marks[i]) ? "PASS" : "FAIL")
            );
        }

        System.out.println("\nTotal Marks  : " + calculateTotal());

        System.out.printf("Average      : %.2f%n", calculateAverage());

        System.out.println("Grade        : " + calculateGrade());

        System.out.println("Result       : " + (isPassed() ? "PASS" : "FAIL"));

        System.out.println("--------------------------------");
    }
}

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Student> students = new ArrayList<>();

    static final int SUBJECTS = 5;

    
    static void loadSampleStudents() {

        students.add(new Student(
            101, "Rahul", "CSE",
            new int[]{85, 90, 80, 75, 95}
        ));

        students.add(new Student(
            102, "Priya", "ECE",
            new int[]{90, 92, 88, 85, 95}
        ));

        students.add(new Student(
            103, "Kiran", "CSE",
            new int[]{70, 75, 80, 65, 72}
        ));

        students.add(new Student(
            104, "Sneha", "IT",
            new int[]{95, 98, 92, 90, 96}
        ));

        students.add(new Student(
            105, "Arjun", "ECE",
            new int[]{60, 65, 70, 55, 68}
        ));
    }

    static int readInt(String message) {

        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    
    static int readMarks(String message) {

        while (true) {
            int mark = readInt(message);

            if (mark >= 0 && mark <= 100) {
                return mark;
            }

            System.out.println("Marks must be between 0 and 100!");
        }
    }

    
    static int[] enterMarks() {

        int[] marks = new int[SUBJECTS];

        for (int i = 0; i < SUBJECTS; i++) {
            marks[i] = readMarks(
                "Enter Subject " + (i + 1) + " Marks: "
            );
        }

        return marks;
    }

    
    static Student findStudent(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

   
    static void addStudent() {

        System.out.println("\n===== ADD STUDENT =====");

        int id = readInt("Enter Student ID: ");

        if (findStudent(id) != null) {
            System.out.println("Student ID already exists!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter Department: ");
        String department = sc.nextLine().trim();

        if (name.isEmpty() || department.isEmpty()) {
            System.out.println("Name and department cannot be empty!");
            return;
        }

        int[] marks = enterMarks();

        Student student = new Student(id, name, department, marks);

        students.add(student);

        System.out.println("\nStudent added successfully!");

        student.displayStudent();
    }

   
    static void displayAllStudents() {

        System.out.println("\n===== ALL STUDENTS =====");

        if (students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }

        System.out.println("Total Students: " + students.size());

        for (Student student : students) {
            student.displayStudent();
        }
    }

    
    static void searchStudent() {

        int id = readInt("Enter Student ID to search: ");

        Student student = findStudent(id);

        if (student != null) {
            student.displayStudent();
        } else {
            System.out.println("Student not found!");
        }
    }

   
    static void updateStudentMarks() {

        int id = readInt("Enter Student ID to update marks: ");

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("Enter new marks for 5 subjects:");

        int[] newMarks = enterMarks();

        student.updateMarks(newMarks);

        System.out.println("\nMarks updated successfully!");

        student.displayStudent();
    }

    static void deleteStudent() {

        int id = readInt("Enter Student ID to delete: ");

        Student student = findStudent(id);

        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    
    static void displayTopper() {

        if (students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }

        Student topper = students.get(0);

        for (Student student : students) {

            if (student.calculateTotal() > topper.calculateTotal()) {
                topper = student;
            }
        }

        System.out.println("\n===== CLASS TOPPER =====");

        topper.displayStudent();
    }

    
    public static void main(String[] args) {

        
        loadSampleStudents();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Class Topper");
            System.out.println("7. Exit");

            choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudentMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    displayTopper();
                    break;

                case 7:
                    System.out.println("Thank you for using Student Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Enter 1 to 7.");
            }

        } while (choice != 7);

        sc.close();
    }
}
