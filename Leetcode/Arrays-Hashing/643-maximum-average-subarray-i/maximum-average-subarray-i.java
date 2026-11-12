class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currsum = 0;
        double avg = Double.NEGATIVE_INFINITY;//very large negative value.
        int i;
        for(i=0;i<k;i++) currsum+= nums[i]; //first k window.
        avg = Math.max(avg , (double)currsum/k);

        while(i < nums.length){
            currsum -= nums[i-k];//remove the first element of window.
            currsum += nums[i];//add the next element of the window.
            avg = Math.max(avg , (double)currsum/k);//take avg
            i++;
        }

        return avg;
    }
}