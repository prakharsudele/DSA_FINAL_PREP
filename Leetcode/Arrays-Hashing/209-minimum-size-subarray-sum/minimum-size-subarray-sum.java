class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0 , currsum = 0 , length = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ;i ++){
            currsum+=nums[i];
            while(currsum >= target){
                length = Math.min(length , i-j+1);
                currsum-=nums[j];
                j++;
            }    
        }
        
        if(length == Integer.MAX_VALUE) return 0;
        else return length;
    }
}