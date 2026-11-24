class Car{
    Car(){
        System.out.println("This is Constructor");
    }
    Car(int a){
        System.out.println("Overloaded Constructor");
    }
}


class Constructor{
 
    public static void main(String[]args){
        new Car();
        new Car(10);

    }
}
