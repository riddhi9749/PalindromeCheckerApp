/**
 * Palindrome Checker Application
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Uses singly linked list, fast/slow pointer,
 * and in-place reversal to check palindrome.
 *
 * @author YourName
 * @version 8.0
 */

public class PalindromeCheckerApp {

    // 🔹 NODE CLASS
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // 🔹 CREATE LINKED LIST FROM STRING
    static Node createList(String word) {

        Node head = null, tail = null;

        for (int i = 0; i < word.length(); i++) {

            Node newNode = new Node(word.charAt(i));

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // 🔹 REVERSE LINKED LIST
    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // 🔹 CHECK PALINDROME
    static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        // 🔹 FIND MIDDLE (FAST & SLOW POINTER)
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 🔹 REVERSE SECOND HALF
        Node secondHalf = reverse(slow);

        // 🔹 COMPARE BOTH HALVES
        Node firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("Version: 8.0\n");

        String word = "madam";

        Node head = createList(word);

        if (isPalindrome(head)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}