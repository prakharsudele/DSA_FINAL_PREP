class Solution {
    //use dfs traversal + backtracking to visit all cells whenever found start of string run dfs from there to check if it can make full word.
    boolean flag = false;
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    find(board , word , i , j , n , m , 0);//start of word run dfs from here.
                }
            }
        }
        return flag;
    }

    private void find(char[][] board, String word , int row , int col , int n , int m , int index){
        if(row < 0 || row >= n || col < 0 || col >= m || board[row][col] != word.charAt(index)) return;

        if(index == word.length()-1){//reached at the end of word then we got our answer.
            flag = true;
            return;
        }

        char temp = board[row][col];//we will reuse same character multiple times hence we need to mark this as visited while backtracking we will change this back to normal if it's not our answer.
        board[row][col] = '#';
        find(board , word , row+1 , col , n , m , index+1);
        find(board , word , row-1 , col , n , m , index+1);
        find(board , word , row , col+1 , n , m , index+1);
        find(board , word , row , col-1 , n , m , index+1);

        board[row][col] = temp;//back to nornal answer not found yet.
    }
}

//TC --> O()
//SC --> O()