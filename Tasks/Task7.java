import java.util.Scanner;

public class Task7 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");

        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();

        System.out.println();

        System.out.println("Output: ");

        System.out.println("Sum: " + add(firstNum, secondNum));
        System.out.println("Difference: " + subtract(firstNum, secondNum));
        System.out.println("Product: " + multiply(firstNum, secondNum));

        if (secondNum != 0) {
            System.out.println("Quotient: " + divide(firstNum, secondNum));
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
        }

        scanner.close();
    }
}