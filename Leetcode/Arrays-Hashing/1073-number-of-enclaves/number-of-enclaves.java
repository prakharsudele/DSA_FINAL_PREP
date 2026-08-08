class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int count = 0;

        //traversing boundary only and all connected points to it (are not enclaves)
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0||j==0||i==n-1||j==m-1) && grid[i][j] == 1){
                    dfs(grid , vis , i , j);
                }
            }
        }

        //remaining all will be enclaves 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1 && !vis[i][j]) count++;
            }
        }
        return count;
    }

    private void dfs(int[][] grid , boolean[][] vis , int i , int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || vis[i][j] || grid[i][j] == 0) return;

        vis[i][j] = true;
        dfs(grid , vis , i+1 , j);
        dfs(grid , vis , i-1 , j);
        dfs(grid , vis , i , j+1);
        dfs(grid , vis , i , j-1);
    }
}