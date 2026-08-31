class Solution {
    public int majorityElement(int[] nums) {
        //brute force 
        //create an hashmap and update all the values in it.
        //traverse the map whatever is val > n/2 we will return it.


        //optimal
        int curr = -1;
        int count = 0; 
        for(int it : nums){
            if(count == 0) curr = it;
            if(it != curr) count--;
            else count++;
        }

        return curr;
    }
}