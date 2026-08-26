class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0 , j = 0;
        String ans = "";
        int count = 0;

        while(j < s.length()){
            if(s.charAt(j) == '1')count++;
            // too many one
            if(count > k){
                while(count > k){
                    if(s.charAt(i) == '1')count--;
                    i++;
                }
            }
            //exactly amount of one we need.
            if(count == k){
                // if we can make is shorter from left.
                while(i < j && s.charAt(i) == '0'){
                    i++;
                }
                //our curr string with potensial answer,
                String cur = s.substring(i, j+1);
                //cur will be our answer if it satisfies any of these condition.
                if(ans.isEmpty() || ans.length() > cur.length() || (ans.length() == cur.length() && cur.compareTo(ans) < 0)){
                    ans = cur;
                }
            }
            j++;
        }
        return ans;
    }
}