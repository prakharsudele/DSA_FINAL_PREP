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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); //new list
        ListNode curr = dummy;
        if(list1 == null && list2 == null) return dummy.next;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){ //compare 2 values and update accordingly.
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            curr = curr.next; //update curr everytime.
        }

        curr.next = (list1 != null) ? list1 : list2; //add last element if list1 is not null so list1 else list2.
        return dummy.next;
    }
}

//TC --> O(N)
//SC --> O(1) //returned list not included.