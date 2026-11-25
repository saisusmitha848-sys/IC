class InputValidator {
    String userInput;

    public static void main(String[] args) {

        
        InputValidator input1 = new InputValidator();
        input1.userInput = "";

        if (input1.userInput.isBlank()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Valid Input");
        }

       
        InputValidator input2 = new InputValidator();
        input2.userInput = " ";

        if (input2.userInput.isBlank()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Valid Input");
        }

       
        InputValidator input3 = new InputValidator();
        input3.userInput = "Java";

        if (input3.userInput.isBlank()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Valid Input");
        }
    }
}
