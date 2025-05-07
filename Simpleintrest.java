import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter Principal amount (P): ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time = input.nextDouble();

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Output result
        System.out.println("Simple Interest is: " + interest);

        input.close();
    }
}
