class Solution {
    public int findPeakElement(int[] nums) {
        //O(n) is easy just traverse from index 1 --> n-2 and when element greater than previous and next retutn it.
        int n = nums.length;
        if(n == 1) return 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }
        
        if(nums[0] > nums[1]) return 0;
        else if(nums[n-1] > nums[n-2]) return n-1;

        return -1;
    }
}

// TC --> O(N)
// SC --> O(N)