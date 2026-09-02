class Solution {
    public boolean isPalindrome(String s) {
        //we are going to create an stringbuilder with no spaces and lower case character only afterwards we will check if it's an plaidrome with help of 2 pointers.

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){ //check if it's alphanumeric character
                sb.append(Character.toLowerCase(ch));//add it in lowercase
            }
        }

        int i=0,j=sb.length()-1;
        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)) return false; //check for palidrome
            i++;
            j--;
        }

        return true;
    }
}

//TC --> O(N)
//SC --> O(1)