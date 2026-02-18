import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Iterate the string in reverse order to build the reversed string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Compare original and reversed strings
        boolean isPalindrome = original.equals(reversed);

        // Display the result
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}