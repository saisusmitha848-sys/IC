class BankTransaction {
    int balance = 10000;

    void withdraw(String amount) {
        try {
            int withdrawalAmount = Integer.parseInt(amount);

            if (withdrawalAmount <= 0) {
                throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than zero"
                );
            }

            if (withdrawalAmount > balance) {
                throw new IllegalArgumentException(
                    "Insufficient balance"
                );
            }

            balance = balance - withdrawalAmount;

            System.out.println("Transaction successful");
            System.out.println("Remaining Balance: ₹" + balance);

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount format");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main8 {
    public static void main(String[] args) {

        BankTransaction bank = new BankTransaction();

        bank.withdraw("2000");
        bank.withdraw("15000");
        bank.withdraw("abc");
        bank.withdraw("-500");
        bank.withdraw("0");
    }
}
