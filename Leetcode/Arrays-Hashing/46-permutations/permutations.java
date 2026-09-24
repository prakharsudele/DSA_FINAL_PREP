class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        perm(ans , ds , nums);
        return ans;
    }

    private void perm(List<List<Integer>> ans , List<Integer> ds , int[] nums){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }else{ //run a for loop to fill all places of permutation.
            for(int i=0;i<nums.length;i++){
                if(ds.contains(nums[i])) continue;//if already exist move on.
                ds.add(nums[i]);//otherwis add it in ds.
                perm(ans , ds , nums);
                ds.remove(ds.size() - 1);//remove while coming back.
            }
        }
    }
}


//TC --> O(N!)
//SC --> O(N)