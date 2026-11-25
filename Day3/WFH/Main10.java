import java.util.Scanner;

class StudentRegistration {
    String studentName;
    int age;
    String marks;
    String[] subjects;

    StudentRegistration(String studentName, int age, String marks,
                       String[] subjects) {
        this.studentName = studentName;
        this.age = age;
        this.marks = marks;
        this.subjects = subjects;
    }

    void register(int position) {
        try {
            
            if (studentName == null) {
                throw new NullPointerException();
            }

            System.out.println("Student Name Length: "
                    + studentName.length());

            
            int studentMarks = Integer.parseInt(marks);
            System.out.println("Student Marks: " + studentMarks);

           
            if (age <= 0) {
                throw new IllegalArgumentException(
                        "Age must be greater than zero");
            }

          
            System.out.println("Selected Subject: "
                    + subjects[position]);

            System.out.println("Student Registration Completed");

        } catch (NullPointerException e) {
            System.out.println("Student name is not available");

        } catch (NumberFormatException e) {
            System.out.println("Invalid marks format");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid subject position");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subjects = {"Java", "Python", "HTML"};

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter marks: ");
        String marks = sc.nextLine();

        System.out.println("Available Subjects:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(i + ": " + subjects[i]);
        }

        System.out.print("Enter subject position: ");
        int position = sc.nextInt();

        StudentRegistration student =
                new StudentRegistration(name, age, marks, subjects);

        student.register(position);

        sc.close();
    }
}