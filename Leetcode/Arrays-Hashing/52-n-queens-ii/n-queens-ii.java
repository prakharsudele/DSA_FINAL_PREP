class Solution {
    //same as before just return ans ka size as it contains total number of possible arrangements.
    List<List<String>> ans = new ArrayList<>();
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i] , '.');//make board of pieces empty

        generate(board , 0);//generate a board with valid placement.
        return ans.size();
    }
    private void generate(char[][] board , int row){
        if(row == board.length){//if we have reached our last row correcty we have our answer.
            List<String> list = new ArrayList<>();
            for(int i=0;i<board.length;i++) list.add(new String(board[i]));
            ans.add(list);
            return;
        }

        for(int col=0;col<board[0].length;col++){
            if(isSafe(board , row , col)){//check if placing queen on row , col is safe.
                board[row][col] = 'Q'; //place queen
                generate(board , row + 1); //generate next row
                board[row][col] = '.';//if failure ahead remove queen.
            }
        }
    }

    public boolean isSafe(char[][] board , int row , int col){
        //horizontal 
        for(int i=0;i<board.length;i++){
            if(board[row][i] == 'Q') return false;
        }

        //vertical
        for(int i=0;i<board[0].length;i++){
            if(board[i][col] == 'Q') return false;
        }

        //upper left
        int r = row;
        for(int c = col ; c >=0 && r >= 0 ; r -- , c--){
            if(board[r][c] == 'Q') return false;
        }

        //upper right
        r = row;
        for(int c = col ; r >=0 && c < board[0].length ; r-- , c++){
            if(board[r][c] == 'Q') return false;
        }

        //lower left
        r = row;
        for(int c = col ; r < board.length && c >= 0 ; r++ , c--){
            if(board[r][c] == 'Q') return false;
        }

        //lower right
        r = row;
        for(int c = col ;  r < board.length && c < board[0].length ; r++ , c++){
            if(board[r][c] == 'Q') return false;
        }

        return true;//if safe from everyside return true.
    }
}