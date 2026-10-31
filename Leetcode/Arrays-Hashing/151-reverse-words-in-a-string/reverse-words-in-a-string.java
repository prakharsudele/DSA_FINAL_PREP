class Solution {
    public String reverseWords(String s) {
        //split words in array and reverse the array then combine all words.
        //use stringBuilder to combine as it's mutable you can add and delete directly string is immutabe that means it creates new object everytime you add something.
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
            if(!word.isEmpty()){//check for " " in starting
                if(sb.length() > 0){
                    sb.append(" ");
                }
                sb.append(word);
            }
        }

        return sb.toString();
    }
}

//TC --> O(N)
//SC --> O(1)