import java.util.* ;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter Celsius temperature
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Display the result
        System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);

        // Close the scanner
        input.close();
    }
}
