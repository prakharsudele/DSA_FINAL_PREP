class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 , j = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        int size = 0;
        while(j < s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j) , j);
                size = Math.max(size , j - i + 1);
            }else{
                while(s.charAt(i) != s.charAt(j)){
                    map.remove(s.charAt(i));
                    i++;
                }
                map.remove(s.charAt(i));
                i++;
                map.put(s.charAt(j) , j);
            }
            j++;
        }

        return size;
    }
}