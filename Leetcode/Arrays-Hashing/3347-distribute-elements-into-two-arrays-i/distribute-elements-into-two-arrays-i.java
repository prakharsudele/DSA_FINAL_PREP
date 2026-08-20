class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(nums[0]);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }else arr2.add(nums[i]);
        }

        int i = 0;
        int[] result = new int[n];
        for(int it : arr1){
            result[i] = it;
            i++;
        }
        for(int it : arr2){
            result[i] = it;
            i++;
        }

        return result;
    }
}