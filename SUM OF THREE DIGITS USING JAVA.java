import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("An example!");

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = Input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = Input.nextInt();

        System.out.println("Enter third number: ");
        int num3 = Input.nextInt();

        int Sum = num1 + num2 + num3;
        double average = Sum/3;
        System.out.println("Sum: " + Sum);
        System.out.println("Average" + average);


        



    }
}