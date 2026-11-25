class StudentProfile {
    String studentName;

    StudentProfile(String studentName) {
        this.studentName = studentName;
    }

    void displayNameLength() {
        try {
            System.out.println("Name length: " + studentName.length());
        } catch (NullPointerException e) {
            System.out.println("Student name is not available");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {

        StudentProfile s1 = new StudentProfile(null);
        s1.displayNameLength();

        StudentProfile s2 = new StudentProfile("Rahul");
        s2.displayNameLength();
    }
}
