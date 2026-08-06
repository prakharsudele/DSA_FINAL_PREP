class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds =  new ArrayList<>();

        find(ans , ds , 0 , nums);
        return ans;
    }
    private void find(List<List<Integer>> ans , List<Integer> ds , int index , int[] nums){
        //base case (when go back)
        if(index == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        //choose this element 
        ds.add(nums[index]);
        find(ans , ds, index+1 , nums);

        //don't choose this element
        ds.remove(ds.size() - 1);
        find(ans , ds , index+1 , nums); 
    }
}