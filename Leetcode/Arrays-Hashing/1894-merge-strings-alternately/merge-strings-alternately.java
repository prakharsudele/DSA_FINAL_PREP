class Solution {
    public String mergeAlternately(String word1, String word2) {
        //make boolean variable turn to alternate between 2 string loop over them and add character in new string answer.
        //add any remaining words in last.
        String ans = "";
        int i = 0 , j = 0;
        boolean turn = true;
        while(i < word1.length() && j < word2.length()){
            if(turn){
                ans += word1.charAt(i);
                i++;
                turn = false;
            }else{
                ans += word2.charAt(j);
                j++;
                turn = true ;
            }
        }

        while(i < word1.length()){
            ans+= word1.charAt(i);
            i++;
        }

        while(j < word2.length()){
            ans+= word2.charAt(j);
            j++;
        }

        return ans;
    }
}
//TC --> O(Math.max(n , m)) size of greater string.
//SC --> O(1)