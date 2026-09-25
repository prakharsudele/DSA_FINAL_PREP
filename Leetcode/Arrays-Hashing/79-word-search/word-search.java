class Solution {
    boolean flag = false;
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    find(board , word , i , j , n , m , 0);
                }
            }
        }
        return flag;
    }

    private void find(char[][] board, String word , int row , int col , int n , int m , int index){
        if(row < 0 || row >= n || col < 0 || col >= m || board[row][col] != word.charAt(index)) return;

        if(index == word.length()-1){
            flag = true;
            return;
        }

        char temp = board[row][col];
        board[row][col] = '#';
        find(board , word , row+1 , col , n , m , index+1);
        find(board , word , row-1 , col , n , m , index+1);
        find(board , word , row , col+1 , n , m , index+1);
        find(board , word , row , col-1 , n , m , index+1);

        board[row][col] = temp;
    }
}