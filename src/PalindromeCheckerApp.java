public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // --------------------------------------------------------
        // UC1 - Welcome Message
        // --------------------------------------------------------
        System.out.println("========================================");
        System.out.println("   Palindrome Checker Management System ");
        System.out.println("========================================");
        System.out.println("Application Version: 4.0");
        System.out.println("Application started successfully.");
        System.out.println();

        // --------------------------------------------------------
        // UC4 - Character Array Based Palindrome Check
        // --------------------------------------------------------

        // Test words
        String[] testWords = {"racecar", "hello", "madam", "world", "level"};

        for (String original : testWords) {

            // Step 1: Convert String to char[]
            char[] chars = original.toCharArray();

            // Step 2: Two-pointer approach
            int start = 0;                  // pointer from the beginning
            int end = chars.length - 1;     // pointer from the end
            boolean isPalindrome = true;

            while (start < end) {
                // Step 3: Compare start and end characters
                if (chars[start] != chars[end]) {
                    isPalindrome = false;   // mismatch found, not a palindrome
                    break;
                }
                start++;  // move start pointer forward
                end--;    // move end pointer backward
            }

            // Display result
            System.out.println("Original  : " + original);
            System.out.println("Char[]    : " + java.util.Arrays.toString(chars));
            System.out.println("Result    : \"" + original + "\" " +
                    (isPalindrome ? "IS a palindrome ✓" : "is NOT a palindrome ✗"));
            System.out.println("----------------------------------------");
        }

        System.out.println("Program completed successfully.");
    }

}