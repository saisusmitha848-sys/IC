class Car{
    //Instance variable and methods
    int speed;
    void displaySpeed(){
        System.out.println("200kms");
    }
}
class Main{
    public static void main(String[]args) {
        Car c = new Car();
        c.speed = 100;
        c.displaySpeed();
    }
}