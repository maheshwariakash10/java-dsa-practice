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
    public boolean isPalindrome(ListNode head) {
        ListNode cp1 = head;
        ListNode rev= null;

        while(cp1!=null){
            ListNode temp= new ListNode(cp1.val);
            temp.next= rev;
            rev= temp;
            cp1= cp1.next;
        }

        cp1 = head;
        ListNode cp2 = rev;
        while(cp1!=null){
            if(cp1.val != cp2.val) return   false;
            cp1= cp1.next;
            cp2= cp2.next;

        }
        return true;


        
    }
}