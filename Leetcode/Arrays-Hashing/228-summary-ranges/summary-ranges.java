class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        int start = 0 , end = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] == 1) end++;
            else{
                if(start!= end){
                    String adds = Integer.toString(nums[start]);
                    String adde = Integer.toString(nums[end]);
                    String temp = adds + "->" + adde;

                    ans.add(temp);
                }else{
                    String adds = Integer.toString(nums[start]);
                    ans.add(adds);
                }

                start = i;
                end = i;
            }
        }

        if (start != end) {
            ans.add(nums[start] + "->" + nums[end]);
        } else {
            ans.add(Integer.toString(nums[start]));
        }
        return ans;
    }
}