public class PalindromeCheckerApp {

    /**
     * Normalizes the string by:
     * - Converting to lowercase
     * - Removing spaces and non-alphanumeric characters
     *
     * @param str Raw input string
     * @return Cleaned, normalized string
     */
    static String normalize(String str) {
        // Convert to lowercase
        String lower = str.toLowerCase();

        // Remove all non-alphanumeric characters using regex
        String cleaned = lower.replaceAll("[^a-z0-9]", "");

        return cleaned;
    }

    /**
     * Checks if the normalized string is a palindrome
     * using two-pointer technique.
     *
     * @param str Normalized string
     * @return true if palindrome, false otherwise
     */
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
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
        System.out.println("Application Version: 10.0");
        System.out.println("Application started successfully.");
        System.out.println();

        // --------------------------------------------------------
        // UC10 - Case-Insensitive & Space-Ignored Palindrome Check
        // --------------------------------------------------------

        // Test strings — includes spaces, uppercase, special characters
        String[] testWords = {
                "racecar",
                "Race Car",
                "A man a plan a canal Panama",
                "hello",
                "No lemon no melon",
                "Was it a car or a cat I saw"
        };

        for (String original : testWords) {

            // Step 1: Normalize the string
            String normalized = normalize(original);

            // Step 2: Apply palindrome logic on cleaned string
            boolean result = isPalindrome(normalized);

            // Print result
            System.out.println("Original   : " + original);
            System.out.println("Normalized : " + normalized);
            System.out.println("Result     : \"" + original + "\" " +
                    (result ? "IS a palindrome ✓" : "is NOT a palindrome ✗"));
            System.out.println("----------------------------------------");
        }

        System.out.println("Program completed successfully.");
    }
}
