class EmailValidation {
    String email;

    public static void main(String[] args) {
        EmailValidation e1 = new EmailValidation();
        e1.email = "student123@gmail.com";

        if (!e1.email.isEmpty()
                && e1.email.contains("@")
                && e1.email.endsWith(".com")
                && e1.email.startsWith("student")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
        EmailValidation e2 = new EmailValidation();
        e2.email = "student123gmail.com";

        if (!e2.email.isEmpty()
                && e2.email.contains("@")
                && e2.email.endsWith(".com")
                && e2.email.startsWith("student")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
        EmailValidation e3 = new EmailValidation();
        e3.email = "user123@gmail.com";

        if (!e3.email.isEmpty()
                && e3.email.contains("@")
                && e3.email.endsWith(".com")
                && e3.email.startsWith("student")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}

