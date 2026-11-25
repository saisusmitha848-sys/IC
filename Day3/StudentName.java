class StudentName {
    String fullName;

    public static void main(String[] args) {
    StudentName s = new StudentName();
    s.fullName = " rahul kumar ";
    String cleanedName = s.fullName.trim();
    String upperName = cleanedName.toUpperCase();
    int characterCount = cleanedName.length();
    int spaceIndex = cleanedName.indexOf(" ");
    String firstName = cleanedName.substring(0, spaceIndex);
    String lastName = cleanedName.substring(spaceIndex + 1);
    boolean isValid = upperName.startsWith("RAHUL");

        System.out.println("Original Name: " + s.fullName);
        System.out.println("Cleaned Name: " + cleanedName);
        System.out.println("Uppercase Name: " + upperName);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Character Count: " + characterCount);
        System.out.println("Validation Result: " + isValid);
    }
}
