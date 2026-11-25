import java.util.Scanner;

class AppointmentBooking {
    String patientName = "Rahul";
    int age = 25;
    String appointmentTime = "10:30 AM";

    String[] availableSlots = {
        "09:00 AM", "10:30 AM", "12:00 PM"
    };

    void bookAppointment(int position) {
        try {
         
            if (patientName == null) {
                throw new NullPointerException();
            }

            System.out.println("Patient Name Length: "
                    + patientName.length());

            
            if (age <= 0) {
                throw new IllegalArgumentException(
                        "Age must be greater than zero");
            }

           
            System.out.println("Selected Appointment Slot: "
                    + availableSlots[position]);

            System.out.println("Appointment Booked Successfully");

        } catch (NullPointerException e) {
            System.out.println("Missing patient information");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid appointment slot");

        } finally {
            System.out.println(
                    "Appointment Booking Process Completed");
        }
    }
}

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AppointmentBooking appointment =
                new AppointmentBooking();

        System.out.println("Available Appointment Slots:");
        System.out.println("0: 09:00 AM");
        System.out.println("1: 10:30 AM");
        System.out.println("2: 12:00 PM");

        System.out.print("Enter appointment slot position: ");
        int position = sc.nextInt();

        appointment.bookAppointment(position);

        sc.close();
    }
}