class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m]; 
        int index = 0;
        int toptoB = m;
        int lefttoR = n;
        while(toptoB > 0){
            String path = "";
            if(toptoB == m){
                while(lefttoR > 0){
                    path+='.';
                    lefttoR--;
                }
                lefttoR = n;
            }else{
                while(lefttoR > 1){
                    path+='#';
                    lefttoR--;
                }
                path+='.';
                lefttoR = n;
            }
            ans[index] = path;
            index++;
            toptoB--;
        }
        return ans;
    }
}