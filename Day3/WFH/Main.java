class ATM {
    double balance;
    double withdrawalAmount;

    ATM(double balance, double withdrawalAmount) {
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    void withdraw() {
        try {
            int times = (int) balance / (int) withdrawalAmount;
            System.out.println("Number of times: " + times);
        } catch (ArithmeticException e) {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ATM atm1 = new ATM(10000, 1000);
        atm1.withdraw();

        ATM atm2 = new ATM(10000, 500);
        atm2.withdraw();

        ATM atm3 = new ATM(10000, 0);
        atm3.withdraw();
    }
}