class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n = monsters.length;
        long[] diff = new long[n+1];

        for(int[] b : boosts){
            int l = b[0] , r = b[1];
            long v = b[2];

            diff[l] += v;
            if(r+1 < diff.length){
                diff[r+1]-=v;
            }
        }

        long[] bonus = new long[n];
        long curr = 0;

        for(int i=0;i<n;i++){
            curr+=diff[i];
            bonus[i] = curr;
        }

        long need = 0;

        for(int i=n-1;i>=0;i--){
            if(need == 0){
                need = Math.max(0L , (long)monsters[i] - bonus[i]);
            }else{
                need+=monsters[i];
            }
        }
        return need;
    }
}