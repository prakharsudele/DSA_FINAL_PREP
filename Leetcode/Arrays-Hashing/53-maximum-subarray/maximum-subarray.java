class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane algorithim states that whenever your sum reaches negative it can never be your answer so always reset it back to 0.
        //in a case where there is always negative number the answer would be single negative numeber with max value.(more close tp 0)
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        int min = Integer.MIN_VALUE;
        for(int it : nums){
            currsum += it;
            maxSum = Math.max(maxSum , currsum);
            if(currsum < 0) currsum = 0;//reset sum to 0.
        }
        return maxSum;
    }
}

//TC --> O(N)
//SC --> O(1)