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
        ListNode prev = null; //keep track of prev pointer
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;//store this or we will lose it forever.
            curr.next = prev;
            prev = curr;
            curr = temp; //update pointer while changing directions of next pointers
        }

        return prev; //prev will be at node 5 at last and curr will be null.
    }
}

//TC-->O(N)
//SC-->O(1)