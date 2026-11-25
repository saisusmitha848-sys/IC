class InputCleaner {
    String username = " JavaDeveloper ";

    public static void main(String[] args) {
        InputCleaner obj = new InputCleaner();
        System.out.println("Original String Length: " + obj.username.length());

        String cleaned = obj.username.trim();

        System.out.println("Cleaned String Length: " + cleaned.length());

        System.out.println("Cleaned Username: " + cleaned);
    }
}
