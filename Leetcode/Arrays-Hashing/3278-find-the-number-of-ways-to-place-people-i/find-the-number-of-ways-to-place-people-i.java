class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int m = points[0].length;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j) continue;
                int x = points[i][0] , y = points[i][1];
                int w = points[j][0] , z = points[j][1];
    
                if(x<=w && y>=z){
                    boolean valid = true;
                    for(int k=0;k<n;k++){
                        if(k==i || k==j) continue;

                        int o = points[k][0];
                        int p = points[k][1];

                        if(o >= x && o <= w && p >=z && p<=y){
                            valid = false;
                            break;
                        }
                    }
                    if(valid) count++;
                }
            }
        }
        return count;
    }
}