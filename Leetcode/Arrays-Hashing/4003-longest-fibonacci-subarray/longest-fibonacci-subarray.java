class Solution {
    public int longestSubarray(int[] nums) {
        int maxL = 2;
        int count = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i-2] + nums[i-1] == nums[i]){
                count++;
                maxL = Math.max(maxL , count);
            }else{
                count = 2;
            }
        }

        return maxL;
    }
}