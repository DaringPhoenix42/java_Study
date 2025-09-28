// Abstract parent class
package OPPS;
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    // Abstract method (no body)
    abstract double area();

    // Normal method
    void displayColor() {
        System.out.println("Shape color: " + color);
    }
}

// Child class: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Child class: Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Main class
public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(7, "Red");
        Shape s2 = new Rectangle(10, 5, "Blue");

        s1.displayColor();
        System.out.println("Circle Area: " + s1.area());

        s2.displayColor();
        System.out.println("Rectangle Area: " + s2.area());
    }
}
