class Solution {
    public int maxProduct(int n) {
        int higest = Integer.MIN_VALUE;
        int secHigest = Integer.MAX_VALUE;
        int num = n;
        while(num > 0){
            int nu = num%10;
            if(nu > higest){
                secHigest = higest;
                higest = nu;
            }else if(nu <= higest && nu > secHigest) secHigest = Math.max(secHigest , nu);
            num/=10;
        }

        return higest*secHigest;
    }
}