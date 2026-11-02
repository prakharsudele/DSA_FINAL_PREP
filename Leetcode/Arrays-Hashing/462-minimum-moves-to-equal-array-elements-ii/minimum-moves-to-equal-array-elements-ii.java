class Solution {
    public int minMoves2(int[] nums) {
        int count = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int num = nums[n/2];

        for(int it : nums){
            count+=Math.abs(it - num);
        }
        return count;
    }
}