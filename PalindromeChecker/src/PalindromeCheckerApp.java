// Palindrome Checker Application
// Use Case 6: Queue + Stack Based Palindrome Check

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push and Enqueue characters
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO
        }

        boolean isPalindrome = true;

        // Compare pop (stack) and dequeue (queue)
        for (int i = 0; i < word.length(); i++) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}