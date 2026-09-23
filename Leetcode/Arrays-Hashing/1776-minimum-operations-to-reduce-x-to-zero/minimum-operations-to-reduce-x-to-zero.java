class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);
        int total = 0;
        for(int i=0;i<n;i++){
            total += nums[i];
            map.put(total , i);
        }

        if(total < x) return -1;

        int rest = total - x;
        int longest = Integer.MIN_VALUE;
        total = 0;
        for(int i=0;i<n;i++){
            total+=nums[i];
            if(map.containsKey(total - rest)) longest = Math.max(longest , i - map.get(total - rest));
        }

        return longest == Integer.MIN_VALUE ? -1 : n - longest;
    }
}