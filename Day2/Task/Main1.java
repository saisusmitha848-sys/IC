class UserRegistration {
    void register(String name, int userId) {
        System.out.println("Registered user: " + name + " with ID: " + userId);
    }

    void register(int userId, String name) {
        System.out.println("Registered ID: " + userId + " for user: " + name);
    }
}

public class Main1 {
    public static void main(String[] args) {
        UserRegistration u = new UserRegistration();

        u.register("Sai", 101);
        u.register(102, "Bhavitha");
    }
}