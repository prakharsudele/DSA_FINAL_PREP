class Solution {
    public int search(int[] nums, int target) {
        //writing lon(n) algo means binary search now apply bs normally but with conditons using nums , mid and target.
        //check if right part is sorted or left part is sorted if left is sorted check if target can be in left part if yes move right pointer otherwise left pointer.
        //do same check for right part.
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target) return mid;
            //left part sorted
            else if(nums[mid] >= nums[0]){
                if((nums[0] <= target && target < nums[mid])) right = mid - 1;//target here
                else left = mid + 1;//target in non sorted region
            //right part sorted
            }else{
                if((nums[mid] < target && target <= nums[nums.length-1])) left = mid + 1;//target here
                else right = mid - 1;//target in non sorted region.
            }
        }

        return -1;//if index not found return -1 as target is not there in nums
    }
}

//TC --> O(log(n))
//SC --> O(1)