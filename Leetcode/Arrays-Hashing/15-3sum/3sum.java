class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //BRUTE FORCE 
        //run 3 nested loops to figure out 3 numbers that will be equal to target = 0.
        //TC-->O(N^3) (3*10^3)3 = 10^9 very slow won't accept.

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);//need to sort in order to get only unique values. (if sorted then question turns into 2sum with sorted array no need of hashmap and hashset)

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) { //skip duplicates
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j-1] && j < k) {//skip duplicates
                        j++;
                    }
                }
            }
        }
        return res;
    }
}


//TC --> O(N^2)
//SC --> O(N)