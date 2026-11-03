class Solution {
    public int minMoves(int[] nums) {
        int maxi = 0;
        int moves = 0;
        for(int it:nums)maxi = Math.max(maxi , it);
        for(int it:nums){
            moves += maxi - it;
        }
        return moves;
    }
}