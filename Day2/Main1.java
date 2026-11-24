abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("Animal is Sleeping");
    }
}
class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("Dog barks:woof! woof!");
    }
}

class Main1{
    public static void main(String[]args){
        Dog d = new Dog();

        d.sound();
        d.sleep();
    }
}

