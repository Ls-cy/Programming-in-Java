import java.util.*;

public class Duplicates {

    // Method to eliminate duplicates from an array
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length]; // to store unique elements
        int uniqueCount = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            
            // Check if list[i] already exists in temp array
            for (int j = 0; j < uniqueCount; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add to temp
            if (!isDuplicate) {
                temp[uniqueCount] = list[i];
                uniqueCount++;
            }
        }

        // Create final array of correct size
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        int[] distinct = eliminateDuplicates(input);

        System.out.print("The distinct numbers are: ");
        for (int num : distinct) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
