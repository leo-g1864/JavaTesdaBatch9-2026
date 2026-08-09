import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a First Number: ");
        int one = scanner.nextInt();

        System.out.print("Enter a Second Number: ");
        int two = scanner.nextInt();

        System.out.print("Enter a Third Number: ");
        int three = scanner.nextInt();

        if(one == two && two == three) {
            System.out.print("All numbers are equal");
        }else if (one >= two && one >= three) {
            System.out.print(one + " is the largest number");
        }else if(two >= one && two >= three) {
            System.out.print(two + " is the largest number");
        }else{
            System.out.print(three + " is the largest number");
        }
        scanner.close();

    }
}

