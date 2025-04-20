public class Tuition {
    public static void main(String[] args) {
        double tuition = 10000; // initial tuition
        double increaseRate = 0.05;

        // Calculate tuition in 10 years
        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + increaseRate);
        }

        System.out.printf("Tuition in 10 years: $%.2f%n", tuition);

        // Calculate total cost for four years starting from year 11
        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            totalCost += tuition;
            tuition *= (1 + increaseRate);
        }

        System.out.printf("Total cost for four years after 10th year: $%.2f%n", totalCost);
    }
}
