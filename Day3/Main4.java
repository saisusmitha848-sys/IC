class UsernameValidator {
    String username = "Admin";
    String enteredUsername = "ADMIN";

    void validateUsername() {
        if (username.equalsIgnoreCase(enteredUsername)) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        UsernameValidator u1 = new UsernameValidator();

        u1.validateUsername();
    }
}