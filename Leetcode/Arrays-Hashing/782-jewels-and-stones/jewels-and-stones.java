class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int freq[] = new int[52];
        int count = 0;

        for (char c : stones.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++; // 'a' -> index 0, 'b' -> index 1
            } else if (c >= 'A' && c <= 'Z') {
                freq[c - 'A' + 26]++; // 'A' -> index 26, 'B' -> index 27
            }
        }

        for(char c : jewels.toCharArray()) {
            if (c >= 'a' && c <= 'z'){
                count+=freq[c - 'a'];
            } else if (c >= 'A' && c <= 'Z') {
                count+=freq[c - 'A' + 26];
            }
        }

        return count;
    }
}