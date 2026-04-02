/**
 * Palindrome Checker Application
 * Use Case 13: Performance Comparison
 *
 * Compares execution time of different palindrome approaches.
 *
 * @author YourName
 * @version 13.0
 */

import java.util.*;

// 🔹 STACK METHOD
class StackMethod {
    static boolean check(String input) {
        String str = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// 🔹 DEQUE METHOD
class DequeMethod {
    static boolean check(String input) {
        String str = input.toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// 🔹 TWO-POINTER METHOD (FASTEST)
class TwoPointerMethod {
    static boolean check(String input) {
        String str = input.toLowerCase();
        int start = 0, end = str.length() - 1;

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
        System.out.println("Version: 13.0\n");

        String input = "MadamInEdenImAdam";

        // 🔹 STACK TEST
        long start1 = System.nanoTime();
        StackMethod.check(input);
        long end1 = System.nanoTime();

        // 🔹 DEQUE TEST
        long start2 = System.nanoTime();
        DequeMethod.check(input);
        long end2 = System.nanoTime();

        // 🔹 TWO POINTER TEST
        long start3 = System.nanoTime();
        TwoPointerMethod.check(input);
        long end3 = System.nanoTime();

        // 🔹 RESULTS
        System.out.println("Input: " + input + "\n");

        System.out.println("Stack Method Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Method Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer Time: " + (end3 - start3) + " ns");

        System.out.println("\n(Faster method = lower time)");
    }
}