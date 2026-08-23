class Solution {
    public boolean sumGame(String num) {
        int firstSum = 0;
        int secondSum = 0;
        int firstq = 0;
        int secondq = 0;
        int n = num.length();
        int i = 0;

        for(char ch : num.toCharArray()){
            if(ch == '?'){
                if(i < n/2) firstq++;
                else secondq++;
            }else{
                if(i < n/2) firstSum+= ch - '0';
                else secondSum += ch - '0';
            }
            i++;
        }
        return (firstSum - secondSum) * 2 != (secondq - firstq) * 9;
    }
}