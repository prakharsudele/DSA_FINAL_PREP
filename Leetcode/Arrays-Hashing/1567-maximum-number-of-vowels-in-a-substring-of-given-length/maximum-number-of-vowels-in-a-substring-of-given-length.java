class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int maxcount = 0;
        int curr = 0;
        int i = 0;
        int j = k-1;
        for(int m=0;m<k;m++){
            if(set.contains(s.charAt(m))) curr++;
        }

        maxcount = curr;
        while(j < s.length()-1){
            if(set.contains(s.charAt(i))) curr--;
            if(set.contains(s.charAt(j+1))) curr++;
            maxcount = Math.max(maxcount , curr);
            i++;
            j++;
        }

        return maxcount;
    }
}