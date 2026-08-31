class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = -10000; // OUT OF THE RANGE
        int index = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != curr){ // NEW ELEMENT
                nums[index] = nums[i];
                curr = nums[i];
                index++;
            }

            if(curr == -10000) curr = nums[i]; //UPDATE CURR FIRST TIME
        }
        return index;
    }
}

//TC -->  O(N)
// SC --> O(1)