/**
 * Palindrome Checker Application
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Uses char[] and two-pointer technique for efficient checking.
 *
 * @author YourName
 * @version 4.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 4.0\n");

        // 🔹 INPUT STRING
        String word = "madam";

        // 🔹 CONVERT TO CHAR ARRAY
        char[] arr = word.toCharArray();

        // 🔹 TWO POINTERS
        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // 🔹 RESULT
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}