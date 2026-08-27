class Solution {
    public int numSpecialEquivGroups(String[] words) {
        int n = words.length;
        boolean[] done = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (done[i]) continue;
            String now = words[i];
            HashMap<Character, Integer> mapO = new HashMap<>();
            HashMap<Character, Integer> mapE = new HashMap<>();
            for (int k = 0; k < now.length(); k++) {
                if (k % 2 == 0)mapE.put(now.charAt(k), mapE.getOrDefault(now.charAt(k), 0) + 1);
                else mapO.put(now.charAt(k), mapO.getOrDefault(now.charAt(k), 0) + 1);
            }
            for (int j = i + 1; j < n; j++) {
                String cur = words[j];
                HashMap<Character, Integer> mapCO = new HashMap<>();
                HashMap<Character, Integer> mapCE = new HashMap<>();
                for (int m = 0; m < cur.length(); m++) {
                    if (m % 2 == 0) mapCE.put(cur.charAt(m), mapCE.getOrDefault(cur.charAt(m), 0) + 1);
                    else mapCO.put(cur.charAt(m), mapCO.getOrDefault(cur.charAt(m), 0) + 1);
                }

                if (mapCE.equals(mapE) && mapCO.equals(mapO)){
                    done[j] = true;
                }
            }
            done[i] = true;
            count++;
        }
        return count;
    }
}