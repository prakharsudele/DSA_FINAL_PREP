class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        HashSet<Character> set = new HashSet<>();
        for(char ch : word.toCharArray()){
            set.add(ch);
            freq[ch - 'a']++;
        }

        int ans = 0;
        int count = 0;
        int cross = set.size();
        Arrays.sort(freq);
        if(cross <= 8){
            for(int i=25 ;i>=0;i--){
                if(freq[i]!=0) ans+=freq[i];
            }
        }else if(cross <= 16){
            for(int i=25 ;i>=0;i--){
                if(freq[i]!=0 && count<8){
                    ans+=freq[i];
                    count++;
                }else if(freq[i] != 0){
                    ans+=freq[i]*2;
                    count++;
                }
            }
        }else if(cross<= 24){
            for(int i=25 ;i>=0;i--){
                if(freq[i]!=0 && count<8){
                    ans+=freq[i];
                    count++;
                }else if(freq[i] != 0 && count<16){
                    ans+=freq[i]*2;
                    count++;
                }else if(freq[i] != 0){
                    ans+=freq[i]*3;
                    count++;
                }
            }
        }else{
            for(int i=25 ;i>=0;i--){
                if(freq[i]!=0 && count<8){
                    ans+=freq[i];
                    count++;
                }else if(freq[i] != 0 && count<16){
                    ans+=freq[i]*2;
                    count++;
                }else if(freq[i] != 0 && count<24){
                    ans+=freq[i]*3;
                    count++;
                }else if(freq[i]!=0){
                    ans+=freq[i]*4;
                    count++;
                }
            }
        }
        return ans;
    }
}