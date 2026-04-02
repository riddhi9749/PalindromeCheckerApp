/**
 * Palindrome Checker Application
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Uses Deque to compare front and rear elements efficiently.
 *
 * @author YourName
 * @version 7.0
 */

import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 7.0\n");

        // 🔹 INPUT STRING
        String word = "madam";

        // 🔹 DEQUE
        Deque<Character> deque = new LinkedList<>();

        // 🔹 ADD CHARACTERS
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // 🔹 COMPARE FRONT & REAR
        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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