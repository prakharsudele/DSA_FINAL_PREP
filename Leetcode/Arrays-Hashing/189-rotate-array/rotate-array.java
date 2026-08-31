class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        //value of k is very large and multiple k means the same things so instead take a mod;
        k = k%n;
        rotate(0 , n-k-1 , nums);
        rotate(n-k , n-1 , nums);
        rotate(0 , n-1 , nums);
    }

    //rotate from i to j
    private void rotate(int st , int en , int[] nums){
        while(st < en){
            int temp = nums[st];
            nums[st] = nums[en];
            nums[en] = temp;

            st++;
            en--;
        }
    }
}

//TC --> O(3N) = O(N)
// SC --> O(1)