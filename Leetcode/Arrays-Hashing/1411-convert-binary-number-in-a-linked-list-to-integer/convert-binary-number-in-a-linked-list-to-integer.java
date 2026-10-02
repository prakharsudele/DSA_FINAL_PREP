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
    public int getDecimalValue(ListNode head) {
        String s = "";
        ListNode curr = head;
        while(curr != null){
            s += curr.val;
            curr = curr.next;
        }

        int n = s.length() - 1;
        int index = 0;
        long ans = 0;
        for(int i=n ; i>=0 ; i--){
            ans += Character.getNumericValue(s.charAt(i)) * Math.pow(2 , index);
            index++;
        }
        return (int)ans;
    }
}