class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int max = 0;
        int i=0;
        for(int j=0;j<s.length();j++){
            map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) ,0) + 1);
            if(map.get(s.charAt(j)) > 2){
                while(map.get(s.charAt(j)) > 2 && i<j){
                    map.put(s.charAt(i) , map.get(s.charAt(i)) - 1);
                    i++;
                }
            }else{
                max = Math.max(max , j-i+1);
            }
        }
        return max;
    }
}