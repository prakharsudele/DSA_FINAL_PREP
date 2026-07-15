class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int i=0 , j = 0 , length = 0;

        while(j < nums.length){
            map.put(nums[j] , map.getOrDefault(nums[j] , 0) + 1);
            if(map.size() < 3){
                length = Math.max(length , j-i+1);
                j++;
            }
            else{
                while(map.size() >= 3){
                    map.put(nums[i] , map.get(nums[i]) - 1);
                    if(map.get(nums[i]) == 0) map.remove(nums[i]);
                    i++;
                }
                length = Math.max(length , j-i+1);
                j++;
            }
        }

        return length;
    }
}