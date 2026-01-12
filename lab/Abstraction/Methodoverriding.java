package lab.Abstraction;


// Method Overriding occurs when a subclass provides its own implementation of a method defined in the parent class.
// Rules:
// 1. Same method name
// 2. Same parameters
// 3. IS-A relationship (inheritance)

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override // Indicates that this method overrides a method in the parent class
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override // Indicates that this method overrides a method in the parent class
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Methodoverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();   // Calls Animal's sound()
        a = new Dog();
        a.sound();   // Calls Dog's sound()
        a = new Cat();
        a.sound();   // Calls Cat's sound()
    }
}
 
    

