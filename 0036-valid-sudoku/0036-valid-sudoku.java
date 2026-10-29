class Solution {
    public boolean isValidSudoku(char[][] board) {
        // int n= borad.length;
        


        for(int i=0 ;i<9; i++ ){
            for(int j=0 ;j< 9; j++){
                if(board[i][j] != '.'){
                    char ch= board[i][j];
                    board[i][j]='.';
                    if(ischeck(board, i, j, ch)== false) return false;
                    board[i][j]=ch;
                }
            }
        }

        return true;

    }
    public boolean ischeck(char[][]board,int row, int col,char ch){

        for(int i=0; i<9 ;i++){// row 
            if(board[i][col]== ch) return false;
        }
        for(int j=0; j<9 ;j++){// col
            if(board[row][j]== ch) return false;
        }

        int tempR= row/3 *3;
        int tempC= col/3 *3;

        for(int i= tempR ;i<tempR+3; i++){
            for(int j= tempC; j< tempC+3; j++){
                if(board[i][j]== ch) return false;
            }
        }
        return true;
    }
}