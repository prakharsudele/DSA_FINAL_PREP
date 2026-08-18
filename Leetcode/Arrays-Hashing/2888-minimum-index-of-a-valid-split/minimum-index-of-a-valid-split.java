class Solution {
    public int minimumIndex(List<Integer> nums) {
        int overallmax = -1;
        int count = 0;
        for (int it : nums) {
            if (count == 0) {
                overallmax = it;
                count++;
            } else if (it == overallmax)
                count++;
            else
                count--;
        }

        int totalCount = 0;

        for (int x : nums) {
            if (x == overallmax)
                totalCount++;
        }

        int currcount = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == overallmax)
                currcount++;

            int rightCount = totalCount - currcount;

            if (currcount > (i + 1) / 2 &&
                    rightCount > (nums.size() - i - 1) / 2) {
                return i;
            }
        }
        return -1;
    }
}