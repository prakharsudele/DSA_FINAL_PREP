class Solution {
    public long calculateScore(String s) {
        long score = 0;
        HashMap<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char mirror = (char) ('a' + ('z' - ch));
            if (map.containsKey(mirror) && map.get(mirror).size() > 0) {
                List<Integer> list = map.get(mirror);
                int j = list.remove(list.size() - 1);
                score += (long)i - (long)j;
            } else
                map.computeIfAbsent(ch, key -> new ArrayList<>()).add(i);
        }
        return score;
    }
}