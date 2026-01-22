package lab.ClassObject;

import javax.lang.model.element.VariableElement;

public class Memoryallocation {
    
    public static void main(String[] args) {
        Variable obj1 = new ClassObject();
        obj1.setText("Memory Management");
        System.out.println("Object 1 Text: " + obj1.text);

        Variable obj2 = obj1;
        obj2.setText("Java OOP");
        System.out.println("Object 2 Text: " + obj2.text);

        System.out.println("Object 1 Text after modifying Object 2: " + obj1.text);
    }
}
