class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][n];
        for(int[] row : dp){
            Arrays.fill(row , Integer.MAX_VALUE);
        }
        int minSum = Integer.MAX_VALUE;
        
        for(int col=0;col<n;col++){
            minSum = Math.min(minSum , getmin(0 , col , matrix , dp));
        }

        return minSum;
    }

    private int getmin(int r , int c , int[][] matrix , int[][] dp){
        int n = matrix.length;

        if(c < 0 || c >= n) return Integer.MAX_VALUE/2;
        if(r == n-1) return matrix[r][c];
        if(dp[r][c] != Integer.MAX_VALUE) return dp[r][c];

        int down = matrix[r][c] + getmin(r+1 , c , matrix , dp);
        int left = matrix[r][c] + getmin(r+1 , c-1 , matrix , dp);
        int right = matrix[r][c] + getmin(r+1 , c+1 , matrix , dp);

        return dp[r][c] = Math.min(down , Math.min(left , right));
    }
}