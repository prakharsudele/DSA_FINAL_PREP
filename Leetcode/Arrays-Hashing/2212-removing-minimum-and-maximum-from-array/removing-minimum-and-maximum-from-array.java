class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mini = 0;
        int max = Integer.MIN_VALUE;
        int maxi = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] < nums[mini]){
                mini = i;
                min = nums[i];
            }

            if(nums[i] > nums[maxi]){
                maxi = i;
                max = nums[i];
            }
        }

        int arr[] = new int[2];
        if(mini < maxi){
            arr[0] = mini;
            arr[1] = maxi;
        }else{
            arr[0] = maxi;
            arr[1] = mini;
        }

        int front = arr[1] + 1;
        int back = nums.length - arr[0];
        int both = arr[0] + (nums.length - arr[1]) + 1;

        int both1 = Math.min(front , back);
        return Math.min(both , both1);
    }
}