class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int[] nums = new int[n];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[i];
        }

        int rank = 1;
        Arrays.sort(nums);

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x : nums){
            if(!map.containsKey(x)){
                map.put(x, rank);
                rank++;
            }
        }

        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}