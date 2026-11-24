abstract class Vehical{
    abstract void start();
    void run(){
        System.out.println("Hello World");
    }
}
class Bike extends Vehical{
    @Override 
    void start(){
        System.out.println("Starting");
    }
}

class Abstract{
    public static void main(String[]args){
        Bike b = new Bike();

        b.start();
        b.run();
    }
}
