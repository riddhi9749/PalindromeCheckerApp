/**
 * =========================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from outer positions moving
 * inward using recursive calls.
 *
 * @author Developer
 * @version 9.0
 */

public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursively checks whether a string is palindrome
     *
     * @param s input string
     * @param start starting index
     * @param end ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}