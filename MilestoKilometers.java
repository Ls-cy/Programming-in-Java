public class MilestoKilometers {
    public static void main(String[] args) {
        System.out.println("Miles/Kilometers");

        for (int mile = 1; mile <= 10; mile++) {
            double kilometers = mile * 1.609;
            System.out.printf("%-7d/%.3f", mile, kilometers);
        }
    }
}
