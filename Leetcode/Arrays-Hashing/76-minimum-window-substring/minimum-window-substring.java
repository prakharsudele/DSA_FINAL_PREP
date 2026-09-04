class Solution {
    public String minWindow(String s, String t) {
        String ans = "";
        int minL = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int i = 0, j = 0;
        int formed = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                // This occurrence satisfies a required character
                if (window.get(ch) <= map.get(ch)) {
                    formed++;
                }
            }
            while (formed == t.length()) {

                if (j - i + 1 < minL) {
                    minL = j - i + 1;
                    ans = s.substring(i, j + 1);
                }
                char remove = s.charAt(i);
                if (map.containsKey(remove)) {
                    if (window.get(remove) <= map.get(remove)) {
                        formed--;
                    }
                    window.put(remove, window.get(remove) - 1);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}