class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int it:stones) pq.add(it);

        while(pq.size() > 1){
            int y = pq.poll();
            int x = pq.poll();
            if(Math.abs(x-y) != 0) pq.add(Math.abs(x-y));
        }

        if(pq.size() == 0) return 0;
        else return pq.poll();
    }
}