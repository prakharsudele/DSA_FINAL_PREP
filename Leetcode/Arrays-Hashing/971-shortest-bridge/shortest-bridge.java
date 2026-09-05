class Solution {
    Queue<int[]> q = new LinkedList<>();
    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        boolean found = false;

        //find first '1' and traverse the complete island by dfs.
        for(int i=0;i<n;i++){
            for(int j=0;j<n && !found;j++){
                if(grid[i][j] == 1){
                    dfs(grid , i , j , visited);
                    found = true;
                    break;
                }
            }
        }

        return nearestIsland(grid , visited);
    }

    private void dfs(int[][] grid , int row , int col , boolean[][] visited){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid.length || grid[row][col] == 0 || visited[row][col]) return;
        visited[row][col] = true;
        q.offer(new int[]{row , col});

        dfs(grid , row+1 , col , visited);
        dfs(grid , row , col+1 , visited);
        dfs(grid , row-1 , col , visited);
        dfs(grid , row , col-1 , visited);
    }

    private int nearestIsland(int[][] grid , boolean[][] visited){
        int[][] trav = {{-1,0} , {0 , 1} , {1 , 0} , {0 , -1}};
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            while(size --> 0){
                int[] temp = q.poll();
                for(int []dirc : trav){
                    int i = temp[0] + dirc[0];
                    int j = temp[1] + dirc[1];

                    if(i >= grid.length || i < 0 || j >= grid[0].length || j < 0 || visited[i][j]) continue;
                    if(grid[i][j] == 1) return level;
                    else visited[i][j] = true;
                    q.offer(new int[]{i , j});
                }
            }
            level+=1;
        }
        return -1;
    }
}