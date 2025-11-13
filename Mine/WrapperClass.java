package Mine;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 10;                  // primitive
        Integer obj = Integer.valueOf(num);  // manual boxing
        int value = obj.intValue();    // unboxing

        System.out.println("Object: " + obj);
        System.out.println("Value: " + value);
    }
}

