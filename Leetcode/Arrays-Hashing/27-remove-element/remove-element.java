class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int it : nums) if(it == val) count++;

        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }

        return nums.length - count;
    }
}