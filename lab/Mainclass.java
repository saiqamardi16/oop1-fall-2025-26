package lab;

public class Mainclass {
    public static void main(String[] args) {
        Variable obj = new ClassObject();
        obj.setText("Hello, World!");
        System.out.println("Text after setting: " + obj.getText().toUpperCase());
        obj.clearText();
        System.out.println("Text after clearing: " + obj.getText());

        Variable anotherObj = new ClassObject();
        anotherObj.setText("Java Programming");
        System.out.println("Another object's text: " + anotherObj.getText().toLowerCase());

        int age = sum(5, 10);
        System.out.println("The sum is: " + age);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
 

