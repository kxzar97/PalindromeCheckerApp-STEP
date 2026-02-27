import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        System.out.println("Application Version: 6.0");
        System.out.println("Application started successfully.");
        System.out.println();

        // --------------------------------------------------------
        // UC6 - Queue + Stack Based Palindrome Check
        // --------------------------------------------------------

        // Test words
        String[] testWords = {"racecar", "hello", "madam", "world", "level"};

        for (String original : testWords) {

            // Step 1: Enqueue characters into Queue AND push into Stack
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < original.length(); i++) {
                queue.offer(original.charAt(i));   // enqueue - FIFO
                stack.push(original.charAt(i));    // push    - LIFO
            }

            // Step 2: Dequeue from Queue and Pop from Stack
            // Queue dequeue = original order (FIFO)
            // Stack pop     = reversed order (LIFO)
            boolean isPalindrome = true;

            while (!queue.isEmpty()) {
                char fromQueue = queue.poll();   // FIFO - first character out
                char fromStack = stack.pop();    // LIFO - last character out

                // Step 3: Compare dequeue vs pop
                if (fromQueue != fromStack) {
                    isPalindrome = false;        // mismatch = not a palindrome
                    break;
                }
            }

            // Print result
            System.out.println("Original  : " + original);
            System.out.println("Queue     : FIFO - reads characters in original order");
            System.out.println("Stack     : LIFO - reads characters in reversed order");
            System.out.println("Result    : \"" + original + "\" " +
                    (isPalindrome ? "IS a palindrome ✓" : "is NOT a palindrome ✗"));
            System.out.println("----------------------------------------");
        }

        System.out.println("Program completed successfully.");
    }
}


