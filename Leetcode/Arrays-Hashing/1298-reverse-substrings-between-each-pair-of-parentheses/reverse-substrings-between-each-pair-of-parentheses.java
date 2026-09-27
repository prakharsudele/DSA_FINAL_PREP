class Solution {
    public String reverseParentheses(String s) {
        //order in which parenthiesis is reversed dosen't matter so we can just figure out all points which need to be reversed and then simply revrese that portion.

        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();//stack to figure out open and close brackets correctly.

        List<List<Integer>> ls = new ArrayList<>();//open , close will be stored.

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch == '(') {
                stack.push(i + 1);
            }

            if (ch == ')') {
                int open = stack.pop();
                ls.add(Arrays.asList(open, i - 1));
            }
        }

        for (List<Integer> it : ls) {
            reverse(it.get(0), it.get(1), sb);//reverse string s from open to close
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : sb.toString().toCharArray()) {
            if (ch != '(' && ch != ')') {//from final answer remove brackets.
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    private void reverse(int open, int close, StringBuilder s) {//function to reverse.
        while (open < close) {
            char temp = s.charAt(open);
            s.setCharAt(open, s.charAt(close));
            s.setCharAt(close, temp);

            open++;
            close--;
        }
    }
}

//TC --> O(N)
//SC --> O(N)