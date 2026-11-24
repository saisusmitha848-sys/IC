interface Alert {
    void sendAlert(String message);
}

class EmailAlert implements Alert {
    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}

class MobileAlert implements Alert {
    public void sendAlert(String message) {
        System.out.println("Mobile Alert: " + message);
    }
}

public class MainInterface1 {
    public static void main(String[] args) {

        Alert a1 = new EmailAlert();
        Alert a2 = new MobileAlert();

        a1.sendAlert("Hello");
        a2.sendAlert("Hello");
    }
}