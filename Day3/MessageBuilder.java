class MessageBuilder {
    String firstName;
    String lastName;

    public static void main(String[] args) {

        MessageBuilder m = new MessageBuilder();

        m.firstName = "Java";
        m.lastName = "Developer";

     
        String fullName = m.firstName.concat(" ").concat(m.lastName);

        System.out.println("Welcome, " + fullName);
    }
}
