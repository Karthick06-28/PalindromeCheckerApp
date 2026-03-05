// Palindrome Checker Application
// Use Case 2: Print a Hardcoded Palindrome Result

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // Check if palindrome
        if(word.equals(reverse)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        }
        else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}