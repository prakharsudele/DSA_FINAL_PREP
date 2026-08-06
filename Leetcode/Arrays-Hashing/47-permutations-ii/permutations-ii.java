class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        recur(ans , ds , set , nums , visited);
        return ans;
    }

    private void recur(List<List<Integer>> ans , List<Integer> ds , HashSet<List<Integer>> set , int[] nums , boolean[] visited){
        if(ds.size() == nums.length && !set.contains(ds)){
            set.add(ds);
            ans.add(new ArrayList<>(ds));
        }

        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            else{
                visited[i] = true;
                ds.add(nums[i]);
                recur(ans , ds , set , nums , visited);
                ds.remove(ds.size() - 1);
                visited[i] = false;
            }
        }
    }
}