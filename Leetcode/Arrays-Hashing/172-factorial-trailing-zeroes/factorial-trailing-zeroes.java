class Solution {
    public int trailingZeroes(int n) {
        //trailing zero are formed by multiplication of 2 and 5 , there are always too mach 2's hence we will find 5's and that would be our answer.
        int ans = 0;
        while(n > 0){
            n /= 5;//divide n by 5.
            ans += n;//add result in answer;
        }
        return ans;
    }
}

//TC --> O(logn);base to 5.
//SC --> O(1)