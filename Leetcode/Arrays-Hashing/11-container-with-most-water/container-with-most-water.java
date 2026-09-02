class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0 , j = n-1;

        int maxWater = Math.min(height[i] , height[j]) * (j-i);//let min water in between 2 farmost pointer for now

        while(i < j){
            //always move pointer with lower val toward the other
            if(height[i] < height[j]){
                i++;
                maxWater = Math.max(maxWater , Math.min(height[i] , height[j]) * (j-i));
            }else{
                j--;
                maxWater = Math.max(maxWater , Math.min(height[i] , height[j]) * (j-i));
            }
        }

        return maxWater;
    }
}

//SC --> O(N)
//TC --> O(1)