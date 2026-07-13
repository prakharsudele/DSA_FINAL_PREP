class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (Character.isLetterOrDigit(i)) {
                newStr.append(Character.toLowerCase(i));
            }
        }

        int i = 0;
        int j = newStr.length() - 1;

        while(i < j){
            if(newStr.charAt(i) != newStr.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}