class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length , m = grid[0].length;
        int count = 0;
        boolean[][] flag = new boolean[n][m];//boolean matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && !flag[i][j]){//if found '1' which is not yet traverssed it's an new island.
                    dfs(grid , flag , i , j , n , m);
                    count++;
                }
            }
        }
        return count;
    }


    private void dfs(char[][] grid , boolean[][] flag , int row , int col , int n , int m){
        if(row < 0 || row >= n || col < 0 || col >= m || flag[row][col] || grid[row][col] == '0') return;
        //check boundary as well as conditions.
        flag[row][col] = true;
        dfs(grid , flag , row+1 , col , n , m);//explore all ways.
        dfs(grid , flag , row-1 , col , n , m);
        dfs(grid , flag , row , col+1 , n , m);
        dfs(grid , flag , row , col-1 , n , m);
    }
}


//TC --> O(N*M)
//SC --> O(N*M)