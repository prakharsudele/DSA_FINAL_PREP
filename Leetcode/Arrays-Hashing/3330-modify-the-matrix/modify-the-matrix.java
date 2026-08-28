class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] max = new int[m];
        int[][] ans = new int[n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max[i] = Math.max(max[i] , matrix[j][i]);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[j][i] != -1){
                    ans[j][i] = matrix[j][i];
                }else{
                    ans[j][i] = max[i];
                }
            }
        }

        return ans;
    }
}