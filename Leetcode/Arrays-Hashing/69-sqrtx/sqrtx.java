class Solution {
    public int mySqrt(int x) {
        //Using binary search we can figure out neartest number by always reducing search space by half.
        if(x < 2) return x;
        int left = 1 , right = x/2;//define left and right

        while(left <= right){
            int mid = left + (right - left)/2;
            long sq = (long)mid*mid;//find out sqaure.

            if(sq == x) return mid;
            else if(sq < x)left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
}

//TC --> O(Logn)
//SC --> O(1)