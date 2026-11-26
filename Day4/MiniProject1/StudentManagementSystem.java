import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagementSystem {

    
    static ArrayList<Integer> studentIds = new ArrayList<>();
    static ArrayList<String> studentNames = new ArrayList<>();
    static ArrayList<Integer> studentMarks = new ArrayList<>();

  
    static LinkedList<String> attendance = new LinkedList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Remove Student");
            System.out.println("6. Add Student Attendance");
            System.out.println("7. Display Attendance");
            System.out.println("8. Remove Attendance");
            System.out.println("9. Display Student Statistics");
            System.out.println("10. Sort Student Names");
            System.out.println("11. Exit");

            choice = readInt("Enter Your Choice: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudentMarks();
                    break;

                case 5:
                    removeStudent();
                    break;

                case 6:
                    addAttendance();
                    break;

                case 7:
                    displayAttendance();
                    break;

                case 8:
                    removeAttendance();
                    break;

                case 9:
                    displayStatistics();
                    break;

                case 10:
                    sortStudentNames();
                    break;

                case 11:
                    System.out.println("Exiting Student Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 11);

        sc.close();
    }

   
    static int readInt(String message) {

        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    
    static int readMarks(String message) {

        while (true) {
            int marks = readInt(message);

            if (marks >= 0 && marks <= 100) {
                return marks;
            }

            System.out.println("Marks must be between 0 and 100.");
        }
    }

   
    static int findStudentIndex(String name) {
        return studentNames.indexOf(name);
    }

  
    static void addStudent() {

        System.out.println("\n--------- ADD STUDENT ---------");

        int id = readInt("Enter Student ID: ");

       
        if (studentIds.contains(id)) {
            System.out.println("Student ID already exists.");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Student name cannot be empty.");
            return;
        }

        int marks = readMarks("Enter Student Marks: ");

     
        studentIds.add(id);
        studentNames.add(name);
        studentMarks.add(marks);

        System.out.println("\nStudent Added Successfully!");
    }

   
    static void displayStudents() {

        System.out.println("\n--------- STUDENT RECORDS ---------");

        if (studentNames.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.printf("%-12s %-20s %-10s%n",
                "Student ID", "Student Name", "Marks");

        for (int i = 0; i < studentNames.size(); i++) {

            System.out.printf("%-12d %-20s %-10d%n",
                    studentIds.get(i),
                    studentNames.get(i),
                    studentMarks.get(i));
        }

        System.out.println("\nTotal Students: " + studentNames.size());
    }

    
    static void searchStudent() {

        System.out.println("\n--------- SEARCH STUDENT ---------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

        int index = findStudentIndex(name);

        if (index != -1) {

            System.out.println("\nStudent Found!");

            System.out.println("Student ID: " + studentIds.get(index));
            System.out.println("Name: " + studentNames.get(index));
            System.out.println("Marks: " + studentMarks.get(index));

        } else {
            System.out.println("Student not found.");
        }
    }

    
    static void updateStudentMarks() {

        System.out.println("\n--------- UPDATE STUDENT MARKS ---------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

        int index = findStudentIndex(name);

        if (index != -1) {

            int newMarks = readMarks("Enter New Marks: ");

            studentMarks.set(index, newMarks);

            System.out.println("\nStudent Marks Updated Successfully!");

            System.out.println("Name: " + studentNames.get(index));
            System.out.println("Updated Marks: " + studentMarks.get(index));

        } else {
            System.out.println("Student not found.");
        }
    }

   
    static void removeStudent() {

        System.out.println("\n--------- REMOVE STUDENT ---------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

        int index = findStudentIndex(name);

        if (index != -1) {

          
            studentIds.remove(index);
            studentNames.remove(index);
            studentMarks.remove(index);

         
            attendance.remove(name);

            System.out.println("Student Removed Successfully!");

        } else {
            System.out.println("Student not found.");
        }
    }

   
    static void addAttendance() {

        System.out.println("\n--------- ADD ATTENDANCE ---------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

      
        if (!studentNames.contains(name)) {
            System.out.println("Student is not registered.");
            return;
        }

        
        if (attendance.contains(name)) {
            System.out.println("Student attendance already marked.");
            return;
        }

        System.out.println("1. Add at Beginning");
        System.out.println("2. Add at End");

        int position = readInt("Enter Your Choice: ");

        if (position == 1) {

            attendance.addFirst(name);
            System.out.println("Attendance Added at Beginning.");

        } else if (position == 2) {

            attendance.addLast(name);
            System.out.println("Attendance Added at End.");

        } else {

            System.out.println("Invalid position.");
        }
    }

   
    static void displayAttendance() {

        System.out.println("\n--------- ATTENDANCE LIST ---------");

        if (attendance.isEmpty()) {
            System.out.println("No students are present.");
            return;
        }

        for (int i = 0; i < attendance.size(); i++) {
            System.out.println((i + 1) + ". " + attendance.get(i));
        }

        System.out.println("\nTotal Present Students: " + attendance.size());
    }

    
    static void removeAttendance() {

        System.out.println("\n--------- REMOVE ATTENDANCE ---------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

        if (attendance.contains(name)) {

            attendance.remove(name);

            System.out.println("Attendance Removed Successfully!");

        } else {
            System.out.println("Student is not present in the attendance list.");
        }
    }

  
    static void displayStatistics() {

        System.out.println("\n--------- STUDENT STATISTICS ---------");

        if (studentMarks.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        int highestMarks = Collections.max(studentMarks);
        int lowestMarks = Collections.min(studentMarks);

        int totalMarks = 0;
        int above75 = 0;

        for (int marks : studentMarks) {

            totalMarks += marks;

            if (marks > 75) {
                above75++;
            }
        }

        double averageMarks = (double) totalMarks / studentMarks.size();

        System.out.println("Total Students: " + studentNames.size());

        System.out.println("Highest Marks: " + highestMarks);

        System.out.println("Lowest Marks: " + lowestMarks);

        System.out.printf("Average Marks: %.2f%n", averageMarks);

        System.out.println("Students Above 75: " + above75);
    }

    
    static void sortStudentNames() {

        System.out.println("\n--------- SORT STUDENT NAMES ---------");

        if (studentNames.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

       
        ArrayList<String> sortedNames = new ArrayList<>(studentNames);

       
        Collections.sort(sortedNames);

        System.out.println("\nStudent Names in Alphabetical Order:");

        for (String name : sortedNames) {
            System.out.println(name);
        }

       
        Collections.reverse(sortedNames);

        System.out.println("\nStudent Names in Reverse Order:");

        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}