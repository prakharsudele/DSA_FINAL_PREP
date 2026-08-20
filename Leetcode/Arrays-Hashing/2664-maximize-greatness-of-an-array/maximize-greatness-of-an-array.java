class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int it : nums){
            if(it > nums[count]) count++;
        }
        return count;
    }
}