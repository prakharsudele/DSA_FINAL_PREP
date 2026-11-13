class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int currsum = 0;
        int minl = Integer.MAX_VALUE;

        for(int j=0;j<nums.length;j++){
            currsum += nums[j];

            if(currsum >= target){
                minl = Math.min(minl , j-i+1);
                while(currsum >= target){
                    minl = Math.min(minl , j-i+1);
                    currsum -= nums[i];
                    i++;
                }
            }
        }

        return minl == Integer.MAX_VALUE ? 0 : minl;
    }
}