class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int it:nums){
            set.add(it);
            max = Math.max(max , it);
            min = Math.min(it , min);
        }

        for(int i=min;i<max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}