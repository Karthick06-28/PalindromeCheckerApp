// Palindrome Checker Application
// Use Case 13: Performance Comparison

import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Reverse String Approach
    public static boolean checkUsingReverse(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Method 2: Stack Approach
    public static boolean checkUsingStack(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Measure Reverse Method Time
        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(word);
        long end1 = System.nanoTime();

        // Measure Stack Method Time
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time (Reverse): " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Stack Method Result: " + result2);
        System.out.println("Execution Time (Stack): " + (end2 - start2) + " ns");
    }
}