class Solution {
    public int[] twoSum(int[] nums, int target) {
        //BRUTE FORCE -->
        //we can start from every ith index and search in array to find if ith + jth will add up to target or not but it will take -
        //O(N^2) Might work for this problem seeing constraints but optimally we have to do this in one pass.

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target) return new int[]{i , j};
            }
        }

        return new int[]{-1 , -1};
    }
}

//TC -->O(N^2)
//SC -->O(1)