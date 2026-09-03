class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = Integer.MAX_VALUE;
        for(int it : nums1) if(it%2!=0)odd = Math.min(odd , it);

        if(odd == Integer.MAX_VALUE) return true;

        for(int it : nums1)if(it%2==0 && it <= odd) return false;
        return true;
    }
}