package lab.Abstraction;

    // Abstract class
abstract class Shape {

    // Abstract method
    abstract void calculateArea();

    // Concrete method
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass Rectangle
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

// Subclass Circle
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.1416 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

// Main class
public class AbstractShapeDemo {
    public static void main(String[] args) {

        Shape rect = new Rectangle(10, 5);
        Shape cir = new Circle(7);

        rect.displayShape();
        rect.calculateArea();

        cir.displayShape();
        cir.calculateArea();
    }
}

    

