import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --------------------------------------------------------
        // UC1 - Welcome Message
        // --------------------------------------------------------
        System.out.println("========================================");
        System.out.println("   Palindrome Checker Management System ");
        System.out.println("========================================");
        System.out.println("Application Version: 7.0");
        System.out.println("Application started successfully.");
        System.out.println();

        // --------------------------------------------------------
        // UC7 - Deque-Based Optimized Palindrome Check
        // --------------------------------------------------------

        // Test words
        String[] testWords = {"racecar", "hello", "madam", "world", "level"};

        for (String original : testWords) {

            // Step 1: Insert all characters into the Deque
            Deque<Character> deque = new ArrayDeque<>();

            for (int i = 0; i < original.length(); i++) {
                deque.addLast(original.charAt(i));  // insert at rear
            }

            // Step 2 & 3: Remove first & last, compare until empty
            boolean isPalindrome = true;

            while (deque.size() > 1) {
                char front = deque.removeFirst();  // remove from front
                char rear  = deque.removeLast();   // remove from rear

                if (front != rear) {
                    isPalindrome = false;           // mismatch = not palindrome
                    break;
                }
            }

            // Print result
            System.out.println("Original  : " + original);
            System.out.println("Deque     : Front and Rear compared directly");
            System.out.println("Result    : \"" + original + "\" " +
                    (isPalindrome ? "IS a palindrome ✓" : "is NOT a palindrome ✗"));
            System.out.println("----------------------------------------");
        }

        System.out.println("Program completed successfully.");
    }
}
