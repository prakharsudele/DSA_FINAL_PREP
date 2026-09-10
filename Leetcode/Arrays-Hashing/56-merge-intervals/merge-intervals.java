class Solution {
    public int[][] merge(int[][] A) {
        int n = A.length;
        Arrays.sort(A , (a,b) -> Integer.compare(a[0] , b[0]));//sort by starting value
        List<List<Integer>> ans = new ArrayList<>();
        int startNow = A[0][0];
        int endNow = A[0][1];
        for(int i=1;i<n;i++){
            int startNext = A[i][0];
            int endNext = A[i][1];

            if(endNow >= startNext){ // if overlap
                endNow = Math.max(endNow , endNext);
            }else{ //no overlap simply add in list
                ans.add(Arrays.asList(startNow, endNow));
                startNow = startNext;
                endNow = endNext;
            }
        }

        ans.add(Arrays.asList(startNow , endNow));//last timeline inserted.

        int[][] result = new int[ans.size()][2];//covert it in array from list.

        for(int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
}

//TC --> O(nlogn)
//SC --> O(1)