class Solution {
    public int maxDepth(String s) {
        //everytime you encounter opening bracker add it in count and update maximum , when encounter close bracket decrement count by 1.
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
                max = Math.max(max , count);
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
        }
        if(max < 0)
        {
            return 0;
        }
        else
        {
            return max;
        }
    }
}

//TC --> O(N)
//SC --> O(1)