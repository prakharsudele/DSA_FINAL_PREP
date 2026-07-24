class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        subset(ans , ds , 0 , nums);
        return ans;
    }

    private void subset(List<List<Integer>> ans , List<Integer> ds , int index , int[] nums){
        if(index == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        //take 
        ds.add(nums[index]);
        subset(ans , ds , index+1 , nums);
        ds.remove(ds.size()-1);

        //not take
        subset(ans , ds , index+1 , nums);
    }
}