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
    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer> allValues=new ArrayList<>();

        for(ListNode node:lists){
            while(node!=null){
                allValues.add(node.val);
                node=node.next;
            }

        }
        Collections.sort(allValues);
        // return allValues;

        //can't just return the values as linkefList should be returned

        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        for(int val:allValues){
            current.next=new ListNode(val);
            current=current.next;

        }
        return dummy.next;
        
    }
}