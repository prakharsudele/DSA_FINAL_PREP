class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String s = "";
        int open = n , close = n;//we have total of n choices of each bracket.
        perm(ans , s , open , close);
        return ans;
    }

    private void perm(List<String> ans , String s  , int open , int close){
        if(open == 0 && close == 0){//if we have used all options then add this in our answer.
            ans.add(s);
            return;
        }

        if(open > 0) perm(ans , s+"(" , open - 1 , close);//if there are open left use them.

        if(close > open) perm(ans , s+")" , open , close - 1);//close not used will always be greater than open not used for valid pair.
    }
}