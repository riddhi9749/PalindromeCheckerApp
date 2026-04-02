/**
 * Palindrome Checker Application
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Demonstrates FIFO vs LIFO using Queue and Stack.
 *
 * @author YourName
 * @version 6.0
 */

import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 6.0\n");

        // 🔹 INPUT STRING
        String word = "madam";

        // 🔹 STACK (LIFO)
        Stack<Character> stack = new Stack<>();

        // 🔹 QUEUE (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // 🔹 ADD CHARACTERS
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        // 🔹 COMPARE
        boolean isPalindrome = true;

        while (!stack.isEmpty()) {

            char fromStack = stack.pop();     // LIFO
            char fromQueue = queue.remove(); // FIFO

            if (fromStack != fromQueue) {
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