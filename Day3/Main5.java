class EmailChecker {
    String email = "student@gmail.com";

    void checkEmail() {
        if (email.contains("@")) {
            System.out.println("Email contains @");
        } else {
            System.out.println("Email does not contain @");
        }

        if (email.contains("gmail")) {
            System.out.println("Email contains gmail");
        } else {
            System.out.println("Email does not contain gmail");
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
      
        EmailChecker e1 = new EmailChecker();
        e1.checkEmail();

       
        EmailChecker e2 = new EmailChecker();
        e2.email = "student@yahoo.com";
        e2.checkEmail();

        
        EmailChecker e3 = new EmailChecker();
        e3.email = "studentgmail.com";
        e3.checkEmail();
    }
}
