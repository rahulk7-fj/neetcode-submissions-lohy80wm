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
    public ListNode reverseList(ListNode head) {
        String rev = "";
        ListNode curr = head;
        while(curr != null){
            rev = curr.val+rev;
            curr = curr.next;
        }
        curr = head;
        for(int i=0; head != null && i<rev.length(); i++){
           head.val = Integer.parseInt(String.valueOf(rev.charAt(i)));
           head = head.next;
        }

        return curr;
    }
}
