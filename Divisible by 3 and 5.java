import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println(num1 + " is divisible by both 3 and 5.");
        }
        if (num2 % 3 == 0 && num2 % 5 == 0) {
            System.out.println(num2 + " is divisible by both 3 and 5.");
        }
        if (num3 % 3 == 0 && num3 % 5 == 0) {
            System.out.println(num3 + " is divisible by both 3 and 5.");
        }

        scanner.close();
    }
}
