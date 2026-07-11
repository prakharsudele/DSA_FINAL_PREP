class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(nums[i])) return new int[]{map.get(nums[i]) , i};
            map.put(target - nums[i] , i);
        }

        return new int[]{};
    }
}