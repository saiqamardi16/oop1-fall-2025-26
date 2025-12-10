package lab;

public class Method {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        var methods = new Method(); // FIXED: Method, not Methods
        int sum = methods.add(5, 10);
        System.out.println("The sum is: " + sum);
    }
}

