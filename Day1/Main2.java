public class Main2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("sana");
        account.setBalance(100.0);

        account.setBalance(-50.0);
        System.out.println("Balance after invalid setting: " + account.getBalance());

        account.withdraw(150.0);
        System.out.println("Balance after withdrawal attempt: " + account.getBalance());
    }
}

class BankAccount {
    private String accountholder;
    private double balance;

    public String getAccountHolder() {
        return accountholder;
    }

    public void setAccountHolder(String ah) {
        accountholder = ah;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        if (balance < 0) {
            System.out.println("invalid balance");
            return;
        }
        balance = b;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("invalid deposit amount");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("insufficient funds");
        } else {
            balance -= amount;
        }
    }
}