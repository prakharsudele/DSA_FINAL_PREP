class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int it:nums)map.put(it , map.getOrDefault(it,0)+1);
        int curr = 0;
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k) pq.poll();
        }

        int i=0;
        while(i < k){
            Map.Entry<Integer , Integer> entry = pq.poll();
            ans[i] = entry.getKey();
            i++;
        }
        return ans;
    }
}