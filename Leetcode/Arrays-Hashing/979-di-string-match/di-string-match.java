class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n+1];
        int i = 0;
        int small = 0;
        int large = n;
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch=='I'){
                ans[i] = small;
                small++;
                count++;
            }else{
                ans[i] = large;
                large--;
            }
            i++;
        }
        ans[i] = count;
        return ans;
    }
}