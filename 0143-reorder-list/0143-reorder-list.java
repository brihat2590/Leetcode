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
    public void reorderList(ListNode head) {
        //mid element

        if(head==null) return ;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //we get slow as the middle;

        //reverse the ll
        ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //now we merge and reorder
        ListNode first=head;
        ListNode second=prev;
        ListNode temp=null;
        
        while(second.next!=null){
            temp=first.next;
            first.next=second;
            first=temp;


            temp=second.next;
            second.next=first;
            second=temp;
            
        }
        
        
    }
}