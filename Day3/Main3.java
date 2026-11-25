class PasswordChecker {
    String password = "Java@123";
    String confirmPassword = "Java@123";

    void checkPassword() {
        if (password.equals(confirmPassword)) {
            System.out.println("Password Matched");
        } else {
            System.out.println("Password Mismatch");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
      
        PasswordChecker p1 = new PasswordChecker();
        p1.checkPassword();

    
        PasswordChecker p2 = new PasswordChecker();
        p2.confirmPassword = "Java@456";
        p2.checkPassword();
    }
}
