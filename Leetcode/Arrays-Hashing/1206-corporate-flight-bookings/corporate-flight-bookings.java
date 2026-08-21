class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        int total = 0;
        for(int[] book : bookings){
            int first = book[0];
            int last = book[1];
            int seat = book[2];

            for(int i=first-1;i<last;i++){
                ans[i] += seat;
            }
        }
        return ans;
    }
}