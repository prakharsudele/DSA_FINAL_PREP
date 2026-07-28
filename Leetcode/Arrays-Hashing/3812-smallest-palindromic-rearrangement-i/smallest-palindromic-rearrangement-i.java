class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        char c = 'a';
        int[] arr = new int[n];
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i] > 0){
                if(freq[i]%2==0){
                    int f = freq[i]/2;
                    while(f > 0){
                        sb.append((char)(i+'a'));
                        f--;
                    }
                }else{
                    flag = true;
                    c = (char)(i+'a');
                    int f = (freq[i] - 1)/2 ;
                    while(f > 0){
                        sb.append((char)(i+'a'));
                        f--;
                    }
                }
            }
        }
        String st = sb.toString();
        String right = new StringBuilder(sb).reverse().toString();
        if(flag){
            st+=c;
            st+=right;
        }else{
            st+=right;
        }
        return st;

    }
}