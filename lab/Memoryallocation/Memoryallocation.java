package lab.Memoryallocation;

public class Memoryallocation {

    String text;

    public void setText(String text) {
        this.text = text;
    }

    public static void main(String[] args) {

        Memoryallocation obj1 = new Memoryallocation();
        obj1.setText("Memory Management");
        System.out.println("Object 1 Text: " + obj1.text);

        Memoryallocation obj2 = obj1;
        obj2.setText("Java OOP");
        System.out.println("Object 2 Text: " + obj2.text);

        System.out.println("Object 1 Text after modifying Object 2: " + obj1.text);
    }
}