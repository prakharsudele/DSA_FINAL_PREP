class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        HashMap<Character , String> map1 = new HashMap<>();
        HashMap<String , Character> map2 = new HashMap<>();
        int i = 0;
        for(char ch : pattern.toCharArray()){
            if(map1.containsKey(ch) && !map1.get(ch).equals(words[i])){
                return false;
            }

            if(map2.containsKey(words[i]) && !map2.get(words[i]).equals(ch)){
                return false;
            }

            map1.put(ch , words[i]);
            map2.put(words[i] , ch);
            i++;
        }
        return true;
    }
}