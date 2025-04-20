import java.util.*;
public class SumDigits {

    // Method to compute sum of digits
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;  // extract last digit and add to sum
            n /= 10;        // remove last digit
        }
        return sum;
    }

    // Main method to test sumDigits
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        int result = sumDigits(number);
        System.out.println("The sum of the digits is: " + result);

        scanner.close();
    }
}
