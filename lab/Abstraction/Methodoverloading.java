
    package lab.Abstraction;

// Method Overloading means multiple methods with the same name in the same class, but with different parameter lists.
// Rules:
// 1. Same method name
// 2. Different number, type, or order of parameters
// 3. Return type alone cannot differentiate methods

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Methodoverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(5.5, 4.5));
        System.out.println(c.add(1, 2, 3));
    }
}
 
    

