class Solution {
    public int[] searchRange(int[] nums, int target) {
        //get first occurence firsr then last occurence to get first occurece whenever found target store it as potensial answer and move right to mid - 1 for more potensial answers.

        //same do for right par move left pointer for more potensial answer
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[2];
        int fo = Integer.MAX_VALUE;
        int lo = Integer.MIN_VALUE;

        //first occurence
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                fo = Math.min(fo , mid);
                right = mid - 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        left = 0;
        right = n-1;
        
        //last occurence
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                lo = Math.max(lo , mid);
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        if(fo != Integer.MAX_VALUE || lo != Integer.MIN_VALUE){
            ans[0] = fo;
            ans[1] = lo;
            return ans;
        }

        return new int[]{-1 , -1};
        
    }
}