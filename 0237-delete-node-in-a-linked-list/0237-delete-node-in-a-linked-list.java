/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        //node ko value hatyo
        node.val=node.next.val;
        //purano pointer
        node.next=node.next.next;
        
        
        
    }
}