class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] res = new long[k];
        int[] freq = new int[k];

        for(int it : nums){
            it %= k;
            int[] curr = new int[k];
            curr[it] = 1;

            for(int x=0;x<k;x++){
                curr[x*it % k] += freq[x];
            }

            freq = curr;

            for(int x=0;x<k;x++) res[x] += freq[x];
        }
        return res;
    }
}