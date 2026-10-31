class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int left = 0 , right = words.length - 1;
        StringBuilder sb = new StringBuilder();

        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        for(String word : words){
            if(!word.isEmpty()){
                if(sb.length() > 0){
                    sb.append(" ");
                }
                sb.append(word);
            }
        }

        return sb.toString();
    }
}