class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean flag = check(grid , i , j);
                if(!flag) return false;
            }
        }

        return true;
    }

    private boolean check(int[][] grid , int row , int col){
        int n = grid.length;
        int m = grid[0].length;
        boolean flag = true;

        if(row < n-1){
            if(grid[row][col] != grid[row+1][col]){
                flag = false;
                return flag;
            }
        }

        if(col < m-1){
            if(grid[row][col] == grid[row][col+1]){
                flag = false;
                return flag;
            }
        }

        return true;
    }
}