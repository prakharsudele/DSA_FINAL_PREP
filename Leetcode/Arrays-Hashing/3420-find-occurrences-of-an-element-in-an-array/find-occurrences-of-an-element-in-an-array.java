class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                ls.add(i);
            }
        }

        int i = 0;
        int[] ans = new int[queries.length];
        for(int it : queries){
            if(it > ls.size()) ans[i] = -1;
            else ans[i] = ls.get(it-1);

            i++;
        }

        return ans;
    }
}