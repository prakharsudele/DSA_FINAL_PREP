class Solution {
    public boolean isValidSudoku(char[][] board) {
        //boolean arrays to check if number 1-9 has arrived yet or not
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') { //if empty skip
                    int num = board[i][j] - '1'; 
                    int boxIndex = (i / 3) * 3 + (j / 3); //getting boxIndex

                    if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                        return false; //if already found retur false;
                    }

                    rows[i][num] = cols[j][num] = boxes[boxIndex][num] = true; //mark these number true as they are seen one time.
                }
            }
        }
        return true;// if all 3 cond satisfy return true.
    }
}

//TC --> O(N^2)
//SC --> O(1) = constant size array of 9.