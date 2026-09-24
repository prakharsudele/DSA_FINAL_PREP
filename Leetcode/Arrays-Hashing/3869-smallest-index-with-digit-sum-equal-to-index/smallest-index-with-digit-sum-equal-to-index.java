class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            int it = nums[i];
            while(it > 0){
                sum += it%10;
                it/=10;
            }
            if(sum == i) return i;
        }
        return -1;
    }
}