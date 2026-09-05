class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        boolean[] arr = new boolean[n+1];

        for(int it : nums){
            arr[it] = true;
        }

        for(int i=1;i<=n;i++){
            if(!arr[i]) ans.add(i);
        }
        return ans;
    }
}