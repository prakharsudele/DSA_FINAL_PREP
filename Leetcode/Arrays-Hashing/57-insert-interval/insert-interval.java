class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //create result array which will store prev + new interval.
        int n = intervals.length;
        int[][] ans = new int[n+1][2];

        //add all the interval before our new interval begins because they will be unaffected.
        int i=0,j=0;
        while(i < n && intervals[i][1] < newInterval[0]){
            ans[j] = intervals[i];
            i++;
            j++;
        }

        //merge overlapping intervals
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0] , intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1] , intervals[i++][1]);
        }
        ans[j++] = newInterval; //add overlapped interval.

        while(i < n){ //add leftover interval which are unaffected by new interval.
            ans[j++] = intervals[i++];
        }

        return java.util.Arrays.copyOf(ans , j);
    }
}