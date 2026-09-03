class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //BRUTE FORCE 
        //run 3 nested loops to figure out 3 numbers that will be equal to target = 0.
        //TC-->O(N^2) (3*10^3)3 = 10^9 very slow won't accept.

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int target = nums[i];
            target = -target;
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                if(map.containsKey(nums[j]) && !set.contains(Arrays.asList(nums[i] , target-nums[j] , nums[j]))){
                    ans.add(Arrays.asList(nums[i] , target-nums[j] , nums[j]));
                    set.add(Arrays.asList(nums[i] , target-nums[j] , nums[j]));
                }
                map.put(target - nums[j] , j);
            }
        }


        return ans;
    }
}