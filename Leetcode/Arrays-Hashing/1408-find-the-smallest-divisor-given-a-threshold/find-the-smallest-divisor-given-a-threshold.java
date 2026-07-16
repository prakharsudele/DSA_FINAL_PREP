class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int i = 1;
        int j = -1;
        for(int it : nums){
            j = Math.max(j , it);
        }
        int ans = j;
        while(i <= j){
            int mid = i + (j-i)/2;
            boolean check = sum(mid , nums , threshold);
            if(check){
                ans = Math.min(ans , mid);
                j = mid - 1;
            }else i = mid + 1;
        }
        return ans;
    }

    private boolean sum(int mid , int[] nums, int th){
        int sum = 0;
        for(int it : nums){
            sum += (int)Math.ceil((double)it/mid);
        }
        return sum<=th;
    }
}