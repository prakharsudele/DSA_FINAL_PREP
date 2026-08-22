class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int num = n;
        while(num > 0){
            int dig = num%10;
            sum+=dig;
            pro*=dig;
            num/=10;
        }
        int sums = sum+pro;
        if(n%sums == 0)return true;
        else return false;
    }
}