public class Main7 {
    public static void main(String[] args) {
        Android android = new Android();
        iPhone iphone = new iPhone();

        System.out.println("Android:");
        android.powerSource = "Battery";
        android.screenSize = 6.5;
        android.turnOn();
        android.makeCall();
        android.openPlayStore();
        System.out.println("Power source: " + android.powerSource);
        System.out.println("Screen size: " + android.screenSize + " inches");

        System.out.println("\niPhone:");
        iphone.powerSource = "Battery";
        iphone.screenSize = 6.1;
        iphone.turnOn();
        iphone.makeCall();
        iphone.openAppStore();
        System.out.println("Power source: " + iphone.powerSource);
        System.out.println("Screen size: " + iphone.screenSize + " inches");
    }
}

class Device {
    String powerSource;

    void turnOn() {
        System.out.println("Device powered on");
    }
}

class Mobile extends Device {
    double screenSize;

    void makeCall() {
        System.out.println("Making a call");
    }
}

class Android extends Mobile {
    void openPlayStore() {
        System.out.println("Opening Play Store");
    }
}

class iPhone extends Mobile {
    void openAppStore() {
        System.out.println("Opening App Store");
    }
}
