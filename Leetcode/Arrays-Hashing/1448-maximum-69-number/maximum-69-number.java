class Solution {
    public int maximum69Number (int num) {
        String n = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for(char ch : n.toCharArray()){
            if(ch == '6' && !found){
                found = true;
                sb.append(9);
            }else sb.append(ch);
        }
        return Integer.parseInt(sb.toString());
    }
}