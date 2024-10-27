import java.util.Scanner;

public class Program {
    public static int sumOfDigits(int n) {
        n = Math.abs(n);

        int total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("The sum of the digits is: " + sumOfDigits(number));
        scanner.close();
    }
}