import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String numStr = String.valueOf(n);

        int length = numStr.length();

        if (length % 2 == 1) {
            char middleDigit = numStr.charAt(length / 2);
            System.out.println("Middle digit is: " + middleDigit);
        } else {
            System.out.println("Even number of digits, no single middle digit.");
        }

        input.close();
    }
}
