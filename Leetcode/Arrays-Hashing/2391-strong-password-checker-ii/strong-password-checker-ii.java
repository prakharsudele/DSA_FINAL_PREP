class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8)return false; //cond 1.

        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;
        
        for(int i=0;i<password.length();i++){
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')lower = true;//cond2
            else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')upper = true;//cond3
            else if(password.charAt(i) >= '0'  && password.charAt(i) <= '9')digit = true;//cond4
            else special = true;//cond5
            if(i<password.length()-1){
                if(password.charAt(i) == password.charAt(i+1)) return false;//cond6
            }
        }

        if(lower && upper && digit && special)return true;
        return false;
    }
}

//TC --> O(N)
//SC --> O(1)