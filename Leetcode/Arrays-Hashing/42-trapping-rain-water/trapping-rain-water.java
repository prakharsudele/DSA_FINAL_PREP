class Solution {
    public int trap(int[] height) {
        //BRUTE FORCE 
        //for every height i we will find left greatest heght and right greatest height we will take minimum of those if it is greater and subtract the height of ith bar if greater than 0 we will add it in our answer.


        //maybe we can make prefix and suffix array which will store next and prev max of all numbers.
        //simpley then run a loop get leftmax and rightmax subtract building from it if val is greater than 0 add it in our ans.

        int n = height.length;
        int[] prevs = new int[n];
        prevs[0] = -1;
        int prev = height[0];
        int ans = 0;
        for(int i=1;i<n;i++){
            if(height[i] > prev){
                prevs[i] = -1;
                prev = height[i];
            }else{
                prevs[i] = prev;
            }
        }

        int[] nexts = new int[n];
        nexts[n-1] = -1;
        int next = height[n-1];
        for(int i=n-1;i>=0;i--){
            if(height[i] > next){
                nexts[i] = -1;
                next = height[i];
            }else{
                nexts[i] = next;
            }
        }

        for(int i=0;i<height.length;i++){
            int left = prevs[i];
            int right = nexts[i];

            int val = Math.min(left , right) - height[i];
            if(val > 0) ans+=val;
        }

        return ans;
    }

    // private int leftHeight(int[] height , int index){
    //     int maxHeight = -1;
    //     for(int i=index-1;i>=0;i--){
    //         maxHeight = Math.max(maxHeight , height[i]);
    //     }
    //     return maxHeight;
    // }

    // private int rightHeight(int[] height , int index){
    //     int maxHeight = -1;
    //     for(int i=index+1;i<height.length;i++){
    //         maxHeight = Math.max(maxHeight , height[i]);
    //     }
    //     return maxHeight;
    // }
}


//TC --> O(N^2)
//SC --> O