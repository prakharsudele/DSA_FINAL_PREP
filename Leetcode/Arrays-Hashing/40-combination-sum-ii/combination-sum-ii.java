class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        recur(0 ,ans , ds , target , candidates);
        return ans;
    }

    private void recur(int index , List<List<Integer>> ans , List<Integer> ds , int target , int[] candidates){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            ds.add(candidates[i]);
            recur(i+1 , ans , ds , target-candidates[i] , candidates);
            ds.remove(ds.size() - 1);
        }
    }
}