class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int it : nums1) set1.add(it);
        for(int it : nums2) set2.add(it);

        int n = nums1.length , m = nums2.length;
        int x = set1.size() , y = set2.size();

        int ans = Math.min(n/2 , x);
        int rem = x - ans;
        int c = 0;
        
        for(int it : set2){
            if(!set1.contains(it))c++;
            else if (rem > 0){
                c++;
                rem--;
            }

            if(c >= m/2) break;
        }

        return ans + c;
    }
}