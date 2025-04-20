import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a letter
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();

        // Check if input is a single character and a letter
        if (userInput.length() != 1 || !Character.isLetter(userInput.charAt(0))) {
            System.out.println(userInput + " is an invalid input");
        } else {
            char ch = Character.toLowerCase(userInput.charAt(0));

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(userInput + " is a vowel");
            } else {
                System.out.println(userInput + " is a consonant");
            }
        }

        input.close();
    }
}
