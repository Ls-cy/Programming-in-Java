import java.util.* ;

public class Gratuity {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt for subtotal
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        // Prompt for gratuity rate
        System.out.print("Enter the gratuity rate (in %): ");
        double gratuityRate = input.nextDouble();

        // Calculate gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        // Display the results
        System.out.printf("The gratuity is $%.2f and the total is $%.2f%n", gratuity, total);

        // Close the scanner
        input.close();
    }
}
