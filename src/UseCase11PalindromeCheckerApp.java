/**
 * =========================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * Demonstrates palindrome validation using object-oriented design.
 * The palindrome logic is encapsulated inside a PalindromeService class.
 *
 * @author Developer
 * @version 11.0
 */

public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11
     */
    public static void main(String[] args) {

        String input = "racecar";

        // Create service object
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * Service class that contains palindrome logic
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome
     *
     * @param input input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}