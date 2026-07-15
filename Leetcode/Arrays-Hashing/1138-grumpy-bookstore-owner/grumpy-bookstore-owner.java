class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int count = 0;
        int ans = 0;
        int currsum = 0;
        int sum = 0;

        for(int i=0;i<grumpy.length ; i++){
            if(grumpy[i] == 0) sum+=customers[i];
        }

        for(int i=0;i<minutes;i++){
            if(grumpy[i] == 1){
                currsum += customers[i];
            }
        }
        if(currsum > ans){
            ans = currsum;
        }

        int i = 0 , j = minutes-1;
        while(j < grumpy.length-1){
            if(grumpy[i] == 1) currsum-=customers[i];
            if(grumpy[j+1] == 1) currsum+=customers[j+1];

            ans = Math.max(ans , currsum);

            i++;
            j++;
        }

        return sum + ans;
    }
}