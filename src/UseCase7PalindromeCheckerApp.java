import java.util.Deque;
import java.util.ArrayDeque;

/**
 * =========================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue). Characters are inserted into
 * the deque and compared by removing from both ends.
 *
 * @author Developer
 * @version 7.0
 */

public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define input string
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
