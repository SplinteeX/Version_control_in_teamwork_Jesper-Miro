import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Transform the input string for palindrome checking
        String transformed = transformInput(input);

        // Check if the transformed input is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);

        // Display the result based on whether the input is a palindrome or not
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    // Method to transform the input string for palindrome checking
    public static String transformInput(String input) {
        // Convert the input to lowercase
        input = input.toLowerCase();

        // Remove commas and exclamation marks from the input
        input = input.replace(",", "");
        input = input.replace("!", "");

        // Return the transformed input
        return input;
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String input) {
        // Get the reversed version of the input string
        String reversed = reverseString(input);

        // Check if the input string is equal to its reversed version
        return input.equals(reversed);
    }

    // Method to reverse a string
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