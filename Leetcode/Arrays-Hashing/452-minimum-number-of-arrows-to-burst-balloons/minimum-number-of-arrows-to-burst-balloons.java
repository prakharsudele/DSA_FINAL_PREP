class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1] , b[1])); //sort array on end value
        int count = 1;
        int start = points[0][1];//start here with arrow count 1.

        for(int i=1;i<points.length;i++){
            if(points[i][0] <= start) continue; //if one of it;s element is already in interval leave this index and continue.

            start = points[i][1];
            count++;
        }
        return count;
    }
}

//TC --> O(N)
//SC --> O(1)