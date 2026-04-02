/**
 * Palindrome Checker Application
 * Use Case 3: Palindrome Check Using String Reverse (Loop)
 *
 * Reverses a string using a loop and checks palindrome.
 *
 * @author YourName
 * @version 3.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 3.0\n");

        // 🔹 ORIGINAL STRING
        String word = "madam";

        // 🔹 REVERSE USING LOOP
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // 🔹 DISPLAY REVERSED STRING
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversed);

        // 🔹 CHECK PALINDROME
        if (word.equals(reversed)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}