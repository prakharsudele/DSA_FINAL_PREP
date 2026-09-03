class Solution {
    public int lengthOfLongestSubstring(String s) {
        //BRUTE FORCE SOLUTION 
        //star from every ith character and go until anyone start to repeat then start from i +1 create an hashmap to check repeitatiion.
        //TC-->O(N^2)
        //SC -->O(N)

        HashMap<Character , Integer> map = new HashMap<>();
        int maxLength = 0;
        int i=0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i , map.get(s.charAt(j)) + 1);
            }

            map.put(s.charAt(j) , j);
            maxLength = Math.max(maxLength , j-i+1);
        }
        return maxLength;
    }
}