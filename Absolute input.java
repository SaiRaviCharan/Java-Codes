import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num < 0) {
            num = -num;  // Manually convert negative to positive
        }

        System.out.println("Absolute value is: " + num);
        input.close();
    }
}
