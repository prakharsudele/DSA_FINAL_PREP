class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute force could be check for every element TC --> O(N^2) SC --> O(1)

        //optimal solution is firgure out the complete mul of numns ans divide by nums[i] in every turn 
        // EDGE CASE : nums[i] == 0 zero division not defined if array contains more than 1 zero ans will always be 0 if less than 1 or equalt o 1 check if curr is zero or not
        

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

//SC --> O(N)
//TC --> O(1) as we are updating nums itself.