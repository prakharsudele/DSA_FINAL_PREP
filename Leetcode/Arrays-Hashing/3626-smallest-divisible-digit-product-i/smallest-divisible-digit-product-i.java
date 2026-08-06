class Solution {
    public int smallestNumber(int n, int t) {
        boolean flag = false;
        while(!flag){
            int curr = n;
            int mul = 1;
            while(curr > 0){
                mul *= curr%10;
                curr/=10;
            }
            if(mul%t == 0){
                flag = true;
                return n;
            }else n++;
        }
        return -1;
    }
}