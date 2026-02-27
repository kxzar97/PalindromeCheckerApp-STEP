public class PalindromeCheckerApp {

    // --------------------------------------------------------
    // Node class - represents each element in the Linked List
    // --------------------------------------------------------
    static class Node {
        char data;      // character stored in node
        Node next;      // reference to next node

        Node(char data) {
            this.data = data;
            this.next = null;
        }
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
        System.out.println("Application Version: 8.0");
        System.out.println("Application started successfully.");
        System.out.println();

        // --------------------------------------------------------
        // UC8 - Linked List Based Palindrome Check
        // --------------------------------------------------------

        // Test words
        String[] testWords = {"racecar", "hello", "madam", "world", "level"};

        for (String original : testWords) {

            // Step 1: Convert String to Singly Linked List
            Node head = null;
            Node tail = null;

            for (int i = 0; i < original.length(); i++) {
                Node newNode = new Node(original.charAt(i));
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;  // link new node at the end
                    tail = newNode;
                }
            }

            // Step 2: Find middle using Fast and Slow pointer technique
            // Slow moves 1 step, Fast moves 2 steps
            // When Fast reaches end, Slow is at middle
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;        // move 1 step
                fast = fast.next.next;   // move 2 steps
            }

            // Step 3: Reverse the second half of the linked list in-place
            Node prev = null;
            Node current = slow;

            while (current != null) {
                Node nextNode = current.next;
                current.next = prev;     // reverse the link
                prev = current;
                current = nextNode;
            }

            // prev is now the head of the reversed second half

            // Step 4: Compare both halves
            Node firstHalf  = head;
            Node secondHalf = prev;
            boolean isPalindrome = true;

            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    isPalindrome = false;  // mismatch found
                    break;
                }
                firstHalf  = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            // Print result
            System.out.println("Original  : " + original);
            System.out.println("Structure : Singly Linked List");
            System.out.println("Technique : Fast & Slow Pointer + In-Place Reversal");
            System.out.println("Result    : \"" + original + "\" " +
                    (isPalindrome ? "IS a palindrome ✓" : "is NOT a palindrome ✗"));
            System.out.println("----------------------------------------");
        }

        System.out.println("Program completed successfully.");
    }
}
