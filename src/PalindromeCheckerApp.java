/**
 * Palindrome Checker Application
 * Use Case 2: Hardcoded Palindrome Check
 *
 * Checks whether a predefined string is a palindrome.
 *
 * @author YourName
 * @version 2.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 2.0\n");

        // 🔹 HARDCODED STRING
        String word = "madam";

        // 🔹 REVERSE STRING
        String reversed = new StringBuilder(word).reverse().toString();

        // 🔹 CHECK PALINDROME
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}