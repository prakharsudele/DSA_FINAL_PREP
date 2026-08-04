class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int curr = 0 , i = 0;
        while(curr < k){
            pq.offer(nums[i]);
            curr++;
            i++;
        }
        while(i < nums.length){
            if(pq.peek() < nums[i]){
                pq.offer(nums[i]);
                pq.poll();
            }
            i++;
        }
        return pq.peek();
    }
}