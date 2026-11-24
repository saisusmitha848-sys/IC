abstract class Appliance {
    void plugIn() {
        System.out.println("Appliance plugged into power");
    }

   
    abstract void operate();
}
class Fan extends Appliance {

    @Override
    void operate() {
        System.out.println("Fan is spinning at high speed");
    }
} 
class WashingMachine extends Appliance {

    @Override
    void operate() {
        System.out.println("Washing machine is washing clothes");
    }
}
public class Main4 {
    public static void main(String[] args) {

        Fan f = new Fan();
        f.plugIn();
        f.operate();

        WashingMachine w = new WashingMachine();
        w.plugIn();
        w.operate();
    }
}
