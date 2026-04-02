/**
 * Palindrome Checker Application
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Demonstrates dynamic selection of palindrome algorithms.
 *
 * @author YourName
 * @version 12.0
 */

import java.util.*;

// 🔥 STRATEGY INTERFACE
interface PalindromeStrategy {
    boolean check(String input);
}

// 🔹 STACK STRATEGY
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();
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

// 🔹 DEQUE STRATEGY
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();
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

// 🔥 CONTEXT CLASS
class PalindromeChecker {

    private PalindromeStrategy strategy;

    // SET STRATEGY
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    // EXECUTE STRATEGY
    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

// MAIN CLASS
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 12.0\n");

        String input = "Madam In Eden Im Adam";

        PalindromeChecker checker = new PalindromeChecker();

        // 🔹 CHOOSE STRATEGY AT RUNTIME
        checker.setStrategy(new DequeStrategy());
        // Try: new StackStrategy()

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input: " + input);

        if (result) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}