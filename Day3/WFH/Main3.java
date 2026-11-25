import java.util.Scanner;

class TicketBooking {
    String passengerName = "Rahul";

    void displayCharacter(int position) {
        try {
            System.out.println("Character at position " + position + ": "
                    + passengerName.charAt(position));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid character position");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TicketBooking ticket = new TicketBooking();

        System.out.print("Enter character position: ");
        int position = sc.nextInt();

        ticket.displayCharacter(position);

        sc.close();
    }
}
