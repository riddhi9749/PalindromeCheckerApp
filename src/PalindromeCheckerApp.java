/**
 * Palindrome Checker Application
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Normalizes string by removing spaces and ignoring case.
 *
 * @author YourName
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 10.0\n");

        // 🔹 INPUT STRING (WITH SPACES & MIXED CASE)
        String input = "Madam In Eden Im Adam";

        // 🔹 NORMALIZE STRING
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // 🔹 TWO-POINTER CHECK
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // 🔹 OUTPUT
        System.out.println("Original: " + input);
        System.out.println("Processed: " + normalized);

        if (isPalindrome) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}