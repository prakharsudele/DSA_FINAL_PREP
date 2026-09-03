class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //BRUTE FORCE 
        //start from every ith index and go as far as required by cond that is to get sum greater than equal to the target.
        //TC --> O(N^2) too slow
        //SC --> O(1)

        int i = 0 , j = 0;
        int currsum = 0;
        int minL = Integer.MAX_VALUE;
        while(j < nums.length){
            currsum+=nums[j];
            if(currsum >= target){
                while(currsum >= target){
                    minL = Math.min(minL , j-i+1);
                    currsum-=nums[i];
                    i++;
                }
            }
            j++;
        }
        if(minL == Integer.MAX_VALUE) return 0;
        else return minL;
    }
}