class Solution {
    public int totalFruit(int[] fruits) {
        //Dynamic sliding window maintain hashmap and window and expand shrink acc to conditions also update maxl.
        int i = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxl = 0;

        for(int j=0;j<fruits.length;j++){
            map.put(fruits[j] , map.getOrDefault(fruits[j] , 0) + 1);

            while(map.size() > 2){
                int key = map.get(fruits[i]);
                if(key > 1){
                    map.put(fruits[i] , key-1);
                }else{
                    map.remove(fruits[i]);
                }
                i++;
            }

            maxl =Math.max(maxl , j-i+1);

        }

        return maxl;
    }
}

//TC --> O(N)
//SC --> O(1)