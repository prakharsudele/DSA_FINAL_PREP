class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> (a[0] + a[1]) - (b[0] + b[1]));

        for(int i=0;i<nums1.length && i < k ;i++){
            minHeap.add(new int[]{nums1[i], nums2[0], 0});
        } 
        
        for(int i=0;i<k && !minHeap.isEmpty(); i++){
            int[] curr = minHeap.poll();
            ans.add(List.of(curr[0] , curr[1]));
            int nums2Index = curr[2];
            if(nums2Index < nums2.length - 1) minHeap.add(new int[]{curr[0] , nums2[nums2Index + 1] , nums2Index + 1});
        }

        return ans;
    }
}