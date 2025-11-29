package lab;


class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Typedifferences {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println("primitive type: " + y);

        Point p1 = new Point(1, 2);
        Point p2 = p1;
        p1.x = 3;
        System.out.println("Reference type: " + p2.x);
    }

}
