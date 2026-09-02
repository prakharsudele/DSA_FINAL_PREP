class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //BRUTE FORCE - we can start from every ith gas and try to cover all stations whenever we are able to complete circuit that would be our answer.
        //TC --> O(N^2) = 10^10 too slow won't accept.

        int totalCost = 0 , totalGas = 0;
        for(int i=0;i<gas.length;i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }

        if(totalCost > totalGas) return -1; //if total gas used is more than what we can ever have it is not possible to loop.

        int currentGas = 0;
        int start = 0;
        for(int i=0;i<gas.length;i++){
            currentGas += gas[i] - cost[i];
            if(currentGas < 0){ // at any point if our fuel runs out then we can loop out forward.
                currentGas = 0;
                start = i+1; //start from i+1 this time as we have already covered -1 case it is always possible now if not from ith index try i+1 answer will be there 100%.
            }
        }

        return start;        
    }
}

// TC --> O(N)
// SC --> O(1)