package lab;
 import java.util.Scanner;
public class FeulLog {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DAYS = 7;
        double[] fuel = new double[DAYS];

        System.out.println("Enter fuel consumption for 7 days (litres):");
        for (int i = 0; i < DAYS; i++) {
            System.out.printf("Day %d: ", i + 1);
            fuel[i] = sc.nextDouble();
        }

        double total = 0.0;
        double maxFuel = fuel[0];
        int maxDay = 1; // 1-based day number

        for (int i = 0; i < DAYS; i++) {
            total += fuel[i];
            if (fuel[i] > maxFuel) {
                maxFuel = fuel[i];
                maxDay = i + 1;
            }
        }

        System.out.printf("Total fuel consumed = %.2f litres%n", total);
        System.out.printf("Highest usage = %.2f litres on Day %d%n", maxFuel, maxDay);

        sc.close();
    }
}

    

