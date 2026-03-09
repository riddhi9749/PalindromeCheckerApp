import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation
 * using both Queue (FIFO) and Stack (LIFO).
 *
 * Characters are inserted into both structures
 * and compared by removing from the queue
 * and the top of the stack.
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop values
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
