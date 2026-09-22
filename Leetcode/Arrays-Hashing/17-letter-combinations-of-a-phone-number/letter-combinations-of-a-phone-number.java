class Solution {
    public List<String> letterCombinations(String digits) {
        //store every number and it's cooresponding characters in map. retrive it and run loop on all of it's element using rescusion to build potensial combinations.
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        HashMap<Character , String> map = new HashMap<>();
        map.put('2' ,"abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        comb(ans , map , digits , 0 , new StringBuilder());
        return ans;
    }

    private void comb(List<String> ans , HashMap<Character , String> map , String digits , int index , StringBuilder sb){
        if(index == digits.length()){
            ans.add(sb.toString());
            return;
        }

        String get = map.get(digits.charAt(index));
        for(int i=0;i<get.length();i++){
            sb.append(get.charAt(i));//append digits characters.
            comb(ans , map , digits , index+1 ,sb);//call next digit letter for combination.
            sb.deleteCharAt(sb.length()-1);//delete when coming back.
        }
    }
}

//TC --> O(4^N) each digit has max length of 4.
//SC --> O(N)