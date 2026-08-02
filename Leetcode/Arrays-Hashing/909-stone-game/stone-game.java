class Solution {
    public boolean stoneGame(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)Arrays.fill(dp[i] , -1);
        int dif = maxDif(nums , dp , 0 , n-1);
        return dif >= 0;
    }

    private int maxDif(int[] nums , int[][] dp , int left , int right){
        if(left == right) return nums[left];
        if(dp[left][right] != -1) return dp[left][right];

        int scoreLeft = nums[left] - maxDif(nums , dp , left+1 , right);
        int scoreRight = nums[right] - maxDif(nums , dp , left , right - 1);

        dp[left][right] = Math.max(scoreLeft , scoreRight);
        return dp[left][right];
    }
}