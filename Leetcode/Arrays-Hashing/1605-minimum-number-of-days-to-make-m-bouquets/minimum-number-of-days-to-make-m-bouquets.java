class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;
        int ans = Integer.MAX_VALUE;
        int i = 1;
        int j = -1;
        for(int it : bloomDay){
            j = Math.max(j , it);
        }

        while(i<=j){
            int mid = i + (j-i)/2;
            boolean check = bloom(bloomDay , m , k , mid);
            if(check){
                ans = Math.min(ans , mid);
                j = mid - 1;
            }
            else i = mid + 1;
        }
        return ans;
    }

    static boolean bloom(int[] bloomDay, int m, int k , int mid){
        int formed = 0;
        int cons = 0;
        for(int it : bloomDay){
            if(it <= mid){
                cons++;
                if(cons == k){
                formed++;
                cons = 0;
            }
            }else cons = 0;
        }

        return formed>=m;
    }
}