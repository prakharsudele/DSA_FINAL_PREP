class Solution {
    public int lengthOfLongestSubstring(String s) {
        //BRUTE FORCE SOLUTION 
        //star from every ith character and go until anyone start to repeat then start from i +1 create an hashmap to check repeitatiion.
        //TC-->O(N^2)
        //SC -->O(N)

        //OPTIMAL SOLUTION 
        //loop in one pass and keep checking if this character is not already in our map if it is then simply take shrink our window take it to last time we saw this index + 1.
        //keep in mind to not traceback so take max of already where we are and index+1.

        HashMap<Character , Integer> map = new HashMap<>();
        int maxLength = 0;
        int i=0;
        for(int j=0;j<s.length();j++){//expand window
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i , map.get(s.charAt(j)) + 1); //shrink window
            }

            map.put(s.charAt(j) , j); 
            maxLength = Math.max(maxLength , j-i+1);
        }
        return maxLength;
    }
}

//TC --> O(N)
//SC --> O(N)