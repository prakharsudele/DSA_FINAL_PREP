class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int l = 0 , r = maxSum , result = 1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(isValid(n , index , maxSum , mid)){
                l = mid+1;
                result = mid;
            }else{
                r = mid - 1;
            }
        }
        return result;
    }

    private boolean isValid(int n, int index, int maxSum , int mid){
        long left = 0 , right = 0;

        if(mid > index){
            long first = mid - index;
            long last = mid - 1;
            left = (first+last)*index/2;
        }else{
            long ones = index - (mid -1);
            left = (long)mid * (mid-1)/2 + ones;
        }

        int rightcount = n - index - 1;
        if(mid > rightcount){
            long first = mid - 1;
            long last = mid - rightcount;
            right = (first + last) * rightcount/2;
        }else{
            long ones = rightcount - (mid-1);
            right = (long)mid * (mid-1)/2 + ones;
        }

        return left + mid + right <= maxSum;
    }
}