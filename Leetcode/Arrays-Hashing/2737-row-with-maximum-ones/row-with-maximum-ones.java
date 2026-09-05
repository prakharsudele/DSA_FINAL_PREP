class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int n = mat.length , m = mat[0].length;
        int maxone = 0;
        for(int i=0;i<n;i++){
            int currone = 0;
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1) currone++;
            }
            if(currone > maxone){
                ans[0] = i;
                ans[1] = currone;
                maxone = currone;
            }
        }
        return ans;
    }
}