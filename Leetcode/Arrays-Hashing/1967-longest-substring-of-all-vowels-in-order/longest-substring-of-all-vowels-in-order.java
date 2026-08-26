class Solution {
    public int longestBeautifulSubstring(String word) {
        int left = 0;
        int length = 0;
        int vovel = 1;

        for(int i=1;i<word.length();i++){
            if(word.charAt(i) < word.charAt(i-1)){
                vovel = 1;
                left = i;
            }else if(word.charAt(i) > word.charAt(i-1)){
                vovel++;
            }

            if(vovel == 5)length = Math.max(length , i - left + 1);
        }
        return length;
    }
}