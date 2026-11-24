abstract class Shape{
    abstract double calculateArea();
    void displayMessage(){
        System.out.println("Calculating area of the shape");
    }
}
class Circle extends Shape{
    double radius;
    @Override 
    double calculateArea(){
       return 3.14 * radius * radius;
    }
}

class Main2{
    public static void main(String[]args){
      Circle c = new Circle();
      c.radius = 5;

       c.displayMessage();
       System.out.println("Area = " + c.calculateArea());
    }
}
