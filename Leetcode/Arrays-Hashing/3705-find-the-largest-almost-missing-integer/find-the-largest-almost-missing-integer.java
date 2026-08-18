class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int it : nums){
            map.put(it , map.getOrDefault(it , 0) + 1);
        }

        if(k == 1){
            int maxv = -1;
            for(int i=0;i<n;i++){
                if(map.get(nums[i]) == 1 && nums[i] > maxv) maxv = nums[i];
            }
            return maxv;
        }

        if(k == n){
            int maxv = -1;
            for(int i=0;i<n;i++){
                if(nums[i] > maxv) maxv = nums[i];
            }
            return maxv;
        }

        int first = nums[0] , last = nums[n-1];
        if(map.get(first) == 1 && map.get(last) == 1) return Math.max(first , last);
        if(map.get(first) == 1 && map.get(last) != 1) return first;
        else if(map.get(first) != 1 && map.get(last) == 1) return last;
        else return -1;
    }
}