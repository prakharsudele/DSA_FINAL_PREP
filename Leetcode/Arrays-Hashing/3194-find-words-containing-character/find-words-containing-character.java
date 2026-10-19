class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String now = words[i];
            int j = 0;
            while(j < now.length()){
                if(now.charAt(j) == x){
                    ans.add(i);
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}