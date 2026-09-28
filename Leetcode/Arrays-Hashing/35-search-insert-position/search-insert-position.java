class Solution {
    public int searchInsert(int[] nums, int target) {
        //simple binary search operatin on log(n) to figure out no issue as array is sorted we know which side will be greater and smaller.
        int l = 0 , r = nums.length - 1;
        while(l <= r){
            int mid = l+(r-l)/2;//middle index
            if(nums[mid] > target){
                r = mid - 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                return mid;//if found return i.
            }
        }
        return l;//it would have been on left otherwise.
    }
}