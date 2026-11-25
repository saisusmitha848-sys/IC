import java.util.Scanner;

class OnlinePayment {
    String paymentAmount;

    OnlinePayment(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    void convertAmount() {
        try {
            double amount = Double.parseDouble(paymentAmount);
            System.out.println("Payment Amount: " + amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid payment amount");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        String amount = sc.nextLine();

        OnlinePayment payment = new OnlinePayment(amount);
        payment.convertAmount();

        sc.close();
    }
}
