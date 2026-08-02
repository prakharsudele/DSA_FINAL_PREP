class Solution {
    public int maximumWidth(int[] planks) {
        Map<Integer , Integer> count = new HashMap<>();
        Map<Integer , Integer> ans = new HashMap<>();

        for(int it : planks){
            count.put(it , count.getOrDefault(it , 0) + 1);
            ans.put(it , ans.getOrDefault(it , 0) + 1);
        }

        for(int a : count.keySet()){
            for(int b : count.keySet()){
                if(a < b){
                    ans.put(a+b , ans.getOrDefault(a+b , 0) + Math.min(count.get(a) , count.get(b)));
                }else if(a == b){
                    ans.put(a+b , ans.getOrDefault(a+b , 0) + count.get(a)/2);
                }
            }
        }
        int maxVal = 0;
        for(int v : ans.values()){
            maxVal = Math.max(maxVal , v);
        }

        return maxVal;
    }
}