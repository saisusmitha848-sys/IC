interface SmartDevice {

    void connectWifi();

    default void deviceStatus() {
        System.out.println("Smart device is ready");
    }
}

class SmartTV implements SmartDevice {

    public void connectWifi() {
        System.out.println("Smart TV connected to WiFi");
    }
}

class SmartWatch implements SmartDevice {

    public void connectWifi() {
        System.out.println("Smart Watch connected to WiFi");
    }
}

public class MainInterface2 {
    public static void main(String[] args) {

        SmartTV t = new SmartTV();
        t.connectWifi();
        t.deviceStatus();

        SmartWatch w = new SmartWatch();
        w.connectWifi();
        w.deviceStatus();
    }
}
