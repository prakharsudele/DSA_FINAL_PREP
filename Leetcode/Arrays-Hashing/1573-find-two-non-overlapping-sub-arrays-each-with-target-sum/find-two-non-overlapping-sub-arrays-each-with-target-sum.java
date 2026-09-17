class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int res = n+1 , sum = 0 , i = 0;
        int[] dp = new int[n+1]; //store so far best case till now.
        Arrays.fill(dp , n);

        for(int j=0;j<n;j++){
            sum += arr[j]; //expand window

            while(sum > target) sum-=arr[i++];//shrink window

            dp[j+1] = dp[j];
            if(sum == target){ //if sum equal to target check
                res = Math.min(res , j-i+1 + dp[i]);//current len + prev best length.
                dp[j+1] = Math.min(dp[j] , j-i+1);//update best length.
            }
        }
        return res == n+1 ? -1 : res;//if res is max length then we haven't found non overlapping subset.
    }
}

//TC --> O(N)
//SC --> O(N)