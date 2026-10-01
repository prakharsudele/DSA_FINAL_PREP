class Solution {
    public int findKthLargest(int[] nums, int k) {
        //maintain an minHeap for this question of size k so our kth smallest element will be at top at the end of the algo.

        //offer k elements in priorityQueue. then traverse whole array whenever find element greater than peek pop the current smallest element and add new one in queue , it will arrange in min heap order automatically.

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int curr = 0 , i = 0;

        while(curr < k){//add first k elements.
            pq.offer(nums[i]);
            i++;
            curr++;
        }

        while(i < nums.length){//FIFO acc to priority.
            if(pq.peek() < nums[i]){
                pq.offer(nums[i]);
                pq.poll();
            }
            i++;
        }

        return pq.peek();//kth smallest element at top.
    }
}

//TC --> O(NlogK) heap operation take log(k) time to reorganize.
//SC --> O(k) heap with max k elements.