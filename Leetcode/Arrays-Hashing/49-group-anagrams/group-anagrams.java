class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap< String , List<String>> ans = new HashMap<>();

        for(String s : strs){
            int[] freq = new int[26];

            for(char ch : s.toCharArray()){
                freq[ch - 'a'] +=1 ;
            }

            StringBuilder sb = new StringBuilder();
            for(int num : freq){
                sb.append(num).append('#');
            }
            String key = sb.toString();
            if(!ans.containsKey(key)){
                ans.put(key , new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}