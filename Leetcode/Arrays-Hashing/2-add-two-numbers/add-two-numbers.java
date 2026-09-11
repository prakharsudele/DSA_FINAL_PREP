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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode news = null;
        ListNode temp = news;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;

        while (curr1 != null && curr2 != null) {
            int one = curr1.val;
            int two = curr2.val;
            int sum = one + two + carry;
            if(temp == null) {
                temp = new ListNode(sum % 10);
                news = temp;
            } else {
                news.next = new ListNode(sum % 10);
                news = news.next;
            }

            carry = sum/10;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        while (curr1 != null) {
            int one = curr1.val;
            int sum = one + carry;
            if (sum > 9) {
                carry = 1;
                news.next = new ListNode(sum%10);
                news = news.next;
            } else {
                carry = sum/10;
                news.next = new ListNode(sum%10);
                news = news.next;
            }

            curr1 = curr1.next;
        }

        while (curr2 != null) {
            int one = curr2.val;
            int sum = one + carry;
            if (sum > 9) {
                carry = 1;
                news.next = new ListNode(sum%10);
                news = news.next;
            } else {
                carry = sum/10;
                news.next = new ListNode(sum%10);
                news = news.next;
            }

            curr2 = curr2.next;
        }

        if(carry > 0){
            news.next = new ListNode(carry);
        }

        return temp;
    }
}