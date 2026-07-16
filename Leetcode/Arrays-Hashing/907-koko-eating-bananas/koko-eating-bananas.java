class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = Integer.MAX_VALUE;
        int j = -1;
        for(int it : piles){
            j = Math.max(j , it);
        }
        int i = 1;

        while(i <= j){
            int mid = (i+j)/2;
            boolean time = caneat(piles , h , mid);
            if(time){
                ans = Math.min(ans , mid);
                j = mid - 1;
            }
            else i = mid + 1;
        }
        return ans;
    }

    private boolean caneat(int[] piles, int h , int mid){
        int time = 0;
        for(int it : piles){
            time += Math.ceil((double)it/mid);
        }
        if (time <= h) return true;
        return false;
    }
}