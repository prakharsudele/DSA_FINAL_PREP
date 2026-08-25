class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        int to_find = k;


                
                for( int i=index;i<nums.length ;i++)
                {
                    if(nums[i]==to_find)
                    {
                       to_find+=k;
                    }
                    else if(nums[i] > to_find)
                    {
                        return to_find;
                    }
                }
            

        return to_find;
    }
}