public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // --------------------------------------------------------
        // UC1 - Welcome Message
        // --------------------------------------------------------
        System.out.println("========================================");
        System.out.println("   Palindrome Checker Management System ");
        System.out.println("========================================");
        System.out.println("Application Version: 3.0");
        System.out.println("Application started successfully.");
        System.out.println();

        // --------------------------------------------------------
        // UC3 - Palindrome Check via String Reversal
        // --------------------------------------------------------

        // Test words
        String[] testWords = {"racecar", "hello", "madam", "world", "level"};

        for (String original : testWords) {

            // Step 1: Reverse the string using a for loop
            // String is immutable — each + creates a new String object
            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i); // String concatenation
            }

            // Step 2: Compare original and reversed using equals()
            // equals() compares content, not memory reference
            boolean isPalindrome = original.equals(reversed);

            // Step 3: Display the result
            System.out.println("Original : " + original);
            System.out.println("Reversed : " + reversed);

            if (isPalindrome) {
                System.out.println("Result   : \"" + original + "\" IS a palindrome ✓");
            } else {
                System.out.println("Result   : \"" + original + "\" is NOT a palindrome ✗");
            }

            System.out.println("----------------------------------------");
        }

        System.out.println("Program completed successfully.");
    }

}