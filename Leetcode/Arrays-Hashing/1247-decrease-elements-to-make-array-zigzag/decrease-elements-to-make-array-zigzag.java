class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int n = nums.length;
        int even = 0 , odd = 0; //even and odd cost to move is zero now we will calulate it in one pass only.

        for(int i=0;i<nums.length;i++){
            if((i-1 >= 0 && nums[i-1] <= nums[i]) || (i+1 < n && nums[i+1] <= nums[i])){
             // if any of the neighbour are smaller than our curr element then we need to have some cost otherwise it's already good.
            int min = Integer.MAX_VALUE;
            
            if(i-1 >= 0) min = Math.min(min , nums[i-1]);
            if(i+1 < n) min = Math.min(min , nums[i+1]);

            int cost = nums[i] - min + 1; // cost to make current element less than it's neighbour.

            //add cost in respective even or odd index.
            if(i%2 == 0) even += cost;
            else odd += cost;
            }
        }
        return Math.min(even , odd);
    }
}