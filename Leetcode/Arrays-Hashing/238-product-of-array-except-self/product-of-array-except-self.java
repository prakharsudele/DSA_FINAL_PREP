class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute force could be check for every element TC --> O(N^2) SC --> O(1)

        boolean zero = false;
        int count = 0;
        int prod = 1;
        for(int it : nums){
            if(it == 0){
                zero = true;
                count++;
            }
            else prod *= it;
        }

        for(int i=0;i<nums.length;i++){
            int produ = prod;
            if(zero){
                if(nums[i]!=0 || count>1) nums[i] = 0;
                else if(nums[i] == 0 && count<=1) nums[i] = produ;
            }else nums[i] = produ/nums[i];
        }

        return nums;
    }
}