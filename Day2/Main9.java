
class Student {
    String name;
    double marks;

    // Parameterized constructor
    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void showResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main9 {
    public static void main(String[] args) {

        Student s1 = new Student("Susmitha", 95.5);
        Student s2 = new Student("Bhavitha", 88.5);

        s1.showResult();
        s2.showResult();
    }
}

