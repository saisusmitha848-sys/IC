class FormValidator {
    String name;

    public static void main(String[] args) {
        
        FormValidator f1 = new FormValidator();
        f1.name = "";

        if (f1.name.isEmpty()) {
            System.out.println("Name is required");
        } else {
            System.out.println("Name submitted successfully");
        }

       
        FormValidator f2 = new FormValidator();
        f2.name = "Susmitha";

        if (f2.name.isEmpty()) {
            System.out.println("Name is required");
        } else {
            System.out.println("Name submitted successfully");
        }
    }
}