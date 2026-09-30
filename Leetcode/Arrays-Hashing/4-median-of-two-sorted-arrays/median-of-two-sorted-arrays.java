class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = 0;
        int[] result = new int[n+m];

        int i = 0 , j = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                result[k] = nums1[i];
                i++;
                k++;
            }else if(nums2[j] < nums1[i]){
                result[k] = nums2[j];
                j++;
                k++;
            }else{
                result[k] = nums1[i];
                k++;
                i++;
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
        
        if(i < n){
            for(int x = i ; x<n ; x++){
                result[k] = nums1[x];
                k++;
            }
        }else if(j < m){
            for(int x = j ; x<m ; x++){
                result[k] = nums2[x];
                k++;
            }
        }

        int l = result.length;
        if(l%2==0){
            double sum = result[l/2] + result[(l/2) - 1];
            return sum/2.0;
        }else{
            double ans = result[l/2];
            return ans;
        }
    }
}