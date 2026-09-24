class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //use take not take approach and choos every integer but don't move forward after take case beacuse we can use 1 number multiple times.
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        trav(ans , 0 , target , candidates , ds);
        return ans;
    }

    private void trav(List<List<Integer>> ans , int index , int target , int[] candidates ,List<Integer> ds){
        if(index >= candidates.length ||  target < 0) return;//if we have reached at end or target is less than 0 then return we can not find sol ahead.
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        //take
        ds.add(candidates[index]);
        trav(ans , index , target-candidates[index] , candidates , ds);//dont move index.
        ds.remove(ds.size() - 1);

        //not take
        trav(ans , index+1 , target , candidates , ds);
    }
}

//TC --> O(2^N)
//SC --> O(T/D) Depth of recursion.