/**
 * Palindrome Checker Application
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Uses Stack (LIFO) to reverse characters and validate palindrome.
 *
 * @author YourName
 * @version 5.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 5.0\n");

        // 🔹 INPUT STRING
        String word = "madam";

        // 🔹 STACK
        Stack<Character> stack = new Stack<>();

        // 🔹 PUSH CHARACTERS
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // 🔹 POP & COMPARE
        boolean isPalindrome = true;

        for (int i = 0; i < word.length(); i++) {

            char popped = stack.pop();

            if (word.charAt(i) != popped) {
                isPalindrome = false;
                break;
            }
        }

        // 🔹 RESULT
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}