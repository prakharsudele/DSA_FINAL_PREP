class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1 , -1};
        int fi = firstoccur(nums , target);
        int ls = lastoccur(nums , target);

        return new int[]{fi , ls};
    }

    private int firstoccur(int[] nums, int target){
        int i = 0 ; 
        int j = nums.length - 1;
        int ans = -1;

        while(i <= j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                ans = mid;
                j = mid - 1;
            }
            else if(nums[mid] < target){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return ans;
    }

    private int lastoccur(int[] nums, int target){
        int i = 0 ; 
        int j = nums.length - 1;
        int ans = -1;

        while(i <= j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                ans = mid;
                i = mid + 1;
            }
            else if(nums[mid] < target){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return ans;
    }
}