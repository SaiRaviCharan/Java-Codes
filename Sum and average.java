import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        double average = sum / 2.0; // use 2.0 to get decimal average

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        input.close();
    }
}
