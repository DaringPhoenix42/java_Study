// Parent class
package OPPS;
class Shape {
    String color;

    // Constructor
    Shape(String c) {
        color = c;
    }

    // Method to be overridden
    double getArea() {
        return 0;
    }

    void displayColor() {
        System.out.println("Shape color: " + color);
    }
}

// Child class 1: Rectangle
class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w, String c) {
        super(c);   // call parent constructor
        length = l;
        width = w;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

// Child class 2: Circle
class Circle extends Shape {
    int radius;

    Circle(int r, String c) {
        super(c);
        radius = r;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Child class 3: Triangle
class Triangle extends Shape {
    int base, height;

    Triangle(int b, int h, String c) {
        super(c);
        base = b;
        height = h;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class AreaShapes {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 5, "Red");
        Shape s2 = new Circle(7, "Blue");
        Shape s3 = new Triangle(6, 4, "Green");

        System.out.println("Rectangle Area: " + s1.getArea());
        System.out.println("Circle Area: " + s2.getArea());
        System.out.println("Triangle Area: " + s3.getArea());
    }
}
