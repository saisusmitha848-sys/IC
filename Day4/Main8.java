import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Double> accounts = new HashMap<>();

       
        accounts.put(101, 5000.0);
        accounts.put(102, 10000.0);
        accounts.put(103, 7500.0);

       
        System.out.print("Enter New Account Number: ");
        int acc = sc.nextInt();

        if (!accounts.containsKey(acc)) {
            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            if (balance >= 0) {
                accounts.put(acc, balance);
                System.out.println("Account Created Successfully!");
            } else {
                System.out.println("Invalid Balance!");
            }
        } else {
            System.out.println("Account Already Exists!");
        }

        
        System.out.print("Enter Account Number for Deposit: ");
        acc = sc.nextInt();

        if (accounts.containsKey(acc)) {
            System.out.print("Enter Deposit Amount: ");
            double amount = sc.nextDouble();

            if (amount > 0) {
                accounts.put(acc, accounts.get(acc) + amount);
                System.out.println("Deposit Successful!");
            } else {
                System.out.println("Invalid Amount!");
            }
        } else {
            System.out.println("Account Not Found!");
        }

       
        System.out.print("Enter Account Number for Withdrawal: ");
        acc = sc.nextInt();

        if (accounts.containsKey(acc)) {
            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            if (amount > 0 && amount <= accounts.get(acc)) {
                accounts.put(acc, accounts.get(acc) - amount);
                System.out.println("Withdrawal Successful!");
            } else {
                System.out.println("Insufficient Balance or Invalid Amount!");
            }
        } else {
            System.out.println("Account Not Found!");
        }

        
        System.out.print("Enter Account Number to Check Balance: ");
        acc = sc.nextInt();

        if (accounts.containsKey(acc)) {
            System.out.println("Balance: " + accounts.get(acc));
        } else {
            System.out.println("Account Not Found!");
        }

   
        System.out.println("\nAll Bank Accounts:");
        for (Map.Entry<Integer, Double> e : accounts.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        double total = 0;
        for (double balance : accounts.values()) {
            total += balance;
        }

        System.out.println("Total Balance: " + total);

        sc.close();
    }
}
