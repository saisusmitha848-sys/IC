import java.util.Scanner;
import java.util.InputMismatchException;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks for Subject 1: ");
            int mark1 = sc.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            int mark2 = sc.nextInt();

            System.out.print("Enter marks for Subject 3: ");
            int mark3 = sc.nextInt();

            int total = mark1 + mark2 + mark3;
            double average = total / 3.0;

            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric marks only");
        }

        sc.close();
    }
}