class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] maxel = new int[n];
        int maxe = Integer.MIN_VALUE;
        int[] minel = new int[n];
        int mini = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            maxel[i] = Math.max(maxe , nums[i]);
            maxe = Math.max(maxe , nums[i]);
        }

        for(int i=n-1;i>=0;i--){
            minel[i] = Math.min(mini , nums[i]);
            mini = Math.min(mini , nums[i]);
        }

        for(int i=1;i<n;i++){
            if(maxel[i-1] <= minel[i]) return i;
        }

        return -1;
    }
}