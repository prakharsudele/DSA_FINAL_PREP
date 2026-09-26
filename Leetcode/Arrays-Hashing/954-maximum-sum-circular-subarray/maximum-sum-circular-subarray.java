class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //2 kadane algo to figure out solutio as there can be 2 cases only either normal subarray sum wihtout circular numbers or with circular numbers.

        //figur out minkadane and maxkadane sum circularSum = total - minKadane.
        //if our maxsum is less than 0 that means all number are negative and hence we reutrn maxsum.

        //otherwise we will check what is greater maxsum or total - minsum (circular kadane).
        int maxsum = nums[0] , minsum = nums[0];
        int currmax = nums[0] , currmin = nums[0];
        int total = nums[0];

        for(int i=1;i<nums.length;i++){
            currmax = Math.max(currmax + nums[i] , nums[i]);
            maxsum  = Math.max(maxsum , currmax);

            currmin = Math.min(currmin + nums[i] , nums[i]);
            minsum = Math.min(minsum , currmin);

            total += nums[i];
        }


        if(maxsum < 0) return maxsum;//all negative cases handled.

        return Math.max(maxsum , total - minsum);//optimal answer.
    }
}

//TC --> O(N)
//SC --> O(1)