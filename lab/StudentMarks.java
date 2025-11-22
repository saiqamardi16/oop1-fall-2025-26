package lab;
import java.util.Scanner;


public class StudentMarks {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 integer marks (0-100):");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();

        int total = m1 + m2 + m3 + m4;
        double average = total / 4.0;

        System.out.println("Total = " + total);
        System.out.printf("Average = %.2f%n", average);

        if (average >= 50.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        sc.close();
    }
}

    

