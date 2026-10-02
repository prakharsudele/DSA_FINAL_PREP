class Solution {
    public int threeSumMulti(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        long count = 0;
        long MOD = 1_000_000_007;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            int reqSum = target - nums[i];

            while (j < k) {
                int currentSum = nums[j] + nums[k];
                if (currentSum == reqSum) {
                    // Case 1: nums[j] and nums[k] are different
                    if (nums[j] != nums[k]) {
                        long jCount = 1;
                        long kCount = 1;
                        // Count occurrences of nums[j]
                        while (j + 1 < k && nums[j] == nums[j+1]) {
                            jCount++;
                            j++;
                        }
                        // Count occurrences of nums[k]
                        while (k - 1 > j && nums[k] == nums[k-1]) {
                            kCount++;
                            k--;
                        }
                        
                        count += (jCount * kCount);
                        j++; // Move j to find new distinct number
                        k--; // Move k to find new distinct number
                    } 
                    // Case 2: nums[j] and nums[k] are the same
                    else { // nums[j] == nums[k]
                        // All elements from j to k are identical
                        long length = k - j + 1;
                        // Choose 2 elements from 'length' identical elements
                        count += (length * (length - 1)) / 2;
                        break; // All valid pairs for current i are found
                    }
                } else if (currentSum < reqSum) {
                    j++;
                } else { // currentSum > reqSum
                    k--;
                }
            }
        }
        
        return (int)(count % MOD);
    }
}