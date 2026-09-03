class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //BRUTE FORCE 
        //run 3 nested loops to figure out 3 numbers that will be equal to target = 0.
        //TC-->O(N^2) (3*10^3)3 = 10^9 very slow won't accept.

        Arrays.sort(nums); //need to sort in order to get only unique values.
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();//to check if we already have this list.

        for(int i=0;i<nums.length;i++){
            int target = nums[i];
            target = -target;//new target if other 2 are equal to this then sum is equal to 0.
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


//TC --> O(N^2)
//SC --> O(1)