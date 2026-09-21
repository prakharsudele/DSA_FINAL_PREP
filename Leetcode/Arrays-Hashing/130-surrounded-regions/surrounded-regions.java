class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean vis[][] = new boolean[n][m];

        //check for boundary of matrix whenever found 0 run dfs and don't change these 'O'.
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O' || !vis[i][0]) dfs(board , i , 0 , n , m , vis);
            if(board[i][m-1] == 'O' || !vis[i][m-1]) dfs(board , i , m-1 , n , m , vis);
        }

       for(int j=0;j<m;j++){
            if(board[0][j] == 'O' || !vis[0][j]) dfs(board , 0 , j , n , m , vis);
            if(board[n-1][j] == 'O' || !vis[n-1][j]) dfs(board , n-1 , j , n , m , vis);
        }

        for(int i=0;i<n;i++){//check for leftover zero and convert them to 'X'
            for(int j=0;j<m;j++){
                if(board[i][j] == 'O' && !vis[i][j]) board[i][j] = 'X';
            }
        }
    }

    private void dfs(char[][] board , int row , int col , int n , int m , boolean[][] vis){
        if(row < 0 || row >= n || col < 0 || col >=m || vis[row][col] || board[row][col] == 'X') return;

        vis[row][col] = true;//do nothing just mark them visited.
        dfs(board , row+1 , col , n , m , vis);
        dfs(board , row-1 , col , n , m , vis);
        dfs(board , row , col+1 , n , m , vis);
        dfs(board , row , col-1 , n , m , vis);
    }
}

//TC --> O(N*M)
//SC --> O(N*M)