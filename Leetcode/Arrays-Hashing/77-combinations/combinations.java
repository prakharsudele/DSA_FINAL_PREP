class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        comb(n , k , ans  , 1 , curr);
        return ans;
    }

    private void comb(int n , int k , List<List<Integer>> ans , int index , List<Integer> curr){
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index;i<=n;i++){
            curr.add(i);
            comb(n , k , ans  , i+1 , curr);
            curr.remove(curr.size() - 1);
        }
    }
}