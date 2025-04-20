import java.util.*;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the side of the hexagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area
        double area = (3 * Math.sqrt(3) / 2) * side * side;

        // Display the result rounded to 2 decimal places
        System.out.printf("The area of the hexagon is %.2f%n", area);

        input.close();
    }
}
