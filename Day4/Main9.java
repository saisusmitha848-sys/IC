import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Double> accounts = new HashMap<>();

        int choice;

        do {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Total Balance");
            System.out.println("7. Close Account");
            System.out.println("8. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            int acc;
            double amount;

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    if (accounts.containsKey(acc)) {
                        System.out.println("Account Already Exists!");
                    } else {
                        System.out.print("Enter Initial Balance: ");
                        amount = sc.nextDouble();

                        if (amount >= 0) {
                            accounts.put(acc, amount);
                            System.out.println("Account Created!");
                        } else {
                            System.out.println("Invalid Balance!");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    if (accounts.containsKey(acc)) {
                        System.out.print("Enter Deposit Amount: ");
                        amount = sc.nextDouble();

                        if (amount > 0) {
                            accounts.put(acc,
                                accounts.get(acc) + amount);
                            System.out.println("Deposit Successful!");
                        } else {
                            System.out.println("Invalid Amount!");
                        }
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    if (accounts.containsKey(acc)) {
                        System.out.print("Enter Withdrawal Amount: ");
                        amount = sc.nextDouble();

                        if (amount > 0 && amount <= accounts.get(acc)) {
                            accounts.put(acc,
                                accounts.get(acc) - amount);
                            System.out.println("Withdrawal Successful!");
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    if (accounts.containsKey(acc)) {
                        System.out.println("Balance: " +
                            accounts.getOrDefault(acc, 0.0));
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("All Accounts:");
                    for (Map.Entry<Integer, Double> e :
                            accounts.entrySet()) {
                        System.out.println(
                            e.getKey() + " : " + e.getValue());
                    }
                    break;

                case 6:
                    double total = 0;
                    for (double balance : accounts.values()) {
                        total += balance;
                    }
                    System.out.println("Total Balance: " + total);
                    break;

                case 7:
                    System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    if (accounts.containsKey(acc)) {
                        accounts.remove(acc);
                        System.out.println("Account Closed!");
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
