import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        String sanitizedInput = sanitizeInput(userInput);

        boolean isPalindrome = checkPalindrome(sanitizedInput);
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
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
