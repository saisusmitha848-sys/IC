public class Main4 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "rolls royce";
        car.modelname = "mercedes";

        car.honk();
        car.displaydetails();
    }
}

class Vehicle {
    String brand;

    void honk() {
        System.out.println("Beep! Beep!");
    }
}

class Car extends Vehicle {
    String modelname;

    void displaydetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelname);
    }
}
