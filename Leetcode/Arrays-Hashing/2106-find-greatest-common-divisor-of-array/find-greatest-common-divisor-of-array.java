class Solution {
    public int findGCD(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int it : nums){
            mini = Math.min(mini , it);
            maxi = Math.max(maxi , it);
        }

        return gcd(mini , maxi);
    }

    public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}   
}