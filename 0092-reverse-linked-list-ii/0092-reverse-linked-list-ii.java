/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node just before the left position
        for (int i = 1; i < left; i++) prev = prev.next;

        // Start and then pointers
        ListNode start = prev.next; // first node of sublist
        ListNode then = start.next; // node to move

        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;  // detach 'then'
            then.next = prev.next;    // move 'then' to front of sublist
            prev.next = then;         // connect prev to 'then'
            then = start.next;        // move 'then' forward
        }

        return dummy.next; // return new head
    }
}
