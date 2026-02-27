import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // --------------------------------------------------------
        // UC1 - Welcome Message
        // --------------------------------------------------------
        System.out.println("========================================");
        System.out.println("   Palindrome Checker Management System ");
        System.out.println("========================================");
        System.out.println("Application Version: 5.0");
        System.out.println("Application started successfully.");
        System.out.println();

        // --------------------------------------------------------
        // UC5 - Stack-Based Palindrome Check
        // --------------------------------------------------------

        // Test words
        String[] testWords = {"racecar", "hello", "madam", "world", "level"};

        for (String original : testWords) {

            // Step 1: Push all characters into the Stack
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < original.length(); i++) {
                stack.push(original.charAt(i));  // push each character
            }

            // Step 2: Pop characters from Stack to build reversed string
            // Stack follows LIFO — last pushed character comes out first
            String reversed = "";

            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();  // pop reverses the order
            }

            // Step 3: Compare original with reversed
            boolean isPalindrome = original.equals(reversed);

            // Print result
            System.out.println("Original  : " + original);
            System.out.println("Reversed  : " + reversed);
            System.out.println("Stack     : LIFO reversal applied");
            System.out.println("Result    : \"" + original + "\" " +
                    (isPalindrome ? "IS a palindrome ✓" : "is NOT a palindrome ✗"));
            System.out.println("----------------------------------------");
        }

        System.out.println("Program completed successfully.");
    }

}