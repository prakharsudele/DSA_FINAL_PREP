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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return new int[]{-1 , -1};
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode curr = head;
        ListNode prev = null;
        int dist = 1;

        while(curr.next.next != null){

            prev = curr;
            curr = curr.next;

            //local minimna
            if(curr.val < prev.val && curr.val < curr.next.val) arr.add(dist);

            //local maxima
            if(curr.val > prev.val && curr.val > curr.next.val) arr.add(dist);
            dist++;
        }

        if(arr.size() < 2){
            return new int[]{-1 , -1};
        }

        int maxlen = arr.get(arr.size()-1) - arr.get(0);
        int minlen = Integer.MAX_VALUE;

        for(int i=0;i<arr.size()-1;i++){
            minlen = Math.min(minlen , arr.get(i+1) - arr.get(i));
        }
        return new int[]{minlen , maxlen};
    }
}

//TC --> O(n) + size of arr O(m).
//SC --> size of arr O(m).
