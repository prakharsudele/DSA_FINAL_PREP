class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); //initialize stack.

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{') st.push(ch); //push opening bracket.
            else{
                if(st.isEmpty()) return false;
                char chs = st.pop(); //pop top element 
                if( (ch == ')' && chs != '(') || (ch == '}' && chs != '{') || (ch == ']' && chs != '[')) return false; //check for mismatch return false.
            }
        }

        if(st.isEmpty()) return true; 
        else return false;
    }
}

//TC --> O(N);
//SC --> O(N);