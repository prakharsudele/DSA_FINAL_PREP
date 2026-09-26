class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        HashMap<String , String> map = new HashMap<>();//map to store all key value pair so it can be accesed in O(1) time.
        for(List<String> it : knowledge) map.put(it.get(0) , it.get(1));

        boolean inside = false;//if we are inside brackets.
        String news = "";//inside string building.

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){//start bracket
                inside = true;
                continue;
            }

            if(s.charAt(i) == ')'){//stop bracket and check condition to figure out answer.
                if(!map.containsKey(news)) sb.append('?');
                else sb.append(map.get(news));
                news = "";
                inside = false;
                continue;
            }

            if(inside) news += s.charAt(i);//if inside build news string.
            else sb.append(s.charAt(i));//if outside brackets add them normally
        }

        return sb.toString();
    }
}

//SC --> O(N)
//TC --> O(N)