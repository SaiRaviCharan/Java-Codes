import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;
        System.out.println(lastDigit + secondLastDigit);
        input.close();
    }
}
