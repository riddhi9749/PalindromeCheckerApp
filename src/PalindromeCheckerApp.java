/**
 * Palindrome Checker Application
 * Use Case 9: Recursive Palindrome Checker
 *
 * Uses recursion to compare characters from start and end.
 *
 * @author YourName
 * @version 9.0
 */

public class PalindromeCheckerApp {

    // 🔹 RECURSIVE METHOD
    static boolean isPalindrome(String str, int start, int end) {

        // 🔹 BASE CONDITION
        if (start >= end) {
            return true;
        }

        // 🔹 CHECK CHARACTERS
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // 🔹 RECURSIVE CALL
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 9.0\n");

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}