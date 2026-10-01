class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        //make 2d array to store captial as well it's profit together to make things easy and clean.
        //sort array by capital needed to start it and define maxHeap , loop through all projects if capital is less than equal to wealth add it's profit in pq.
        int n = capital.length;
        int[][] projects = new int[n][2];
        for(int i=0;i<n;i++){
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }

        Arrays.sort(projects , (a,b) -> Integer.compare(a[0] , b[0]));//sort by captial
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(k --> 0){
            while(i < n && projects[i][0] <= w){
                pq.offer(projects[i][1]);
                i++;
            }
            if(pq.isEmpty()) break;
            w += pq.poll();
        }
        return w;
    }
}