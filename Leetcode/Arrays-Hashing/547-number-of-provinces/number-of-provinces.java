class Solution {
    public int findCircleNum(int[][] prov) {
        int n = prov.length;
        boolean[] vis = new boolean[n];
        int count = 0;

        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                dfs(prov , vis , i);
            }
        }
        return count;
    }

    private void dfs(int[][] prov , boolean[] vis , int node){
        vis[node] = true;

        for(int i=0;i<prov.length;i++){
            if(!vis[i] && prov[node][i] == 1) dfs(prov , vis , i);
        }
    }
}