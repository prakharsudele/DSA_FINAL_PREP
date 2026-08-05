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
        if(lists == null || lists.length == 0) return null;

        while(lists.length > 1){
            List<ListNode> temp = new ArrayList<>();
            for(int i=0;i<lists.length;i+=2){
                ListNode l1 = lists[i];
                ListNode l2 = i+1<lists.length ? lists[i+1] : null;
                temp.add(merge(l1 , l2));
            }
            lists = temp.toArray(new ListNode[0]);
        }
        return lists[0];
    }

    private ListNode merge(ListNode list1 , ListNode list2){
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(list1!=null && list2 != null){
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
            }else{
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }
        curr.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}