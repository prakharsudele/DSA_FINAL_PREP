class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) i++; //if s is in j go and check next element of s
            j++;//keep incrementing j.
        }

        return i == s.length();//if i has traversed complete string s then return true as it was on t if not return false.
    }
}