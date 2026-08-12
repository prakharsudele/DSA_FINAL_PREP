class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int max = 0;
        int i = 0 , j = 0;
        while(j < nums.length){
            map.put(nums[j] , map.getOrDefault(nums[j] , 0) + 1);
            int currmax = map.get(nums[j]);
            if(currmax <= k){
                max = Math.max(max , j-i+1);
            }else{
                while(map.get(nums[j]) > k && i<j){
                    map.put(nums[i] , map.get(nums[i]) - 1);
                    if(map.get(nums[i]) == 0) map.remove(nums[i]);
                    i++;
                }
            }
            j++;
        }
        return max;
    }
}