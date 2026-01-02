package lab;

// Polymorphic Behavior of Objects occurs when a parent class reference variable refers to a child class object.
// It allows methods to be called based on the actual object type at runtime, enabling dynamic method resolution.

class Shape {
    int size = 10; // common attribute
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    int size = 20; // hides Shape's size
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    int size = 30; // hides Shape's size
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Polymorphic {
    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.draw();   // Drawing a shape
        System.out.println("Size: " + s.size);
        s = new Circle();
        s.draw();   // Drawing a circle
        System.out.println("Size: " + s.size);

        s = new Rectangle();
        s.draw();   // Drawing a rectangle
        System.out.println("Size: " + s.size);
    }
}
 
    

