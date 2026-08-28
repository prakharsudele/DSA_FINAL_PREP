class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length , m = img[0].length;
        int[][] res = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = smoote(img , i , j);
            }
        }
        return res;
    }

    private int smoote(int[][] img , int row , int col){
        int n = img.length;
        int m = img[0].length;
        int sum = 0;
        int count = 0;

        for(int i=-1; i<=1 ; i++){
            for(int j=-1;j<=1;j++){
                int nrow = row + i;
                int ncol = col + j;
                if(nrow < 0 || nrow >= n || ncol < 0 || ncol >= m) continue;
                sum+=img[nrow][ncol];
                count++;
            }
        }
        return sum/count;
    }
}