import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Prompt user for height in feet
        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        // Prompt user for height in inches
        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert height to total inches
        int totalInches = (feet * 12) + inches;

        // Convert inches to meters
        double heightInMeters = totalInches * 0.0254;

        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds * 0.45359237;

        // Compute BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display BMI
        System.out.println("BMI is " + bmi);

        // Interpret BMI
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close();
    }
}

