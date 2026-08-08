class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    ans = Math.max(ans, dfs(grid, i, j, n, m));
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j, int row, int col) {
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != 1)
            return 0;

        grid[i][j] = 0;
        return 1 + dfs(grid, i - 1, j, row, col) + dfs(grid, i + 1, j, row, col) + dfs(grid, i, j - 1, row, col) + dfs(grid, i, j + 1, row, col);
    }
}