public class Main5 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color = "Red";
        circle.radius = 5.0;

        Rectangle rectangle = new Rectangle();
        rectangle.color = "Blue";
        rectangle.length = 4.0;
        rectangle.width = 3.0;

        circle.displayColor();
        System.out.println("Circle area: " + circle.calculateArea());

        rectangle.displayColor();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}

class Shape {
    String color;

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }
}
