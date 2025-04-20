import java.util.*;

public class Average {

    // Overloaded method for int array
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Overloaded method for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 double values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double avg = average(numbers);
        System.out.println("The average is: " + avg);

        scanner.close();
    }
}
