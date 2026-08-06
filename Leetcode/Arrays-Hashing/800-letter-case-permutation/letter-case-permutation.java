class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        find(ans , s , 0 , sb);
        return ans;
    }

    private void find(List<String> ans , String s , int index , StringBuilder sb){
        //base case
        if(index == s.length()){
            ans.add(sb.toString());
            return;
        }

        //if alphabet
        if(Character.isLetter(s.charAt(index))){
            //change 
            if(Character.isLowerCase(s.charAt(index))){
                sb.append(Character.toUpperCase(s.charAt(index)));
            }else{
                sb.append(Character.toLowerCase(s.charAt(index)));
            }
            find(ans , s , index+1 , sb);
            sb.deleteCharAt(sb.length() - 1);

            //keep same
            sb.append(s.charAt(index));
            find(ans , s , index+1 , sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        //otherwise simply add as it is
        else{
            sb.append(s.charAt(index));
            find(ans , s , index+1 , sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}