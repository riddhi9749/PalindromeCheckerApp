import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Demonstrates how different palindrome algorithms can
 * be selected dynamically using the Strategy Design Pattern.
 *
 * @author Developer
 * @version 12.0
 */

public class UseCase12PalindromeCheckerApp {

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        String input = "level";

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * =========================================================
 * INTERFACE – PalindromeStrategy
 * =========================================================
 *
 * Defines a contract for palindrome algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * =========================================================
 * CLASS – StackStrategy
 * =========================================================
 *
 * Implements palindrome validation using Stack.
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
