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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head; // 0->1->2->3->4 yo cha
        ListNode prev=dummy;
        while(prev.next!=null && prev.next.next!=null){
            ListNode first=prev.next;
            ListNode second=prev.next.next;
            //aba position swap
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
        }
        return dummy.next;

        
    }
}