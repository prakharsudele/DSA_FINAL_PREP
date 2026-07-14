class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int i = 0 ;
        int j = k-1;
        int sum = 0;
        for(int m = 0 ; m < k ; m++){
            sum+=arr[m];
        }
        int avg = sum/k;
        int count = 0;
        if(avg >= threshold) count++;

        while(j < arr.length - 1){
            sum-=arr[i];
            sum+=arr[j+1];
            int avgn = sum/k;
            if(avgn >= threshold) count++;

            i++;
            j++;
        }

        return count;
    }
}