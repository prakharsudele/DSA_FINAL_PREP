class Solution {
    public String oddString(String[] words) {
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        HashMap<List<Integer>, String> wordMap = new HashMap<>();

        for (String it : words) {
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < it.length() - 1; i++) {
                int diff = (it.charAt(i + 1) - 'a') - (it.charAt(i) - 'a');
                ls.add(diff);
            }
            map.put(ls, map.getOrDefault(ls, 0) + 1);
            wordMap.put(ls , it);
        }

        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return wordMap.get(entry.getKey());
            }
        }
        return "";
    }
}