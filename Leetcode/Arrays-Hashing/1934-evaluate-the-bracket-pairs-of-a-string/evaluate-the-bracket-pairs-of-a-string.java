class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        HashMap<String , String> map = new HashMap<>();
        for(List<String> it : knowledge) map.put(it.get(0) , it.get(1));

        boolean inside = false;
        String news = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                inside = true;
                continue;
            }

            if(s.charAt(i) == ')'){
                if(!map.containsKey(news)) sb.append('?');
                else sb.append(map.get(news));
                news = "";
                inside = false;
                continue;
            }

            if(inside) news += s.charAt(i);
            else sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}