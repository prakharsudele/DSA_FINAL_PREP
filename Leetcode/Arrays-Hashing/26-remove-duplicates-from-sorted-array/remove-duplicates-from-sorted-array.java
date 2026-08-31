class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = -10000;
        int index = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != curr){
                nums[index] = nums[i];
                curr = nums[i];
                index++;
            }

            if(curr == -10000) curr = nums[i]; 
        }
        return index;
    }
}