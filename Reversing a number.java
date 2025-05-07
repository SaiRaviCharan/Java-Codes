import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();  // Example: 1234
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;         // Get last digit
            reverse = reverse * 10 + digit;  // Shift and add digit
            num = num / 10;               // Remove last digit
        }

        System.out.println("Reversed number: " + reverse);
        input.close();
    }
}
