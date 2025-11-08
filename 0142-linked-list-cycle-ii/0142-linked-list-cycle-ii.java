public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Cycle detected
                break;
            }
        }

        // If no cycle
        if (fast == null || fast.next == null) return null;

        // Step 2: Find the start of the cycle
        slow = head; // move slow to head
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Both pointers meet at the start of the cycle
        return slow;
    }
}
