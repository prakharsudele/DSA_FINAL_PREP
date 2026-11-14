class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        int maxl = 0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                while(map.containsKey(s.charAt(j))){
                    map.remove(s.charAt(i));
                    i++;
                }
            }
            map.put(s.charAt(j) , j);
            maxl = Math.max(maxl , j-i+1);
        }

        return maxl;
    }
}