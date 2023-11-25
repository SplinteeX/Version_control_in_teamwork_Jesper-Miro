import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Transform the input string for palindrome checking
        String transformed = sanitizeInput(input);

        // Check if the transformed input is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);

        // Display the result based on whether the input is a palindrome or not
        if (isPalindrome) {
            System.out.println("The sanitized input is a palindrome.");
        } else {
            System.out.println("The sanitized input is not a palindrome.");
        }
    }
    // Sanitize user input: convert to lowercase and remove punctuation
    public static String sanitizeInput(String userInput) {
        userInput = userInput.toLowerCase();
        userInput = removePunctuation(userInput);
        return userInput;
    }

    // Remove punctuation marks from the input string
    public static String removePunctuation(String userInput) {
        return userInput.replaceAll("[^a-zA-Z]", "");
    }

    // Check if the input is a palindrome
    public static boolean checkPalindrome(String input) {
        if (input.length() <= 1) {
            return true;
        }

        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // Reverse the input string

    public static String reverseString(String input) {
        // Use StringBuilder to efficiently build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through the input string in reverse and append each character
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Return the reversed string
        return reversed.toString();
    }
}
