// Palindrome Checker Application
// Use Case 10: Case-Insensitive & Space-Ignored Palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Reverse the normalized string
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("The sentence \"" + word + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The sentence \"" + word + "\" is NOT a Palindrome.");
        }
    }
}