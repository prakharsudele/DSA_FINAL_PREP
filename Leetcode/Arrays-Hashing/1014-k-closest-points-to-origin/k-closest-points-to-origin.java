class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
        int ans[][] = new int[k][2];
        
        for(int[] p : points){
            pq.offer(p);
            if(pq.size() > k) pq.poll();
        }

        int i=0;
        while(i < k){
            ans[i] = pq.poll();
            i++;
        }
        return ans;
    }
}