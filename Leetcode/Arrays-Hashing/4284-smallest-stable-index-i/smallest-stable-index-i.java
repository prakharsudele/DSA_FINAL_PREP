class Solution {
    public int firstStableIndex(int[] nums, int k) {
        //brute force
        //for every element traverse forward and backward figuring out max in backward traversal and min in forward traversal.
        //whenever find diffrence less than equal to k return it if not till the end return -1.
        //TC --> O(N^2)
        //SC --> O(1)
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        int maxi = -1 , mini = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            max[i] = Math.max(maxi , nums[i]);
            maxi = Math.max(maxi ,  nums[i]);
        }

        for(int i=n-1;i>=0;i--){
            min[i] = Math.min(mini , nums[i]);
            mini = Math.min(mini , nums[i]);
        }
        for(int i=0;i<n;i++){
            if(max[i] - min[i] <= k) return i;
        }
        return -1;
    }
}