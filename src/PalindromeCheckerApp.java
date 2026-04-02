/**
 * Palindrome Checker Application
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Encapsulates palindrome logic inside a separate class.
 *
 * @author YourName
 * @version 11.0
 */

// 🔥 SERVICE CLASS (ENCAPSULATION)
class PalindromeChecker {

    // METHOD TO CHECK PALINDROME
    public boolean checkPalindrome(String input) {

        // NORMALIZE INPUT
        String str = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

// MAIN CLASS
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 11.0\n");

        String input = "Madam In Eden Im Adam";

        // 🔹 CREATE OBJECT
        PalindromeChecker checker = new PalindromeChecker();

        // 🔹 CALL METHOD
        boolean result = checker.checkPalindrome(input);

        // 🔹 OUTPUT
        System.out.println("Input: " + input);

        if (result) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}