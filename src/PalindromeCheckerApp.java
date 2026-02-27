public class PalindromeCheckerApp {

    /**
     * Recursive method to check palindrome.
     * Compares characters at start and end index,
     * moving inward with each recursive call.
     *
     * Base Condition 1: start >= end → all characters matched → true
     * Base Condition 2: mismatch found → false
     *
     * @param str   The string to check
     * @param start Starting index (left pointer)
     * @param end   Ending index (right pointer)
     * @return true if palindrome, false otherwise
     */
    static boolean isPalindrome(String str, int start, int end) {

        // Base Condition: pointers met or crossed — palindrome confirmed
        if (start >= end) {
            return true;
        }

        // Base Condition: mismatch found — not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call: move inward and check next pair
        return isPalindrome(str, start + 1, end - 1);
    }

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
        System.out.println("Application Version: 9.0");
        System.out.println("Application started successfully.");
        System.out.println();

        // --------------------------------------------------------
        // UC9 - Recursive Palindrome Check
        // --------------------------------------------------------

        // Test words
        String[] testWords = {"racecar", "hello", "madam", "world", "level"};

        for (String original : testWords) {

            // Call recursive method with full start and end index
            boolean result = isPalindrome(original, 0, original.length() - 1);

            // Print result
            System.out.println("Original  : " + original);
            System.out.println("Technique : Recursion with Call Stack");
            System.out.println("Result    : \"" + original + "\" " +
                    (result ? "IS a palindrome ✓" : "is NOT a palindrome ✗"));
            System.out.println("----------------------------------------");
        }

        System.out.println("Program completed successfully.");
    }
}
